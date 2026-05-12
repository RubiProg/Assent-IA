package com.assentia.app.data.datasource

import com.assentia.app.domain.model.*
import java.time.LocalDate
import java.time.LocalDateTime
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Fuente de datos simulada. Sustituir por llamadas Retrofit cuando haya API real.
 * Todos los datos son ficticios pero realistas para facilitar el desarrollo y testing.
 */
@Singleton
class MockDataSource @Inject constructor() {

    // ─── USUARIOS ──────────────────────────────────────────────────────────

    val users = mutableListOf(
        User(
            id = "admin-001",
            nombre = "Carmen",
            apellidos = "Vidal Torres",
            email = "admin@assent-ia.com",
            telefono = "612345678",
            rol = UserRole.ADMIN
        ),
        User(
            id = "cuidador-001",
            nombre = "María",
            apellidos = "López García",
            email = "maria@assent-ia.com",
            telefono = "623456789",
            rol = UserRole.CUIDADOR
        ),
        User(
            id = "cuidador-002",
            nombre = "Jorge",
            apellidos = "Martínez Ruiz",
            email = "jorge@assent-ia.com",
            telefono = "634567890",
            rol = UserRole.CUIDADOR
        ),
        User(
            id = "familiar-001",
            nombre = "Ana",
            apellidos = "Fernández Soto",
            email = "ana@gmail.com",
            telefono = "645678901",
            rol = UserRole.FAMILIAR
        ),
        User(
            id = "familiar-002",
            nombre = "Pedro",
            apellidos = "Gómez Díaz",
            email = "pedro@gmail.com",
            telefono = "656789012",
            rol = UserRole.FAMILIAR
        )
    )

    // Passwords de prueba (en producción esto sería hash en el backend)
    val passwords = mapOf(
        "admin@assent-ia.com" to "admin123",
        "maria@assent-ia.com" to "cuidador123",
        "jorge@assent-ia.com" to "cuidador123",
        "ana@gmail.com" to "familiar123",
        "pedro@gmail.com" to "familiar123"
    )

    // ─── PACIENTES ─────────────────────────────────────────────────────────

    val pacientes = mutableListOf(
        Paciente(
            id = "paciente-001",
            nombre = "Antonio",
            apellidos = "Ruiz Blanco",
            fechaNacimiento = LocalDate.of(1942, 3, 15),
            direccion = "Calle Mayor 12, 3ºA, Madrid",
            telefono = "913456789",
            condicionesMedicas = listOf("Diabetes tipo 2", "Hipertensión"),
            alergias = listOf("Penicilina"),
            notasMedicas = "Dieta baja en azúcar. Control tensión dos veces al día.",
            cuidadorAsignadoId = "cuidador-001",
            familiaresIds = listOf("familiar-001")
        ),
        Paciente(
            id = "paciente-002",
            nombre = "Dolores",
            apellidos = "Martín Sánchez",
            fechaNacimiento = LocalDate.of(1938, 7, 22),
            direccion = "Avenida de la Paz 45, 1ºB, Madrid",
            telefono = "914567890",
            condicionesMedicas = listOf("Artrosis", "Hipotiroidismo"),
            alergias = emptyList(),
            notasMedicas = "Movilidad reducida. Necesita ayuda para desplazarse.",
            cuidadorAsignadoId = "cuidador-001",
            familiaresIds = listOf("familiar-002")
        ),
        Paciente(
            id = "paciente-003",
            nombre = "Manuel",
            apellidos = "García Pérez",
            fechaNacimiento = LocalDate.of(1950, 11, 8),
            direccion = "Plaza España 3, 2ºC, Madrid",
            telefono = "915678901",
            condicionesMedicas = listOf("Alzheimer leve", "Depresión"),
            alergias = listOf("Ibuprofeno"),
            notasMedicas = "Necesita supervisión constante. Tendencia a desorientarse.",
            cuidadorAsignadoId = "cuidador-002",
            familiaresIds = listOf("familiar-001", "familiar-002")
        )
    )

    // ─── VISITAS ───────────────────────────────────────────────────────────

    val visitas = mutableListOf(
        Visita(
            id = "visita-001",
            pacienteId = "paciente-001",
            cuidadorId = "cuidador-001",
            fechaHoraInicio = LocalDateTime.now().withHour(9).withMinute(0),
            fechaHoraFin = LocalDateTime.now().withHour(11).withMinute(0),
            estado = EstadoVisita.PENDIENTE,
            tareas = listOf(
                TareaVisita("tarea-001", TipoTarea.MEDICACION, "Administrar metformina 500mg"),
                TareaVisita("tarea-002", TipoTarea.HIGIENE, "Aseo personal completo"),
                TareaVisita("tarea-003", TipoTarea.ALIMENTACION, "Preparar desayuno sin azúcar"),
                TareaVisita("tarea-004", TipoTarea.EJERCICIO, "10 minutos de paseo suave")
            )
        ),
        Visita(
            id = "visita-002",
            pacienteId = "paciente-002",
            cuidadorId = "cuidador-001",
            fechaHoraInicio = LocalDateTime.now().withHour(12).withMinute(0),
            fechaHoraFin = LocalDateTime.now().withHour(14).withMinute(0),
            estado = EstadoVisita.PENDIENTE,
            tareas = listOf(
                TareaVisita("tarea-005", TipoTarea.MEDICACION, "Levotiroxina en ayunas"),
                TareaVisita("tarea-006", TipoTarea.ALIMENTACION, "Comida principal"),
                TareaVisita("tarea-007", TipoTarea.COMPANIA, "Compañía y conversación")
            )
        ),
        Visita(
            id = "visita-003",
            pacienteId = "paciente-001",
            cuidadorId = "cuidador-001",
            fechaHoraInicio = LocalDateTime.now().minusDays(1).withHour(9).withMinute(0),
            fechaHoraFin = LocalDateTime.now().minusDays(1).withHour(11).withMinute(0),
            estado = EstadoVisita.COMPLETADA,
            observaciones = "Todo correcto. Paciente de buen humor.",
            tareas = listOf(
                TareaVisita("tarea-008", TipoTarea.MEDICACION, "Administrar metformina", completada = true),
                TareaVisita("tarea-009", TipoTarea.HIGIENE, "Aseo personal", completada = true)
            )
        ),
        Visita(
            id = "visita-004",
            pacienteId = "paciente-003",
            cuidadorId = "cuidador-002",
            fechaHoraInicio = LocalDateTime.now().withHour(10).withMinute(0),
            fechaHoraFin = LocalDateTime.now().withHour(13).withMinute(0),
            estado = EstadoVisita.PENDIENTE,
            tareas = listOf(
                TareaVisita("tarea-010", TipoTarea.MEDICACION, "Donepezilo 5mg con desayuno"),
                TareaVisita("tarea-011", TipoTarea.COMPANIA, "Estimulación cognitiva"),
                TareaVisita("tarea-012", TipoTarea.ALIMENTACION, "Supervisar desayuno y almuerzo")
            )
        )
    )

    // ─── MEDICACIONES ──────────────────────────────────────────────────────

    val medicaciones = mutableListOf(
        Medicacion(
            id = "med-001",
            pacienteId = "paciente-001",
            nombre = "Metformina",
            dosis = "500mg",
            frecuencia = Frecuencia.CADA_12H,
            horasToma = listOf("08:00", "20:00")
        ),
        Medicacion(
            id = "med-002",
            pacienteId = "paciente-001",
            nombre = "Enalapril",
            dosis = "10mg",
            frecuencia = Frecuencia.DIARIA,
            horasToma = listOf("08:00")
        ),
        Medicacion(
            id = "med-003",
            pacienteId = "paciente-002",
            nombre = "Levotiroxina",
            dosis = "50mcg",
            frecuencia = Frecuencia.DIARIA,
            horasToma = listOf("07:30")
        ),
        Medicacion(
            id = "med-004",
            pacienteId = "paciente-003",
            nombre = "Donepezilo",
            dosis = "5mg",
            frecuencia = Frecuencia.DIARIA,
            horasToma = listOf("08:00")
        )
    )

    // ─── INCIDENCIAS ───────────────────────────────────────────────────────

    val incidencias = mutableListOf(
        Incidencia(
            id = "inc-001",
            pacienteId = "paciente-001",
            cuidadorId = "cuidador-001",
            visitaId = "visita-003",
            titulo = "Tensión arterial elevada",
            descripcion = "Tensión 160/95. Se le ha recordado tomar la medicación y descansar.",
            gravedad = GravedadIncidencia.MODERADA,
            estado = EstadoIncidencia.RESUELTA,
            fechaHora = LocalDateTime.now().minusDays(1).withHour(10).withMinute(30)
        ),
        Incidencia(
            id = "inc-002",
            pacienteId = "paciente-003",
            cuidadorId = "cuidador-002",
            visitaId = null,
            titulo = "Episodio de desorientación",
            descripcion = "Paciente no reconocía el domicilio. Duración 20 minutos. Se calmó con música.",
            gravedad = GravedadIncidencia.GRAVE,
            estado = EstadoIncidencia.ABIERTA,
            fechaHora = LocalDateTime.now().withHour(8).withMinute(45)
        )
    )

    // ─── MENSAJES ──────────────────────────────────────────────────────────

    val mensajes = mutableListOf(
        Mensaje(
            id = "msg-001",
            remitenteId = "familiar-001",
            destinatarioId = "cuidador-001",
            pacienteId = "paciente-001",
            contenido = "Buenos días María, ¿cómo ha amanecido mi padre hoy?",
            fechaHora = LocalDateTime.now().withHour(9).withMinute(15),
            leido = true
        ),
        Mensaje(
            id = "msg-002",
            remitenteId = "cuidador-001",
            destinatarioId = "familiar-001",
            pacienteId = "paciente-001",
            contenido = "Buenos días Ana, está bien. Ha desayunado bien y tiene buen ánimo.",
            fechaHora = LocalDateTime.now().withHour(9).withMinute(45),
            leido = false
        )
    )
}
