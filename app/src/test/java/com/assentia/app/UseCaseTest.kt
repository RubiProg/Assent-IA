package com.assentia.app.test

import com.assentia.app.domain.model.*
import com.assentia.app.domain.repository.*
import com.assentia.app.domain.usecase.*
import com.assentia.app.presentation.viewmodel.AuthViewModel
import io.mockk.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import java.time.LocalDate
import java.time.LocalDateTime

@OptIn(ExperimentalCoroutinesApi::class)
class UseCaseTest {

    private val testDispatcher = UnconfinedTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    // ─── LOGIN USE CASE ────────────────────────────────────────────────────

    @Test
    fun `login con email y password vacios devuelve error`() = runTest {
        val authRepo = mockk<AuthRepository>()
        val useCase = LoginUseCase(authRepo)

        val result = useCase("", "")

        assertTrue(result.isFailure)
        assertEquals("Email y contraseña son obligatorios", result.exceptionOrNull()?.message)
        verify { authRepo wasNot called }
    }

    @Test
    fun `login con credenciales correctas devuelve usuario`() = runTest {
        val authRepo = mockk<AuthRepository>()
        val user = crearUserMock()
        coEvery { authRepo.login(any(), any()) } returns Result.success(user)

        val useCase = LoginUseCase(authRepo)
        val result = useCase("test@test.com", "password123")

        assertTrue(result.isSuccess)
        assertEquals(user, result.getOrNull())
    }

    // ─── CREATE PACIENTE USE CASE ──────────────────────────────────────────

    @Test
    fun `crear paciente sin nombre devuelve error`() = runTest {
        val pacienteRepo = mockk<PacienteRepository>()
        val useCase = CreatePacienteUseCase(pacienteRepo)

        val paciente = crearPacienteMock().copy(nombre = "")
        val result = useCase(paciente)

        assertTrue(result.isFailure)
        verify { pacienteRepo wasNot called }
    }

    @Test
    fun `crear paciente sin direccion devuelve error`() = runTest {
        val pacienteRepo = mockk<PacienteRepository>()
        val useCase = CreatePacienteUseCase(pacienteRepo)

        val paciente = crearPacienteMock().copy(direccion = "")
        val result = useCase(paciente)

        assertTrue(result.isFailure)
        assertEquals("La dirección es obligatoria", result.exceptionOrNull()?.message)
    }

    @Test
    fun `crear paciente valido llama al repositorio`() = runTest {
        val pacienteRepo = mockk<PacienteRepository>()
        val paciente = crearPacienteMock()
        coEvery { pacienteRepo.createPaciente(any()) } returns Result.success(paciente)

        val useCase = CreatePacienteUseCase(pacienteRepo)
        val result = useCase(paciente)

        assertTrue(result.isSuccess)
        coVerify { pacienteRepo.createPaciente(paciente) }
    }

    // ─── CREATE VISITA USE CASE ────────────────────────────────────────────

    @Test
    fun `crear visita con hora fin anterior a inicio devuelve error`() = runTest {
        val visitaRepo = mockk<VisitaRepository>()
        val useCase = CreateVisitaUseCase(visitaRepo)

        val inicio = LocalDateTime.now().plusHours(2)
        val fin = LocalDateTime.now() // fin antes que inicio

        val result = useCase(
            pacienteId = "p1",
            cuidadorId = "c1",
            inicio = inicio,
            fin = fin,
            tareas = emptyList()
        )

        assertTrue(result.isFailure)
        verify { visitaRepo wasNot called }
    }

    // ─── CREATE INCIDENCIA USE CASE ────────────────────────────────────────

    @Test
    fun `crear incidencia sin titulo devuelve error`() = runTest {
        val incidenciaRepo = mockk<IncidenciaRepository>()
        val useCase = CreateIncidenciaUseCase(incidenciaRepo)

        val result = useCase(
            pacienteId = "p1",
            cuidadorId = "c1",
            visitaId = null,
            titulo = "",
            descripcion = "Descripción válida",
            gravedad = GravedadIncidencia.LEVE
        )

        assertTrue(result.isFailure)
        assertEquals("El título es obligatorio", result.exceptionOrNull()?.message)
    }

    // ─── CREAR VALORACION USE CASE ─────────────────────────────────────────

    @Test
    fun `valoracion con puntuacion fuera de rango devuelve error`() = runTest {
        val valoracionRepo = mockk<ValoracionRepository>()
        val useCase = CreateValoracionUseCase(valoracionRepo)

        val result = useCase(
            visitaId = "v1",
            familiarId = "f1",
            cuidadorId = "c1",
            puntuacion = 6 // inválido
        )

        assertTrue(result.isFailure)
        assertEquals("La puntuación debe ser entre 1 y 5", result.exceptionOrNull()?.message)
    }

    @Test
    fun `valoracion con puntuacion valida se crea correctamente`() = runTest {
        val valoracionRepo = mockk<ValoracionRepository>()
        val valoracion = Valoracion(
            id = "val-001",
            visitaId = "v1",
            familiarId = "f1",
            cuidadorId = "c1",
            puntuacion = 5,
            fecha = LocalDate.now()
        )
        coEvery { valoracionRepo.createValoracion(any()) } returns Result.success(valoracion)

        val useCase = CreateValoracionUseCase(valoracionRepo)
        val result = useCase("v1", "f1", "c1", 5)

        assertTrue(result.isSuccess)
    }

    // ─── HELPERS ───────────────────────────────────────────────────────────

    private fun crearUserMock() = User(
        id = "user-001",
        nombre = "Test",
        apellidos = "User",
        email = "test@test.com",
        telefono = "600000000",
        rol = UserRole.CUIDADOR
    )

    private fun crearPacienteMock() = Paciente(
        id = "paciente-test",
        nombre = "Juan",
        apellidos = "García",
        fechaNacimiento = LocalDate.of(1945, 1, 1),
        direccion = "Calle Test 1, Madrid",
        telefono = "600000001"
    )
}
