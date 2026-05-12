package com.assentia.app.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.assentia.app.domain.model.*
import com.assentia.app.domain.repository.*
import com.assentia.app.domain.usecase.*
import com.assentia.app.presentation.state.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject

// ═══════════════════════════════════════════════════════════════════════════
// AUTH VIEW MODEL
// ═══════════════════════════════════════════════════════════════════════════

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase,
    private val logoutUseCase: LogoutUseCase,
    private val getCurrentUserUseCase: GetCurrentUserUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    val currentUser: StateFlow<User?> = getCurrentUserUseCase()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    fun login(email: String, password: String) {
        // Validación básica en ViewModel
        val emailError = if (email.isBlank()) "El email es obligatorio" else null
        val passwordError = if (password.isBlank()) "La contraseña es obligatoria" else null

        if (emailError != null || passwordError != null) {
            _uiState.update { it.copy(emailError = emailError, passwordError = passwordError) }
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }
            loginUseCase(email, password)
                .onSuccess { user ->
                    _uiState.update { it.copy(isLoading = false, user = user) }
                }
                .onFailure { error ->
                    _uiState.update { it.copy(isLoading = false, error = error.message) }
                }
        }
    }

    fun logout() {
        viewModelScope.launch { 
            logoutUseCase()
            _uiState.update { LoginUiState() }
        }
    }

    fun clearErrors() {
        _uiState.update { it.copy(error = null, emailError = null, passwordError = null) }
    }
}

// ═══════════════════════════════════════════════════════════════════════════
// CUIDADOR - AGENDA VIEW MODEL
// ═══════════════════════════════════════════════════════════════════════════

@HiltViewModel
class AgendaViewModel @Inject constructor(
    private val getVisitasHoyUseCase: GetVisitasHoyUseCase,
    private val getVisitasByCuidadorUseCase: GetVisitasByCuidadorUseCase,
    private val getAllPacientesUseCase: GetAllPacientesUseCase,
    private val iniciarVisitaUseCase: IniciarVisitaUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(AgendaUiState())
    val uiState: StateFlow<AgendaUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            getAllPacientesUseCase().collect { lista ->
                val mapa = lista.associateBy { it.id }
                _uiState.update { it.copy(pacientes = mapa) }
            }
        }
    }

    fun cargarAgenda(cuidadorId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            getVisitasHoyUseCase(cuidadorId)
                .onSuccess { visitas ->
                    _uiState.update { it.copy(isLoading = false, visitasHoy = visitas) }
                }
                .onFailure { error ->
                    _uiState.update { it.copy(isLoading = false, error = error.message) }
                }
        }
    }

    fun iniciarVisita(visitaId: String) {
        viewModelScope.launch {
            iniciarVisitaUseCase(visitaId)
                .onSuccess { visita ->
                    _uiState.update { state ->
                        val updated = state.visitasHoy.map {
                            if (it.id == visitaId) visita else it
                        }
                        state.copy(visitasHoy = updated, visitaIniciada = visita)
                    }
                }
                .onFailure { error ->
                    _uiState.update { it.copy(error = error.message) }
                }
        }
    }

    fun clearVisitaIniciada() {
        _uiState.update { it.copy(visitaIniciada = null) }
    }
}

// ═══════════════════════════════════════════════════════════════════════════
// CUIDADOR - DETALLE VISITA VIEW MODEL
// ═══════════════════════════════════════════════════════════════════════════

@HiltViewModel
class DetalleVisitaViewModel @Inject constructor(
    private val getVisitaByIdUseCase: GetVisitaByIdUseCase,
    private val getPacienteByIdUseCase: GetPacienteByIdUseCase,
    private val iniciarVisitaUseCase: IniciarVisitaUseCase,
    private val completarVisitaUseCase: CompletarVisitaUseCase,
    private val completarTareaUseCase: CompletarTareaUseCase,
    private val getMedicacionPacienteUseCase: GetMedicacionPacienteUseCase,
    private val getRegistrosMedicacionUseCase: GetRegistrosMedicacionUseCase,
    private val registrarMedicacionUseCase: RegistrarMedicacionUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(DetalleVisitaUiState())
    val uiState: StateFlow<DetalleVisitaUiState> = _uiState.asStateFlow()

    fun cargarDatos(visitaId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            
            getVisitaByIdUseCase(visitaId).onSuccess { visita ->
                getPacienteByIdUseCase(visita.pacienteId).onSuccess { paciente ->
                    _uiState.update { it.copy(
                        isLoading = false,
                        visita = visita,
                        paciente = paciente
                    )}
                    
                    // Cargar medicación
                    launch {
                        getMedicacionPacienteUseCase(paciente.id).collect { medicaciones ->
                            _uiState.update { it.copy(medicaciones = medicaciones) }
                        }
                    }

                    // Cargar registros de esta visita
                    launch {
                        getRegistrosMedicacionUseCase(visitaId).collect { registros ->
                            _uiState.update { it.copy(registros = registros) }
                        }
                    }
                }
            }.onFailure { error ->
                _uiState.update { it.copy(isLoading = false, error = error.message) }
            }
        }
    }

    fun iniciarVisita() {
        val visitaId = _uiState.value.visita?.id ?: return
        viewModelScope.launch {
            iniciarVisitaUseCase(visitaId).onSuccess { visitaActualizada ->
                _uiState.update { it.copy(visita = visitaActualizada) }
            }.onFailure { error ->
                _uiState.update { it.copy(error = error.message) }
            }
        }
    }

    fun completarTarea(tareaId: String) {
        val visitaId = _uiState.value.visita?.id ?: return
        viewModelScope.launch {
            completarTareaUseCase(visitaId, tareaId)
                .onSuccess { visitaActualizada ->
                    _uiState.update { it.copy(visita = visitaActualizada) }
                }
                .onFailure { error ->
                    _uiState.update { it.copy(error = error.message) }
                }
        }
    }

    fun registrarMedicacion(
        medicacionId: String,
        pacienteId: String,
        cuidadorId: String,
        administrada: Boolean,
        observaciones: String = ""
    ) {
        val visitaId = _uiState.value.visita?.id
        if (visitaId == null) {
            _uiState.update { it.copy(error = "No hay una visita activa") }
            return
        }
        
        viewModelScope.launch {
            registrarMedicacionUseCase(medicacionId, visitaId, pacienteId, cuidadorId, administrada, observaciones)
                .onFailure { error ->
                    _uiState.update { it.copy(error = error.message) }
                }
        }
    }

    fun completarVisita(firma: String?, observaciones: String) {
        val visitaId = _uiState.value.visita?.id ?: return
        viewModelScope.launch {
            _uiState.update { it.copy(isSaving = true) }
            completarVisitaUseCase(visitaId, firma, observaciones)
                .onSuccess {
                    _uiState.update { it.copy(isSaving = false, visitaCompletada = true) }
                }
                .onFailure { error ->
                    _uiState.update { it.copy(isSaving = false, error = error.message) }
                }
        }
    }

    fun clearError() {
        _uiState.update { it.copy(error = null) }
    }
}

// ═══════════════════════════════════════════════════════════════════════════
// INCIDENCIAS VIEW MODEL
// ═══════════════════════════════════════════════════════════════════════════

@HiltViewModel
class IncidenciasViewModel @Inject constructor(
    private val getIncidenciasByPacienteUseCase: GetIncidenciasByPacienteUseCase,
    private val getIncidenciasAbiertasUseCase: GetIncidenciasAbiertasUseCase,
    private val createIncidenciaUseCase: CreateIncidenciaUseCase,
    private val resolverIncidenciaUseCase: ResolverIncidenciaUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(IncidenciasUiState())
    val uiState: StateFlow<IncidenciasUiState> = _uiState.asStateFlow()

    private val _nuevaState = MutableStateFlow(NuevaIncidenciaUiState())
    val nuevaState: StateFlow<NuevaIncidenciaUiState> = _nuevaState.asStateFlow()

    fun cargarIncidencias(pacienteId: String?) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            val flow = if (pacienteId != null) {
                getIncidenciasByPacienteUseCase(pacienteId)
            } else {
                getIncidenciasAbiertasUseCase()
            }
            
            flow.collect { lista ->
                _uiState.update { it.copy(incidencias = lista, isLoading = false) }
            }
        }
    }

    fun crearIncidencia(
        pacienteId: String,
        cuidadorId: String,
        visitaId: String?,
        titulo: String,
        descripcion: String,
        gravedad: GravedadIncidencia,
        fotoUrl: String? = null
    ) {
        viewModelScope.launch {
            _nuevaState.update { it.copy(isLoading = true) }
            createIncidenciaUseCase(pacienteId, cuidadorId, visitaId, titulo, descripcion, gravedad, fotoUrl)
                .onSuccess {
                    _nuevaState.update { it.copy(isLoading = false, guardado = true) }
                }
                .onFailure { error ->
                    _nuevaState.update { it.copy(isLoading = false, error = error.message) }
                }
        }
    }

    fun resolverIncidencia(id: String) {
        viewModelScope.launch {
            resolverIncidenciaUseCase(id)
                .onSuccess { actualizada ->
                    _uiState.update { state ->
                        state.copy(incidencias = state.incidencias.map {
                            if (it.id == id) actualizada else it
                        })
                    }
                }
        }
    }

    fun setGravedad(gravedad: GravedadIncidencia) {
        _nuevaState.update { it.copy(gravedad = gravedad) }
    }

    fun clearError() {
        _nuevaState.update { it.copy(error = null) }
    }
}

// ═══════════════════════════════════════════════════════════════════════════
// ADMIN - DASHBOARD VIEW MODEL
// ═══════════════════════════════════════════════════════════════════════════

@HiltViewModel
class AdminDashboardViewModel @Inject constructor(
    private val getAllPacientesUseCase: GetAllPacientesUseCase,
    private val getIncidenciasAbiertasUseCase: GetIncidenciasAbiertasUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(AdminDashboardUiState())
    val uiState: StateFlow<AdminDashboardUiState> = _uiState.asStateFlow()

    fun cargarDashboard() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }

            // Pacientes
            getAllPacientesUseCase().collect { pacientes ->
                _uiState.update { it.copy(totalPacientes = pacientes.size) }
            }
        }

        viewModelScope.launch {
            // Incidencias abiertas
            getIncidenciasAbiertasUseCase().collect { incidencias ->
                _uiState.update { state ->
                    state.copy(
                        isLoading = false,
                        incidenciasAbiertas = incidencias.size,
                        incidenciasRecientes = incidencias.take(5)
                    )
                }
            }
        }
    }
}

// ═══════════════════════════════════════════════════════════════════════════
// ADMIN - PACIENTES VIEW MODEL
// ═══════════════════════════════════════════════════════════════════════════

@HiltViewModel
class PacientesViewModel @Inject constructor(
    private val getAllPacientesUseCase: GetAllPacientesUseCase,
    private val createPacienteUseCase: CreatePacienteUseCase,
    private val updatePacienteUseCase: UpdatePacienteUseCase,
    private val userRepository: UserRepository,
    private val medicacionRepository: MedicacionRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(PacientesUiState())
    val uiState: StateFlow<PacientesUiState> = _uiState.asStateFlow()

    private val _cuidadores = MutableStateFlow<List<User>>(emptyList())
    val cuidadores: StateFlow<List<User>> = _cuidadores.asStateFlow()

    private val _guardadoExitoso = MutableSharedFlow<Boolean>()
    val guardadoExitoso = _guardadoExitoso.asSharedFlow()

    private var todosLosPacientes: List<Paciente> = emptyList()

    fun cargarPacientes() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            getAllPacientesUseCase().collect { pacientes ->
                todosLosPacientes = pacientes
                _uiState.update { state ->
                    state.copy(
                        isLoading = false,
                        pacientes = filtrar(pacientes, state.query)
                    )
                }
            }
        }
    }

    fun cargarCuidadores() {
        viewModelScope.launch {
            userRepository.getUsersByRol(UserRole.CUIDADOR).onSuccess { list ->
                _cuidadores.value = list
            }
        }
    }

    fun buscar(query: String) {
        _uiState.update { it.copy(query = query, pacientes = filtrar(todosLosPacientes, query)) }
    }

    private fun filtrar(pacientes: List<Paciente>, query: String): List<Paciente> {
        if (query.isBlank()) return pacientes
        val q = query.lowercase()
        return pacientes.filter {
            it.nombre.lowercase().contains(q) ||
            it.apellidos.lowercase().contains(q) ||
            it.direccion.lowercase().contains(q)
        }
    }

    fun crearPacienteCompleto(
        paciente: Paciente,
        familiarNombre: String,
        familiarEmail: String,
        familiarTelefono: String,
        medicacionNombre: String,
        medicacionDosis: String
    ) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            // 1. Crear usuario familiar
            val familiar = User(
                id = UUID.randomUUID().toString(),
                nombre = familiarNombre,
                apellidos = "",
                email = familiarEmail,
                telefono = familiarTelefono,
                rol = UserRole.FAMILIAR
            )
            
            userRepository.createUser(familiar, "familiar123").onSuccess { familiarCreado ->
                // 2. Crear paciente con el ID del familiar
                val pacienteConFamiliar = paciente.copy(
                    familiaresIds = listOf(familiarCreado.id)
                )
                
                createPacienteUseCase(pacienteConFamiliar).onSuccess { pacienteCreado ->
                    // 3. Crear medicación si existe
                    if (medicacionNombre.isNotBlank()) {
                        val medicacion = Medicacion(
                            id = UUID.randomUUID().toString(),
                            pacienteId = pacienteCreado.id,
                            nombre = medicacionNombre,
                            dosis = medicacionDosis,
                            frecuencia = Frecuencia.DIARIA,
                            horasToma = listOf("09:00")
                        )
                        medicacionRepository.createMedicacion(medicacion)
                    }
                    
                    _uiState.update { it.copy(isLoading = false) }
                    _guardadoExitoso.emit(true)
                    
                }.onFailure { error ->
                    _uiState.update { it.copy(isLoading = false, error = "Error al crear paciente: ${error.message}") }
                }
            }.onFailure { error ->
                _uiState.update { it.copy(isLoading = false, error = "Error al crear familiar: ${error.message}") }
            }
        }
    }

    fun crearPaciente(paciente: Paciente) {
        viewModelScope.launch {
            createPacienteUseCase(paciente)
                .onFailure { error ->
                    _uiState.update { it.copy(error = error.message) }
                }
        }
    }
}

// ═══════════════════════════════════════════════════════════════════════════
// FAMILIAR - HOME VIEW MODEL
// ═══════════════════════════════════════════════════════════════════════════

@HiltViewModel
class FamiliarHomeViewModel @Inject constructor(
    private val getPacientesByFamiliarUseCase: GetPacientesByFamiliarUseCase,
    private val getVisitasByPacienteUseCase: GetVisitasByPacienteUseCase,
    private val getUnreadCountUseCase: GetUnreadCountUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(FamiliarHomeUiState())
    val uiState: StateFlow<FamiliarHomeUiState> = _uiState.asStateFlow()

    fun cargarHome(familiarId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }

            getPacientesByFamiliarUseCase(familiarId)
                .onSuccess { pacientes ->
                    _uiState.update { it.copy(pacientes = pacientes, isLoading = false) }

                    // Cargar visitas del primer paciente
                    pacientes.firstOrNull()?.let { paciente ->
                        getVisitasByPacienteUseCase(paciente.id).collect { visitas ->
                            val activa = visitas.find { it.estado == EstadoVisita.EN_CURSO }
                            val ultima = visitas.filter { it.estado == EstadoVisita.COMPLETADA }
                                .maxByOrNull { it.fechaHoraFin }
                            _uiState.update { it.copy(visitaActiva = activa, ultimaVisita = ultima) }
                        }
                    }
                }
                .onFailure { error ->
                    _uiState.update { it.copy(isLoading = false, error = error.message) }
                }
        }

        viewModelScope.launch {
            getUnreadCountUseCase(familiarId).collect { count ->
                _uiState.update { it.copy(mensajesNoLeidos = count) }
            }
        }
    }
}

// ═══════════════════════════════════════════════════════════════════════════
// CHAT VIEW MODEL
// ═══════════════════════════════════════════════════════════════════════════

@HiltViewModel
class ChatViewModel @Inject constructor(
    private val getMensajesUseCase: GetMensajesUseCase,
    private val enviarMensajeUseCase: EnviarMensajeUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(ChatUiState())
    val uiState: StateFlow<ChatUiState> = _uiState.asStateFlow()

    fun cargarMensajes(pacienteId: String, userId: String) {
        viewModelScope.launch {
            getMensajesUseCase(pacienteId, userId).collect { mensajes ->
                _uiState.update { it.copy(mensajes = mensajes, isLoading = false) }
            }
        }
    }

    fun actualizarTexto(texto: String) {
        _uiState.update { it.copy(textoActual = texto) }
    }

    fun enviarMensaje(remitenteId: String, destinatarioId: String, pacienteId: String) {
        val texto = _uiState.value.textoActual.trim()
        if (texto.isBlank()) return

        viewModelScope.launch {
            _uiState.update { it.copy(isSending = true, textoActual = "") }
            enviarMensajeUseCase(remitenteId, destinatarioId, pacienteId, texto)
                .onFailure { error ->
                    _uiState.update { it.copy(isSending = false, error = error.message) }
                }
            _uiState.update { it.copy(isSending = false) }
        }
    }
}
