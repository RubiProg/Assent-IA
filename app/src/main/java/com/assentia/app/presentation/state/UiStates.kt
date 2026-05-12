package com.assentia.app.presentation.state

import com.assentia.app.domain.model.*

// ─── BASE STATE ────────────────────────────────────────────────────────────

/**
 * Estado genérico para operaciones async.
 * Cada pantalla define su propio UiState con este patrón.
 */
sealed class UiState<out T> {
    object Loading : UiState<Nothing>()
    data class Success<T>(val data: T) : UiState<T>()
    data class Error(val message: String) : UiState<Nothing>()
    object Empty : UiState<Nothing>()
}

// ─── AUTH ──────────────────────────────────────────────────────────────────

data class LoginUiState(
    val isLoading: Boolean = false,
    val user: User? = null,
    val error: String? = null,
    val emailError: String? = null,
    val passwordError: String? = null
)

// ─── AGENDA (CUIDADOR) ─────────────────────────────────────────────────────

data class AgendaUiState(
    val isLoading: Boolean = false,
    val visitasHoy: List<Visita> = emptyList(),
    val pacientes: Map<String, Paciente> = emptyMap(),
    val error: String? = null,
    val visitaIniciada: Visita? = null
)

// ─── DETALLE VISITA (CUIDADOR) ─────────────────────────────────────────────

data class DetalleVisitaUiState(
    val isLoading: Boolean = false,
    val visita: Visita? = null,
    val paciente: Paciente? = null,
    val medicaciones: List<Medicacion> = emptyList(),
    val registros: List<RegistroMedicacion> = emptyList(),
    val error: String? = null,
    val visitaCompletada: Boolean = false,
    val isSaving: Boolean = false
)

// ─── INCIDENCIAS ───────────────────────────────────────────────────────────

data class IncidenciasUiState(
    val isLoading: Boolean = false,
    val incidencias: List<Incidencia> = emptyList(),
    val error: String? = null,
    val incidenciaCreada: Boolean = false
)

data class NuevaIncidenciaUiState(
    val isLoading: Boolean = false,
    val tituloError: String? = null,
    val descripcionError: String? = null,
    val gravedad: GravedadIncidencia = GravedadIncidencia.LEVE,
    val fotoUri: String? = null,
    val guardado: Boolean = false,
    val error: String? = null
)

// ─── ADMIN - DASHBOARD ─────────────────────────────────────────────────────

data class AdminDashboardUiState(
    val isLoading: Boolean = false,
    val totalPacientes: Int = 0,
    val totalCuidadores: Int = 0,
    val visitasHoy: Int = 0,
    val incidenciasAbiertas: Int = 0,
    val visitasPendientes: List<Visita> = emptyList(),
    val incidenciasRecientes: List<Incidencia> = emptyList(),
    val error: String? = null
)

// ─── ADMIN - PACIENTES ─────────────────────────────────────────────────────

data class PacientesUiState(
    val isLoading: Boolean = false,
    val pacientes: List<Paciente> = emptyList(),
    val query: String = "",
    val error: String? = null,
    val pacienteEliminado: Boolean = false
)

data class DetallePacienteUiState(
    val isLoading: Boolean = false,
    val paciente: Paciente? = null,
    val cuidadorAsignado: User? = null,
    val visitasRecientes: List<Visita> = emptyList(),
    val medicaciones: List<Medicacion> = emptyList(),
    val incidencias: List<Incidencia> = emptyList(),
    val error: String? = null
)

// ─── ADMIN - CUIDADORES ────────────────────────────────────────────────────

data class CuidadoresUiState(
    val isLoading: Boolean = false,
    val cuidadores: List<User> = emptyList(),
    val error: String? = null
)

// ─── FAMILIAR - HOME ───────────────────────────────────────────────────────

data class FamiliarHomeUiState(
    val isLoading: Boolean = false,
    val pacientes: List<Paciente> = emptyList(),
    val visitaActiva: Visita? = null, // si hay visita en curso ahora
    val ultimaVisita: Visita? = null,
    val incidenciasRecientes: List<Incidencia> = emptyList(),
    val mensajesNoLeidos: Int = 0,
    val error: String? = null
)

// ─── CHAT ──────────────────────────────────────────────────────────────────

data class ChatUiState(
    val isLoading: Boolean = false,
    val mensajes: List<Mensaje> = emptyList(),
    val textoActual: String = "",
    val isSending: Boolean = false,
    val error: String? = null
)

// ─── VALORACIÓN ────────────────────────────────────────────────────────────

data class ValoracionUiState(
    val isLoading: Boolean = false,
    val puntuacion: Int = 0,
    val comentario: String = "",
    val enviada: Boolean = false,
    val error: String? = null
)
