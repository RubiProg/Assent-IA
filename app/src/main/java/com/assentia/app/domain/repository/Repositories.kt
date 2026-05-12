package com.assentia.app.domain.repository

import com.assentia.app.domain.model.*
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

// ─── AUTH ──────────────────────────────────────────────────────────────────

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<User>
    suspend fun logout()
    fun getCurrentUser(): Flow<User?>
    suspend fun isLoggedIn(): Boolean
}

// ─── USUARIO ───────────────────────────────────────────────────────────────

interface UserRepository {
    suspend fun getAllUsers(): Result<List<User>>
    suspend fun getUserById(id: String): Result<User>
    suspend fun getUsersByRol(rol: UserRole): Result<List<User>>
    suspend fun createUser(user: User, password: String): Result<User>
    suspend fun updateUser(user: User): Result<User>
    suspend fun deleteUser(id: String): Result<Unit>
}

// ─── PACIENTE ──────────────────────────────────────────────────────────────

interface PacienteRepository {
    fun getAllPacientes(): Flow<List<Paciente>>
    suspend fun getPacienteById(id: String): Result<Paciente>
    suspend fun getPacientesByCuidador(cuidadorId: String): Result<List<Paciente>>
    suspend fun getPacientesByFamiliar(familiarId: String): Result<List<Paciente>>
    suspend fun createPaciente(paciente: Paciente): Result<Paciente>
    suspend fun updatePaciente(paciente: Paciente): Result<Paciente>
    suspend fun deletePaciente(id: String): Result<Unit>
}

// ─── VISITA ────────────────────────────────────────────────────────────────

interface VisitaRepository {
    fun getVisitasByCuidador(cuidadorId: String): Flow<List<Visita>>
    fun getVisitasByPaciente(pacienteId: String): Flow<List<Visita>>
    suspend fun getVisitasByFecha(cuidadorId: String, fecha: LocalDate): Result<List<Visita>>
    suspend fun getVisitaById(id: String): Result<Visita>
    suspend fun createVisita(visita: Visita): Result<Visita>
    suspend fun updateVisita(visita: Visita): Result<Visita>
    suspend fun iniciarVisita(visitaId: String): Result<Visita>
    suspend fun completarVisita(visitaId: String, firma: String?, observaciones: String): Result<Visita>
    suspend fun cancelarVisita(visitaId: String, motivo: String): Result<Visita>
    suspend fun completarTarea(visitaId: String, tareaId: String): Result<Visita>
}

// ─── MEDICACIÓN ────────────────────────────────────────────────────────────

interface MedicacionRepository {
    fun getMedicacionByPaciente(pacienteId: String): Flow<List<Medicacion>>
    suspend fun registrarAdministracion(registro: RegistroMedicacion): Result<RegistroMedicacion>
    suspend fun getRegistrosByVisita(visitaId: String): Result<List<RegistroMedicacion>>
    fun observeRegistrosByVisita(visitaId: String): Flow<List<RegistroMedicacion>>
    suspend fun createMedicacion(medicacion: Medicacion): Result<Medicacion>
    suspend fun updateMedicacion(medicacion: Medicacion): Result<Medicacion>
}

// ─── INCIDENCIA ────────────────────────────────────────────────────────────

interface IncidenciaRepository {
    fun getIncidenciasByPaciente(pacienteId: String): Flow<List<Incidencia>>
    fun getIncidenciasByCuidador(cuidadorId: String): Flow<List<Incidencia>>
    fun getAllIncidenciasAbiertas(): Flow<List<Incidencia>>
    suspend fun createIncidencia(incidencia: Incidencia): Result<Incidencia>
    suspend fun updateEstado(id: String, estado: EstadoIncidencia): Result<Incidencia>
}

// ─── MENSAJE ───────────────────────────────────────────────────────────────

interface MensajeRepository {
    fun getMensajesByPaciente(pacienteId: String, userId: String): Flow<List<Mensaje>>
    suspend fun enviarMensaje(mensaje: Mensaje): Result<Mensaje>
    suspend fun marcarComoLeido(mensajeId: String): Result<Unit>
    fun getUnreadCount(userId: String): Flow<Int>
}

// ─── VALORACIÓN ────────────────────────────────────────────────────────────

interface ValoracionRepository {
    suspend fun createValoracion(valoracion: Valoracion): Result<Valoracion>
    suspend fun getValoracionesByCuidador(cuidadorId: String): Result<List<Valoracion>>
    suspend fun getPromedioValoracion(cuidadorId: String): Result<Double>
}
