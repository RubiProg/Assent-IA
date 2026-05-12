package com.assentia.app.domain.usecase

import com.assentia.app.domain.model.*
import com.assentia.app.domain.repository.*
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.UUID
import javax.inject.Inject

// ═══════════════════════════════════════════════════════════════════════════
// AUTH USE CASES
// ═══════════════════════════════════════════════════════════════════════════

class LoginUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String): Result<User> {
        if (email.isBlank() || password.isBlank()) {
            return Result.failure(IllegalArgumentException("Email y contraseña son obligatorios"))
        }
        return authRepository.login(email, password)
    }
}

class LogoutUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke() = authRepository.logout()
}

class GetCurrentUserUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    operator fun invoke(): Flow<User?> = authRepository.getCurrentUser()
}

// ═══════════════════════════════════════════════════════════════════════════
// PACIENTE USE CASES
// ═══════════════════════════════════════════════════════════════════════════

class GetAllPacientesUseCase @Inject constructor(
    private val pacienteRepository: PacienteRepository
) {
    operator fun invoke(): Flow<List<Paciente>> = pacienteRepository.getAllPacientes()
}

class GetPacientesByCuidadorUseCase @Inject constructor(
    private val pacienteRepository: PacienteRepository
) {
    suspend operator fun invoke(cuidadorId: String): Result<List<Paciente>> =
        pacienteRepository.getPacientesByCuidador(cuidadorId)
}

class GetPacientesByFamiliarUseCase @Inject constructor(
    private val pacienteRepository: PacienteRepository
) {
    suspend operator fun invoke(familiarId: String): Result<List<Paciente>> =
        pacienteRepository.getPacientesByFamiliar(familiarId)
}

class CreatePacienteUseCase @Inject constructor(
    private val pacienteRepository: PacienteRepository
) {
    suspend operator fun invoke(paciente: Paciente): Result<Paciente> {
        if (paciente.nombre.isBlank() || paciente.apellidos.isBlank()) {
            return Result.failure(IllegalArgumentException("Nombre y apellidos son obligatorios"))
        }
        if (paciente.direccion.isBlank()) {
            return Result.failure(IllegalArgumentException("La dirección es obligatoria"))
        }
        return pacienteRepository.createPaciente(paciente)
    }
}

class UpdatePacienteUseCase @Inject constructor(
    private val pacienteRepository: PacienteRepository
) {
    suspend operator fun invoke(paciente: Paciente): Result<Paciente> =
        pacienteRepository.updatePaciente(paciente)
}

// ═══════════════════════════════════════════════════════════════════════════
// VISITA USE CASES
// ═══════════════════════════════════════════════════════════════════════════

class GetVisitasHoyUseCase @Inject constructor(
    private val visitaRepository: VisitaRepository
) {
    suspend operator fun invoke(cuidadorId: String): Result<List<Visita>> =
        visitaRepository.getVisitasByFecha(cuidadorId, LocalDate.now())
}

class GetVisitaByIdUseCase @Inject constructor(
    private val visitaRepository: VisitaRepository
) {
    suspend operator fun invoke(id: String): Result<Visita> =
        visitaRepository.getVisitaById(id)
}

class GetPacienteByIdUseCase @Inject constructor(
    private val pacienteRepository: PacienteRepository
) {
    suspend operator fun invoke(id: String): Result<Paciente> =
        pacienteRepository.getPacienteById(id)
}

class GetVisitasByCuidadorUseCase @Inject constructor(
    private val visitaRepository: VisitaRepository
) {
    operator fun invoke(cuidadorId: String): Flow<List<Visita>> =
        visitaRepository.getVisitasByCuidador(cuidadorId)
}

class GetVisitasByPacienteUseCase @Inject constructor(
    private val visitaRepository: VisitaRepository
) {
    operator fun invoke(pacienteId: String): Flow<List<Visita>> =
        visitaRepository.getVisitasByPaciente(pacienteId)
}

class IniciarVisitaUseCase @Inject constructor(
    private val visitaRepository: VisitaRepository
) {
    suspend operator fun invoke(visitaId: String): Result<Visita> =
        visitaRepository.iniciarVisita(visitaId)
}

class CompletarVisitaUseCase @Inject constructor(
    private val visitaRepository: VisitaRepository
) {
    suspend operator fun invoke(
        visitaId: String,
        firma: String?,
        observaciones: String
    ): Result<Visita> = visitaRepository.completarVisita(visitaId, firma, observaciones)
}

class CompletarTareaUseCase @Inject constructor(
    private val visitaRepository: VisitaRepository
) {
    suspend operator fun invoke(visitaId: String, tareaId: String): Result<Visita> =
        visitaRepository.completarTarea(visitaId, tareaId)
}

class CreateVisitaUseCase @Inject constructor(
    private val visitaRepository: VisitaRepository
) {
    suspend operator fun invoke(
        pacienteId: String,
        cuidadorId: String,
        inicio: LocalDateTime,
        fin: LocalDateTime,
        tareas: List<TareaVisita>
    ): Result<Visita> {
        if (fin.isBefore(inicio)) {
            return Result.failure(IllegalArgumentException("La hora de fin no puede ser anterior al inicio"))
        }
        val visita = Visita(
            id = UUID.randomUUID().toString(),
            pacienteId = pacienteId,
            cuidadorId = cuidadorId,
            fechaHoraInicio = inicio,
            fechaHoraFin = fin,
            tareas = tareas
        )
        return visitaRepository.createVisita(visita)
    }
}

// ═══════════════════════════════════════════════════════════════════════════
// MEDICACIÓN USE CASES
// ═══════════════════════════════════════════════════════════════════════════

class GetMedicacionPacienteUseCase @Inject constructor(
    private val medicacionRepository: MedicacionRepository
) {
    operator fun invoke(pacienteId: String): Flow<List<Medicacion>> =
        medicacionRepository.getMedicacionByPaciente(pacienteId)
}

class GetRegistrosMedicacionUseCase @Inject constructor(
    private val medicacionRepository: MedicacionRepository
) {
    operator fun invoke(visitaId: String): Flow<List<RegistroMedicacion>> =
        medicacionRepository.observeRegistrosByVisita(visitaId)
}

class RegistrarMedicacionUseCase @Inject constructor(
    private val medicacionRepository: MedicacionRepository
) {
    suspend operator fun invoke(
        medicacionId: String,
        visitaId: String,
        pacienteId: String,
        cuidadorId: String,
        administrada: Boolean,
        observaciones: String = ""
    ): Result<RegistroMedicacion> {
        val registro = RegistroMedicacion(
            id = UUID.randomUUID().toString(),
            medicacionId = medicacionId,
            visitaId = visitaId,
            pacienteId = pacienteId,
            cuidadorId = cuidadorId,
            fechaHora = LocalDateTime.now(),
            administrada = administrada,
            observaciones = observaciones
        )
        return medicacionRepository.registrarAdministracion(registro)
    }
}

// ═══════════════════════════════════════════════════════════════════════════
// INCIDENCIA USE CASES
// ═══════════════════════════════════════════════════════════════════════════

class GetIncidenciasAbiertasUseCase @Inject constructor(
    private val incidenciaRepository: IncidenciaRepository
) {
    operator fun invoke(): Flow<List<Incidencia>> =
        incidenciaRepository.getAllIncidenciasAbiertas()
}

class GetIncidenciasByPacienteUseCase @Inject constructor(
    private val incidenciaRepository: IncidenciaRepository
) {
    operator fun invoke(pacienteId: String): Flow<List<Incidencia>> =
        incidenciaRepository.getIncidenciasByPaciente(pacienteId)
}

class CreateIncidenciaUseCase @Inject constructor(
    private val incidenciaRepository: IncidenciaRepository
) {
    suspend operator fun invoke(
        pacienteId: String,
        cuidadorId: String,
        visitaId: String?,
        titulo: String,
        descripcion: String,
        gravedad: GravedadIncidencia,
        fotoUrl: String? = null
    ): Result<Incidencia> {
        if (titulo.isBlank()) {
            return Result.failure(IllegalArgumentException("El título es obligatorio"))
        }
        if (descripcion.isBlank()) {
            return Result.failure(IllegalArgumentException("La descripción es obligatoria"))
        }
        val incidencia = Incidencia(
            id = UUID.randomUUID().toString(),
            pacienteId = pacienteId,
            cuidadorId = cuidadorId,
            visitaId = visitaId,
            titulo = titulo,
            descripcion = descripcion,
            gravedad = gravedad,
            fechaHora = LocalDateTime.now(),
            fotoUrl = fotoUrl
        )
        return incidenciaRepository.createIncidencia(incidencia)
    }
}

class ResolverIncidenciaUseCase @Inject constructor(
    private val incidenciaRepository: IncidenciaRepository
) {
    suspend operator fun invoke(id: String): Result<Incidencia> =
        incidenciaRepository.updateEstado(id, EstadoIncidencia.RESUELTA)
}

// ═══════════════════════════════════════════════════════════════════════════
// MENSAJE USE CASES
// ═══════════════════════════════════════════════════════════════════════════

class GetMensajesUseCase @Inject constructor(
    private val mensajeRepository: MensajeRepository
) {
    operator fun invoke(pacienteId: String, userId: String): Flow<List<Mensaje>> =
        mensajeRepository.getMensajesByPaciente(pacienteId, userId)
}

class EnviarMensajeUseCase @Inject constructor(
    private val mensajeRepository: MensajeRepository
) {
    suspend operator fun invoke(
        remitenteId: String,
        destinatarioId: String,
        pacienteId: String,
        contenido: String
    ): Result<Mensaje> {
        if (contenido.isBlank()) {
            return Result.failure(IllegalArgumentException("El mensaje no puede estar vacío"))
        }
        val mensaje = Mensaje(
            id = UUID.randomUUID().toString(),
            remitenteId = remitenteId,
            destinatarioId = destinatarioId,
            pacienteId = pacienteId,
            contenido = contenido,
            fechaHora = LocalDateTime.now()
        )
        return mensajeRepository.enviarMensaje(mensaje)
    }
}

class GetUnreadCountUseCase @Inject constructor(
    private val mensajeRepository: MensajeRepository
) {
    operator fun invoke(userId: String): Flow<Int> =
        mensajeRepository.getUnreadCount(userId)
}

// ═══════════════════════════════════════════════════════════════════════════
// VALORACIÓN USE CASES
// ═══════════════════════════════════════════════════════════════════════════

class CreateValoracionUseCase @Inject constructor(
    private val valoracionRepository: ValoracionRepository
) {
    suspend operator fun invoke(
        visitaId: String,
        familiarId: String,
        cuidadorId: String,
        puntuacion: Int,
        comentario: String = ""
    ): Result<Valoracion> {
        if (puntuacion !in 1..5) {
            return Result.failure(IllegalArgumentException("La puntuación debe ser entre 1 y 5"))
        }
        val valoracion = Valoracion(
            id = UUID.randomUUID().toString(),
            visitaId = visitaId,
            familiarId = familiarId,
            cuidadorId = cuidadorId,
            puntuacion = puntuacion,
            comentario = comentario,
            fecha = LocalDate.now()
        )
        return valoracionRepository.createValoracion(valoracion)
    }
}
