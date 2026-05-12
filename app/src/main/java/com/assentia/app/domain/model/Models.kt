package com.assentia.app.domain.model

import java.time.LocalDate
import java.time.LocalDateTime

// ─── USUARIO ───────────────────────────────────────────────────────────────

enum class UserRole { ADMIN, CUIDADOR, FAMILIAR }

data class User(
    val id: String,
    val nombre: String,
    val apellidos: String,
    val email: String,
    val telefono: String,
    val rol: UserRole,
    val activo: Boolean = true
)

// ─── PACIENTE ──────────────────────────────────────────────────────────────

data class Paciente(
    val id: String,
    val nombre: String,
    val apellidos: String,
    val fechaNacimiento: LocalDate,
    val direccion: String,
    val telefono: String,
    val condicionesMedicas: List<String> = emptyList(),
    val alergias: List<String> = emptyList(),
    val notasMedicas: String = "",
    val cuidadorAsignadoId: String? = null,
    val familiaresIds: List<String> = emptyList(),
    val activo: Boolean = true
)

// ─── VISITA ────────────────────────────────────────────────────────────────

enum class EstadoVisita { PENDIENTE, EN_CURSO, COMPLETADA, CANCELADA }

data class Visita(
    val id: String,
    val pacienteId: String,
    val cuidadorId: String,
    val fechaHoraInicio: LocalDateTime,
    val fechaHoraFin: LocalDateTime,
    val estado: EstadoVisita = EstadoVisita.PENDIENTE,
    val tareas: List<TareaVisita> = emptyList(),
    val observaciones: String = "",
    val firmaDigital: String? = null // base64 de la firma
)

// ─── TAREA ─────────────────────────────────────────────────────────────────

enum class TipoTarea { MEDICACION, HIGIENE, ALIMENTACION, EJERCICIO, COMPANIA, OTRO }

data class TareaVisita(
    val id: String,
    val tipo: TipoTarea,
    val descripcion: String,
    val completada: Boolean = false,
    val horaCompletada: LocalDateTime? = null
)

// ─── MEDICACIÓN ────────────────────────────────────────────────────────────

enum class Frecuencia { DIARIA, CADA_8H, CADA_12H, SEMANAL, MENSUAL }

data class Medicacion(
    val id: String,
    val pacienteId: String,
    val nombre: String,
    val dosis: String,
    val frecuencia: Frecuencia,
    val horasToma: List<String>, // ["08:00", "14:00", "20:00"]
    val activa: Boolean = true
)

data class RegistroMedicacion(
    val id: String,
    val medicacionId: String,
    val visitaId: String,
    val pacienteId: String,
    val cuidadorId: String,
    val fechaHora: LocalDateTime,
    val administrada: Boolean,
    val observaciones: String = ""
)

// ─── INCIDENCIA ────────────────────────────────────────────────────────────

enum class GravedadIncidencia { LEVE, MODERADA, GRAVE, URGENTE }
enum class EstadoIncidencia { ABIERTA, EN_REVISION, RESUELTA }

data class Incidencia(
    val id: String,
    val pacienteId: String,
    val cuidadorId: String,
    val visitaId: String?,
    val titulo: String,
    val descripcion: String,
    val gravedad: GravedadIncidencia,
    val estado: EstadoIncidencia = EstadoIncidencia.ABIERTA,
    val fechaHora: LocalDateTime,
    val fotoUrl: String? = null
)

// ─── MENSAJE (Chat) ────────────────────────────────────────────────────────

data class Mensaje(
    val id: String,
    val remitenteId: String,
    val destinatarioId: String,
    val pacienteId: String, // contexto del mensaje
    val contenido: String,
    val fechaHora: LocalDateTime,
    val leido: Boolean = false
)

// ─── VALORACION ────────────────────────────────────────────────────────────

data class Valoracion(
    val id: String,
    val visitaId: String,
    val familiarId: String,
    val cuidadorId: String,
    val puntuacion: Int, // 1-5
    val comentario: String = "",
    val fecha: LocalDate
)
