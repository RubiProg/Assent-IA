package com.assentia.app.data.repository

import com.assentia.app.data.datasource.MockDataSource
import com.assentia.app.domain.model.*
import com.assentia.app.domain.repository.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import java.time.LocalDate
import javax.inject.Inject
import javax.inject.Singleton

// ─── AUTH ──────────────────────────────────────────────────────────────────

@Singleton
class AuthRepositoryImpl @Inject constructor(
    private val mock: MockDataSource
) : AuthRepository {

    private val _currentUser = MutableStateFlow<User?>(null)

    override suspend fun login(email: String, password: String): Result<User> {
        val expectedPassword = mock.passwords[email]
        val user = mock.users.find { it.email == email }

        return when {
            user == null -> Result.failure(Exception("Usuario no encontrado"))
            expectedPassword != password -> Result.failure(Exception("Contraseña incorrecta"))
            !user.activo -> Result.failure(Exception("Usuario desactivado"))
            else -> {
                _currentUser.value = user
                Result.success(user)
            }
        }
    }

    override suspend fun logout() {
        _currentUser.value = null
    }

    override fun getCurrentUser(): Flow<User?> = _currentUser

    override suspend fun isLoggedIn(): Boolean = _currentUser.value != null
}

// ─── USUARIO ───────────────────────────────────────────────────────────────

@Singleton
class UserRepositoryImpl @Inject constructor(
    private val mock: MockDataSource
) : UserRepository {

    override suspend fun getAllUsers(): Result<List<User>> =
        Result.success(mock.users.toList())

    override suspend fun getUserById(id: String): Result<User> {
        val user = mock.users.find { it.id == id }
        return user?.let { Result.success(it) }
            ?: Result.failure(Exception("Usuario no encontrado"))
    }

    override suspend fun getUsersByRol(rol: UserRole): Result<List<User>> =
        Result.success(mock.users.filter { it.rol == rol })

    override suspend fun createUser(user: User, password: String): Result<User> {
        if (mock.users.any { it.email == user.email }) {
            return Result.failure(Exception("El email ya está en uso"))
        }
        mock.users.add(user)
        mock.passwords.toMutableMap()[user.email] = password
        return Result.success(user)
    }

    override suspend fun updateUser(user: User): Result<User> {
        val index = mock.users.indexOfFirst { it.id == user.id }
        return if (index >= 0) {
            mock.users[index] = user
            Result.success(user)
        } else {
            Result.failure(Exception("Usuario no encontrado"))
        }
    }

    override suspend fun deleteUser(id: String): Result<Unit> {
        val removed = mock.users.removeIf { it.id == id }
        return if (removed) Result.success(Unit)
        else Result.failure(Exception("Usuario no encontrado"))
    }
}

// ─── PACIENTE ──────────────────────────────────────────────────────────────

@Singleton
class PacienteRepositoryImpl @Inject constructor(
    private val mock: MockDataSource
) : PacienteRepository {

    private val _pacientes = MutableStateFlow(mock.pacientes.toList())

    override fun getAllPacientes(): Flow<List<Paciente>> = _pacientes

    override suspend fun getPacienteById(id: String): Result<Paciente> {
        val paciente = mock.pacientes.find { it.id == id }
        return paciente?.let { Result.success(it) }
            ?: Result.failure(Exception("Paciente no encontrado"))
    }

    override suspend fun getPacientesByCuidador(cuidadorId: String): Result<List<Paciente>> =
        Result.success(mock.pacientes.filter { it.cuidadorAsignadoId == cuidadorId })

    override suspend fun getPacientesByFamiliar(familiarId: String): Result<List<Paciente>> =
        Result.success(mock.pacientes.filter { familiarId in it.familiaresIds })

    override suspend fun createPaciente(paciente: Paciente): Result<Paciente> {
        mock.pacientes.add(paciente)
        _pacientes.value = mock.pacientes.toList()
        return Result.success(paciente)
    }

    override suspend fun updatePaciente(paciente: Paciente): Result<Paciente> {
        val index = mock.pacientes.indexOfFirst { it.id == paciente.id }
        return if (index >= 0) {
            mock.pacientes[index] = paciente
            _pacientes.value = mock.pacientes.toList()
            Result.success(paciente)
        } else {
            Result.failure(Exception("Paciente no encontrado"))
        }
    }

    override suspend fun deletePaciente(id: String): Result<Unit> {
        val removed = mock.pacientes.removeIf { it.id == id }
        if (removed) _pacientes.value = mock.pacientes.toList()
        return if (removed) Result.success(Unit)
        else Result.failure(Exception("Paciente no encontrado"))
    }
}

// ─── VISITA ────────────────────────────────────────────────────────────────

@Singleton
class VisitaRepositoryImpl @Inject constructor(
    private val mock: MockDataSource
) : VisitaRepository {

    private val _visitas = MutableStateFlow(mock.visitas.toList())

    override fun getVisitasByCuidador(cuidadorId: String): Flow<List<Visita>> =
        _visitas.map { it.filter { v -> v.cuidadorId == cuidadorId } }

    override fun getVisitasByPaciente(pacienteId: String): Flow<List<Visita>> =
        _visitas.map { it.filter { v -> v.pacienteId == pacienteId } }

    override suspend fun getVisitasByFecha(cuidadorId: String, fecha: LocalDate): Result<List<Visita>> =
        Result.success(
            mock.visitas.filter {
                it.cuidadorId == cuidadorId &&
                it.fechaHoraInicio.toLocalDate() == fecha
            }
        )

    override suspend fun getVisitaById(id: String): Result<Visita> {
        val visita = mock.visitas.find { it.id == id }
        return visita?.let { Result.success(it) }
            ?: Result.failure(Exception("Visita no encontrada"))
    }

    override suspend fun createVisita(visita: Visita): Result<Visita> {
        mock.visitas.add(visita)
        _visitas.value = mock.visitas.toList()
        return Result.success(visita)
    }

    override suspend fun updateVisita(visita: Visita): Result<Visita> {
        val index = mock.visitas.indexOfFirst { it.id == visita.id }
        return if (index >= 0) {
            mock.visitas[index] = visita
            _visitas.value = mock.visitas.toList()
            Result.success(visita)
        } else {
            Result.failure(Exception("Visita no encontrada"))
        }
    }

    override suspend fun iniciarVisita(visitaId: String): Result<Visita> {
        val index = mock.visitas.indexOfFirst { it.id == visitaId }
        return if (index >= 0) {
            val updated = mock.visitas[index].copy(estado = EstadoVisita.EN_CURSO)
            mock.visitas[index] = updated
            _visitas.value = mock.visitas.toList()
            Result.success(updated)
        } else {
            Result.failure(Exception("Visita no encontrada"))
        }
    }

    override suspend fun completarVisita(
        visitaId: String,
        firma: String?,
        observaciones: String
    ): Result<Visita> {
        val index = mock.visitas.indexOfFirst { it.id == visitaId }
        return if (index >= 0) {
            val updated = mock.visitas[index].copy(
                estado = EstadoVisita.COMPLETADA,
                firmaDigital = firma,
                observaciones = observaciones
            )
            mock.visitas[index] = updated
            _visitas.value = mock.visitas.toList()
            Result.success(updated)
        } else {
            Result.failure(Exception("Visita no encontrada"))
        }
    }

    override suspend fun cancelarVisita(visitaId: String, motivo: String): Result<Visita> {
        val index = mock.visitas.indexOfFirst { it.id == visitaId }
        return if (index >= 0) {
            val updated = mock.visitas[index].copy(
                estado = EstadoVisita.CANCELADA,
                observaciones = motivo
            )
            mock.visitas[index] = updated
            _visitas.value = mock.visitas.toList()
            Result.success(updated)
        } else {
            Result.failure(Exception("Visita no encontrada"))
        }
    }

    override suspend fun completarTarea(visitaId: String, tareaId: String): Result<Visita> {
        val visitaIndex = mock.visitas.indexOfFirst { it.id == visitaId }
        if (visitaIndex < 0) return Result.failure(Exception("Visita no encontrada"))

        val visita = mock.visitas[visitaIndex]
        val tareasActualizadas = visita.tareas.map { tarea ->
            if (tarea.id == tareaId) tarea.copy(
                completada = true,
                horaCompletada = java.time.LocalDateTime.now()
            )
            else tarea
        }
        val updated = visita.copy(tareas = tareasActualizadas)
        mock.visitas[visitaIndex] = updated
        _visitas.value = mock.visitas.toList()
        return Result.success(updated)
    }
}

// ─── MEDICACIÓN ────────────────────────────────────────────────────────────

@Singleton
class MedicacionRepositoryImpl @Inject constructor(
    private val mock: MockDataSource
) : MedicacionRepository {

    private val _registros = MutableStateFlow<List<RegistroMedicacion>>(emptyList())

    override fun getMedicacionByPaciente(pacienteId: String): Flow<List<Medicacion>> = flow {
        emit(mock.medicaciones.filter { it.pacienteId == pacienteId })
    }

    override suspend fun registrarAdministracion(
        registro: RegistroMedicacion
    ): Result<RegistroMedicacion> {
        val current = _registros.value.toMutableList()
        current.add(registro)
        _registros.value = current
        return Result.success(registro)
    }

    override suspend fun getRegistrosByVisita(visitaId: String): Result<List<RegistroMedicacion>> =
        Result.success(_registros.value.filter { it.visitaId == visitaId })

    override fun observeRegistrosByVisita(visitaId: String): Flow<List<RegistroMedicacion>> =
        _registros.map { list -> list.filter { it.visitaId == visitaId } }

    override suspend fun createMedicacion(medicacion: Medicacion): Result<Medicacion> {
        mock.medicaciones.add(medicacion)
        return Result.success(medicacion)
    }

    override suspend fun updateMedicacion(medicacion: Medicacion): Result<Medicacion> {
        val index = mock.medicaciones.indexOfFirst { it.id == medicacion.id }
        return if (index >= 0) {
            mock.medicaciones[index] = medicacion
            Result.success(medicacion)
        } else {
            Result.failure(Exception("Medicación no encontrada"))
        }
    }
}

// ─── INCIDENCIA ────────────────────────────────────────────────────────────

@Singleton
class IncidenciaRepositoryImpl @Inject constructor(
    private val mock: MockDataSource
) : IncidenciaRepository {

    private val _incidencias = MutableStateFlow(mock.incidencias.toList())

    override fun getIncidenciasByPaciente(pacienteId: String): Flow<List<Incidencia>> =
        _incidencias.map { it.filter { i -> i.pacienteId == pacienteId } }

    override fun getIncidenciasByCuidador(cuidadorId: String): Flow<List<Incidencia>> =
        _incidencias.map { it.filter { i -> i.cuidadorId == cuidadorId } }

    override fun getAllIncidenciasAbiertas(): Flow<List<Incidencia>> =
        _incidencias.map { it.filter { i -> i.estado == EstadoIncidencia.ABIERTA } }

    override suspend fun createIncidencia(incidencia: Incidencia): Result<Incidencia> {
        mock.incidencias.add(incidencia)
        _incidencias.value = mock.incidencias.toList()
        return Result.success(incidencia)
    }

    override suspend fun updateEstado(id: String, estado: EstadoIncidencia): Result<Incidencia> {
        val index = mock.incidencias.indexOfFirst { it.id == id }
        return if (index >= 0) {
            val updated = mock.incidencias[index].copy(estado = estado)
            mock.incidencias[index] = updated
            _incidencias.value = mock.incidencias.toList()
            Result.success(updated)
        } else {
            Result.failure(Exception("Incidencia no encontrada"))
        }
    }
}

// ─── MENSAJE ───────────────────────────────────────────────────────────────

@Singleton
class MensajeRepositoryImpl @Inject constructor(
    private val mock: MockDataSource
) : MensajeRepository {

    private val _mensajes = MutableStateFlow(mock.mensajes.toList())

    override fun getMensajesByPaciente(pacienteId: String, userId: String): Flow<List<Mensaje>> =
        _mensajes.map { lista ->
            lista.filter { it.pacienteId == pacienteId &&
                (it.remitenteId == userId || it.destinatarioId == userId) }
                .sortedBy { it.fechaHora }
        }

    override suspend fun enviarMensaje(mensaje: Mensaje): Result<Mensaje> {
        mock.mensajes.add(mensaje)
        _mensajes.value = mock.mensajes.toList()
        return Result.success(mensaje)
    }

    override suspend fun marcarComoLeido(mensajeId: String): Result<Unit> {
        val index = mock.mensajes.indexOfFirst { it.id == mensajeId }
        if (index >= 0) {
            mock.mensajes[index] = mock.mensajes[index].copy(leido = true)
            _mensajes.value = mock.mensajes.toList()
        }
        return Result.success(Unit)
    }

    override fun getUnreadCount(userId: String): Flow<Int> =
        _mensajes.map { lista ->
            lista.count { it.destinatarioId == userId && !it.leido }
        }
}

// ─── VALORACIÓN ────────────────────────────────────────────────────────────

@Singleton
class ValoracionRepositoryImpl @Inject constructor() : ValoracionRepository {

    private val valoraciones = mutableListOf<Valoracion>()

    override suspend fun createValoracion(valoracion: Valoracion): Result<Valoracion> {
        valoraciones.add(valoracion)
        return Result.success(valoracion)
    }

    override suspend fun getValoracionesByCuidador(cuidadorId: String): Result<List<Valoracion>> =
        Result.success(valoraciones.filter { it.cuidadorId == cuidadorId })

    override suspend fun getPromedioValoracion(cuidadorId: String): Result<Double> {
        val lista = valoraciones.filter { it.cuidadorId == cuidadorId }
        return if (lista.isEmpty()) Result.success(0.0)
        else Result.success(lista.map { it.puntuacion }.average())
    }
}
