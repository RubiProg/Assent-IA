package com.assentia.app.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.assentia.app.R
import com.assentia.app.databinding.*
import com.assentia.app.domain.model.*
import com.assentia.app.presentation.viewmodel.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale
import java.util.UUID

// ── ADMIN DASHBOARD ─────────────────────────────────────────────────────────

@AndroidEntryPoint
class AdminDashboardFragment : Fragment() {

    private var _binding: FragmentAdminDashboardBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AdminDashboardViewModel by viewModels()
    private val authViewModel: AuthViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAdminDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.cargarDashboard()

        binding.btnVerPacientes.setOnClickListener {
            findNavController().navigate(R.id.action_dashboard_to_pacientes)
        }
        binding.btnVerIncidencias.setOnClickListener {
            findNavController().navigate(R.id.action_dashboard_to_incidencias)
        }
        binding.toolbar.setOnMenuItemClickListener { item ->
            if (item.itemId == R.id.menu_logout) {
                authViewModel.logout()
                findNavController().navigate(R.id.loginFragment, null, androidx.navigation.NavOptions.Builder()
                    .setPopUpTo(R.id.nav_graph, true)
                    .build())
                true
            } else false
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    binding.tvTotalPacientes.text = state.totalPacientes.toString()
                    binding.tvIncidenciasAbiertas.text = state.incidenciasAbiertas.toString()
                }
            }
        }
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}

// ── PACIENTES ────────────────────────────────────────────────────────────────

@AndroidEntryPoint
class PacientesFragment : Fragment() {

    private var _binding: FragmentPacientesBinding? = null
    private val binding get() = _binding!!
    private val viewModel: PacientesViewModel by viewModels()
    private lateinit var adapter: PacientesAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentPacientesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = PacientesAdapter { paciente ->
            val bundle = Bundle().apply { putString("pacienteId", paciente.id) }
            findNavController().navigate(R.id.action_pacientes_to_detalle, bundle)
        }
        binding.rvPacientes.layoutManager = LinearLayoutManager(requireContext())
        binding.rvPacientes.adapter = adapter

        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        binding.etSearch.doOnTextChanged { text, _, _, _ -> viewModel.buscar(text?.toString().orEmpty()) }

        binding.fabAdd.setOnClickListener {
            findNavController().navigate(R.id.action_pacientes_to_nuevo)
        }

        viewModel.cargarPacientes()

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    adapter.submitList(state.pacientes)
                }
            }
        }
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}

// Adapter Pacientes
class PacientesAdapter(
    private val onClick: (Paciente) -> Unit
) : RecyclerView.Adapter<PacientesAdapter.VH>() {

    private val items = mutableListOf<Paciente>()

    fun submitList(list: List<Paciente>) {
        items.clear(); items.addAll(list); notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val b = ItemPacienteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(b)
    }

    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])

    inner class VH(private val b: ItemPacienteBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(paciente: Paciente) {
            b.tvNombre.text = "${paciente.nombre} ${paciente.apellidos}"
            b.tvDireccion.text = paciente.direccion
            b.tvCuidador.text = if (paciente.cuidadorAsignadoId != null) "Con cuidador asignado" else "Sin cuidador"
            b.tvInicial.text = paciente.nombre.first().uppercase()
            b.root.setOnClickListener { onClick(paciente) }
        }
    }
}

// ── DETALLE PACIENTE ─────────────────────────────────────────────────────────

@AndroidEntryPoint
class DetallePacienteFragment : Fragment() {

    private var _binding: FragmentDetallePacienteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentDetallePacienteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        // TODO: cargar datos con pacienteId del bundle
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}

// ── NUEVO PACIENTE ───────────────────────────────────────────────────────────

@AndroidEntryPoint
class NuevoPacienteFragment : Fragment() {

    private var _binding: FragmentNuevoPacienteBinding? = null
    private val binding get() = _binding!!
    private val viewModel: PacientesViewModel by viewModels()
    private var selectedCuidadorId: String? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentNuevoPacienteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }

        setupCuidadorDropdown()
        setupSaveButton()
        observeViewModel()

        viewModel.cargarCuidadores()
    }

    private fun setupCuidadorDropdown() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.cuidadores.collect { cuidadores ->
                    val names = cuidadores.map { "${it.nombre} ${it.apellidos}" }
                    val adapter = android.widget.ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, names)
                    binding.spinnerCuidador.setAdapter(adapter)
                    
                    binding.spinnerCuidador.setOnItemClickListener { _, _, position, _ ->
                        selectedCuidadorId = cuidadores[position].id
                    }
                }
            }
        }
    }

    private fun setupSaveButton() {
        binding.btnGuardar.setOnClickListener {
            val nombre = binding.etNombre.text?.toString().orEmpty().trim()
            val apellidos = binding.etApellidos.text?.toString().orEmpty().trim()
            val fechaStr = binding.etFechaNacimiento.text?.toString().orEmpty().trim()
            val direccion = binding.etDireccion.text?.toString().orEmpty().trim()
            val telefono = binding.etTelefono.text?.toString().orEmpty().trim()
            
            val familiarNombre = binding.etFamiliarNombre.text?.toString().orEmpty().trim()
            val familiarEmail = binding.etFamiliarEmail.text?.toString().orEmpty().trim()
            val familiarTelefono = binding.etFamiliarTelefono.text?.toString().orEmpty().trim()
            
            val alergias = binding.etAlergias.text?.toString().orEmpty().split(",").map { it.trim() }.filter { it.isNotEmpty() }
            val condiciones = binding.etCondiciones.text?.toString().orEmpty().split(",").map { it.trim() }.filter { it.isNotEmpty() }
            val medicacionNombre = binding.etMedicacion.text?.toString().orEmpty().trim()

            if (nombre.isEmpty() || apellidos.isEmpty() || familiarEmail.isEmpty()) {
                android.widget.Toast.makeText(requireContext(), "Nombre, apellidos y email familiar son obligatorios", android.widget.Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val fechaNacimiento = try {
                LocalDate.parse(fechaStr)
            } catch (e: Exception) {
                LocalDate.now().minusYears(70) // valor por defecto si falla el parseo
            }

            val paciente = Paciente(
                id = UUID.randomUUID().toString(),
                nombre = nombre,
                apellidos = apellidos,
                fechaNacimiento = fechaNacimiento,
                direccion = direccion,
                telefono = telefono,
                condicionesMedicas = condiciones,
                alergias = alergias,
                cuidadorAsignadoId = selectedCuidadorId
            )

            viewModel.crearPacienteCompleto(
                paciente = paciente,
                familiarNombre = familiarNombre,
                familiarEmail = familiarEmail,
                familiarTelefono = familiarTelefono,
                medicacionNombre = medicacionNombre,
                medicacionDosis = "Según prescripción"
            )
        }
    }

    private fun observeViewModel() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    binding.btnGuardar.isEnabled = !state.isLoading
                    state.error?.let {
                        android.widget.Toast.makeText(requireContext(), it, android.widget.Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.guardadoExitoso.collect { exitoso ->
                    if (exitoso) {
                        android.widget.Toast.makeText(requireContext(), "Paciente registrado con éxito", android.widget.Toast.LENGTH_SHORT).show()
                        findNavController().navigateUp()
                    }
                }
            }
        }
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}

// ── DETALLE VISITA ───────────────────────────────────────────────────────────

@AndroidEntryPoint
class DetalleVisitaFragment : Fragment() {

    private var _binding: FragmentDetalleVisitaBinding? = null
    private val binding get() = _binding!!
    private val viewModel: DetalleVisitaViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentDetalleVisitaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }

        val visitaId = arguments?.getString("visitaId") ?: return
        viewModel.cargarDatos(visitaId)

        val tareasAdapter = TareasAdapter { tarea ->
            viewModel.completarTarea(tarea.id)
        }
        binding.rvTareas.layoutManager = LinearLayoutManager(requireContext())
        binding.rvTareas.adapter = tareasAdapter

        val medicacionAdapter = MedicacionAdapter { medicacion ->
            val state = viewModel.uiState.value
            val visita = state.visita
            val paciente = state.paciente
            
            if (visita == null || paciente == null) {
                android.widget.Toast.makeText(requireContext(), "Cargando datos...", android.widget.Toast.LENGTH_SHORT).show()
                return@MedicacionAdapter
            }
            
            androidx.appcompat.app.AlertDialog.Builder(requireContext())
                .setTitle("Registrar toma: ${medicacion.nombre}")
                .setMessage("¿Se ha administrado la medicación correctamente?")
                .setPositiveButton("Sí, administrada") { _, _ ->
                    viewModel.registrarMedicacion(medicacion.id, paciente.id, visita.cuidadorId, true)
                }
                .setNegativeButton("No administrada") { _, _ ->
                    viewModel.registrarMedicacion(medicacion.id, paciente.id, visita.cuidadorId, false)
                }
                .setNeutralButton("Cancelar", null)
                .show()
        }
        binding.rvMedicaciones.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMedicaciones.adapter = medicacionAdapter

        binding.btnIncidencia.setOnClickListener {
            val bundle = Bundle().apply {
                putString("pacienteId", viewModel.uiState.value.paciente?.id)
                putString("visitaId", visitaId)
            }
            findNavController().navigate(R.id.action_visita_to_incidencia, bundle)
        }

        binding.btnAccionVisita.setOnClickListener {
            val state = viewModel.uiState.value
            val visita = state.visita ?: return@setOnClickListener
            
            if (visita.estado == EstadoVisita.PENDIENTE) {
                viewModel.iniciarVisita()
            } else {
                val obs = binding.etObservaciones.text?.toString().orEmpty()
                viewModel.completarVisita(null, obs)
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    state.visita?.let { visita ->
                        binding.btnAccionVisita.text = when (visita.estado) {
                            EstadoVisita.PENDIENTE -> "Iniciar visita"
                            EstadoVisita.EN_CURSO -> "Completar visita"
                            else -> "Completada"
                        }
                        binding.btnAccionVisita.isEnabled = visita.estado != EstadoVisita.COMPLETADA
                        tareasAdapter.submitList(visita.tareas)
                    }
                    state.paciente?.let { paciente ->
                        binding.tvPacienteNombre.text = "${paciente.nombre} ${paciente.apellidos}"
                        binding.tvPacienteDireccion.text = paciente.direccion
                        binding.tvAlergias.text = if (paciente.alergias.isNotEmpty()) {
                            "Alergias: ${paciente.alergias.joinToString()}"
                        } else ""
                    }
                    medicacionAdapter.submitList(state.medicaciones, state.registros)
                    
                    state.error?.let {
                        android.widget.Toast.makeText(requireContext(), it, android.widget.Toast.LENGTH_SHORT).show()
                        viewModel.clearError()
                    }
                    
                    if (state.visitaCompletada) findNavController().navigateUp()
                }
            }
        }
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}

class TareasAdapter(private val onTareaClick: (TareaVisita) -> Unit) : RecyclerView.Adapter<TareasAdapter.VH>() {
    private val items = mutableListOf<TareaVisita>()
    fun submitList(list: List<TareaVisita>) { items.clear(); items.addAll(list); notifyDataSetChanged() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val b = ItemTareaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(b)
    }
    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])

    inner class VH(private val b: ItemTareaBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(tarea: TareaVisita) {
            b.tvTipo.text = tarea.tipo.name
            b.tvDescripcion.text = tarea.descripcion
            b.cbCompletada.isChecked = tarea.completada
            b.cbCompletada.isEnabled = !tarea.completada
            b.cbCompletada.setOnClickListener { onTareaClick(tarea) }
        }
    }
}

class MedicacionAdapter(private val onRegistrar: (Medicacion) -> Unit) : RecyclerView.Adapter<MedicacionAdapter.VH>() {
    private val items = mutableListOf<Medicacion>()
    private var registros = listOf<RegistroMedicacion>()

    fun submitList(list: List<Medicacion>, registros: List<RegistroMedicacion>) {
        this.items.clear()
        this.items.addAll(list)
        this.registros = registros
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val b = ItemMedicacionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(b)
    }
    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])

    inner class VH(private val b: ItemMedicacionBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(med: Medicacion) {
            val registro = registros.find { it.medicacionId == med.id }
            
            b.tvNombre.text = med.nombre
            b.tvDosis.text = med.dosis
            b.tvHoras.text = med.horasToma.joinToString(", ")
            
            if (registro != null) {
                b.btnRegistrar.text = if (registro.administrada) "Administrada" else "No administrada"
                b.btnRegistrar.isEnabled = false
                b.btnRegistrar.alpha = 0.5f
            } else {
                b.btnRegistrar.text = "Registrar"
                b.btnRegistrar.isEnabled = true
                b.btnRegistrar.alpha = 1.0f
            }

            b.btnRegistrar.setOnClickListener { onRegistrar(med) }
        }
    }
}


// ── INCIDENCIAS ──────────────────────────────────────────────────────────────

@AndroidEntryPoint
class IncidenciasFragment : Fragment() {

    private var _binding: FragmentIncidenciasBinding? = null
    private val binding get() = _binding!!
    private val viewModel: IncidenciasViewModel by viewModels()
    private lateinit var adapter: IncidenciasAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentIncidenciasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }

        val pacienteId = arguments?.getString("pacienteId")
        viewModel.cargarIncidencias(pacienteId)

        adapter = IncidenciasAdapter()
        binding.rvIncidencias.layoutManager = LinearLayoutManager(requireContext())
        binding.rvIncidencias.adapter = adapter

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    if (state.incidencias.isEmpty()) {
                        binding.tvEmpty.visibility = View.VISIBLE
                        binding.rvIncidencias.visibility = View.GONE
                    } else {
                        binding.tvEmpty.visibility = View.GONE
                        binding.rvIncidencias.visibility = View.VISIBLE
                        adapter.submitList(state.incidencias)
                    }
                }
            }
        }
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}

// Adapter Incidencias
class IncidenciasAdapter : RecyclerView.Adapter<IncidenciasAdapter.VH>() {

    private val items = mutableListOf<Incidencia>()
    fun submitList(list: List<Incidencia>) { items.clear(); items.addAll(list); notifyDataSetChanged() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val b = ItemIncidenciaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(b)
    }

    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])

    inner class VH(private val b: ItemIncidenciaBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(inc: Incidencia) {
            b.tvTitulo.text = inc.titulo
            b.tvDescripcion.text = inc.descripcion
            val fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
            b.tvFecha.text = inc.fechaHora.format(fmt)
            val (label, color) = when (inc.gravedad) {
                GravedadIncidencia.LEVE -> "Leve" to 0xFF4CAF50.toInt()
                GravedadIncidencia.MODERADA -> "Moderada" to 0xFFFF9800.toInt()
                GravedadIncidencia.GRAVE -> "Grave" to 0xFFF44336.toInt()
                GravedadIncidencia.URGENTE -> "Urgente" to 0xFF9C27B0.toInt()
            }
            b.tvGravedad.text = label
            b.tvGravedad.setBackgroundColor(color)
            b.tvGravedad.setPadding(12, 4, 12, 4)
        }
    }
}

// ── NUEVA INCIDENCIA ─────────────────────────────────────────────────────────

@AndroidEntryPoint
class NuevaIncidenciaFragment : Fragment() {

    private var _binding: FragmentNuevaIncidenciaBinding? = null
    private val binding get() = _binding!!
    private val viewModel: IncidenciasViewModel by viewModels()
    private val authViewModel: AuthViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentNuevaIncidenciaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        
        binding.etTitulo.filters = arrayOf()
        binding.etDescripcion.filters = arrayOf()

        binding.chipLeve.isChecked = true

        binding.chipGroupGravedad.setOnCheckedStateChangeListener { _, checkedIds ->
            val gravedad = when {
                checkedIds.contains(R.id.chip_moderada) -> GravedadIncidencia.MODERADA
                checkedIds.contains(R.id.chip_grave) -> GravedadIncidencia.GRAVE
                checkedIds.contains(R.id.chip_urgente) -> GravedadIncidencia.URGENTE
                else -> GravedadIncidencia.LEVE
            }
            viewModel.setGravedad(gravedad)
        }

        binding.btnGuardar.setOnClickListener {
            val titulo = binding.etTitulo.text?.toString().orEmpty().trim()
            val descripcion = binding.etDescripcion.text?.toString().orEmpty().trim()
            val pacienteId = arguments?.getString("pacienteId").orEmpty()
            val visitaId = arguments?.getString("visitaId")
            val user = authViewModel.currentUser.value
            val cuidadorId = user?.id.orEmpty()
            
            if (pacienteId.isEmpty()) {
                android.widget.Toast.makeText(requireContext(), "Error: No se ha identificado al paciente", android.widget.Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            
            if (cuidadorId.isEmpty()) {
                android.widget.Toast.makeText(requireContext(), "Error: Sesión de usuario no válida", android.widget.Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (titulo.isEmpty() || descripcion.isEmpty()) {
                android.widget.Toast.makeText(requireContext(), "Por favor, completa el título y la descripción", android.widget.Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            viewModel.crearIncidencia(pacienteId, cuidadorId, visitaId, titulo, descripcion,
                viewModel.nuevaState.value.gravedad)
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.nuevaState.collect { state ->
                    if (state.guardado) {
                        android.widget.Toast.makeText(requireContext(), "Incidencia guardada", android.widget.Toast.LENGTH_SHORT).show()
                        findNavController().navigateUp()
                    }
                    state.error?.let {
                        android.widget.Toast.makeText(requireContext(), it, android.widget.Toast.LENGTH_LONG).show()
                        viewModel.clearError()
                    }
                }
            }
        }
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}

// ── FAMILIAR HOME ────────────────────────────────────────────────────────────

@AndroidEntryPoint
class FamiliarHomeFragment : Fragment() {

    private var _binding: FragmentFamiliarHomeBinding? = null
    private val binding get() = _binding!!
    private val viewModel: FamiliarHomeViewModel by viewModels()
    private val authViewModel: AuthViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentFamiliarHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolbar.setOnMenuItemClickListener { item ->
            if (item.itemId == R.id.menu_logout) {
                authViewModel.logout()
                findNavController().navigate(R.id.loginFragment, null, androidx.navigation.NavOptions.Builder()
                    .setPopUpTo(R.id.nav_graph, true)
                    .build())
                true
            } else false
        }

        viewLifecycleOwner.lifecycleScope.launch {
            authViewModel.currentUser.collect { user ->
                user?.let { viewModel.cargarHome(it.id) }
            }
        }

        binding.btnChat.setOnClickListener {
            val pacienteId = viewModel.uiState.value.pacientes.firstOrNull()?.id.orEmpty()
            val bundle = Bundle().apply {
                putString("pacienteId", pacienteId)
                putString("destinatarioId", "cuidador-001")
            }
            findNavController().navigate(R.id.action_home_to_chat, bundle)
        }

        binding.btnHistorial.setOnClickListener {
            val pacienteId = viewModel.uiState.value.pacientes.firstOrNull()?.id.orEmpty()
            val bundle = Bundle().apply { putString("pacienteId", pacienteId) }
            findNavController().navigate(R.id.action_home_to_historial, bundle)
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    state.pacientes.firstOrNull()?.let { p ->
                        binding.tvNombrePaciente.text = "${p.nombre} ${p.apellidos}"
                    }
                    binding.tvEstadoVisita.text = when {
                        state.visitaActiva != null -> "✓ Visita en curso ahora"
                        else -> "Sin visita activa ahora mismo"
                    }
                    state.ultimaVisita?.let { v ->
                        val fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                        binding.tvUltimaVisita.text = "Última visita: ${v.fechaHoraFin.format(fmt)}"
                    }
                }
            }
        }
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}

// ── CHAT ─────────────────────────────────────────────────────────────────────

@AndroidEntryPoint
class ChatFragment : Fragment() {

    private var _binding: FragmentChatBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ChatViewModel by viewModels()
    private val authViewModel: AuthViewModel by activityViewModels()
    private lateinit var adapter: MensajesAdapter
    private var pacienteId: String = ""
    private var destinatarioId: String = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentChatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pacienteId = arguments?.getString("pacienteId").orEmpty()
        destinatarioId = arguments?.getString("destinatarioId").orEmpty()

        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }

        adapter = MensajesAdapter(authViewModel.currentUser.value?.id.orEmpty())
        binding.rvMensajes.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMensajes.adapter = adapter

        viewLifecycleOwner.lifecycleScope.launch {
            authViewModel.currentUser.collect { user ->
                user?.let { viewModel.cargarMensajes(pacienteId, it.id) }
            }
        }

        binding.btnEnviar.setOnClickListener {
            val remitenteId = authViewModel.currentUser.value?.id.orEmpty()
            viewModel.enviarMensaje(remitenteId, destinatarioId, pacienteId)
        }

        binding.etMensaje.doOnTextChanged { text, _, _, _ ->
            viewModel.actualizarTexto(text?.toString().orEmpty())
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    adapter.submitList(state.mensajes, authViewModel.currentUser.value?.id.orEmpty())
                    if (state.mensajes.isNotEmpty()) {
                        binding.rvMensajes.scrollToPosition(state.mensajes.size - 1)
                    }
                }
            }
        }
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}

// Adapter Mensajes
class MensajesAdapter(private var currentUserId: String) : RecyclerView.Adapter<MensajesAdapter.VH>() {

    private val items = mutableListOf<Mensaje>()

    fun submitList(list: List<Mensaje>, userId: String) {
        currentUserId = userId
        items.clear(); items.addAll(list); notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val b = ItemMensajeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(b)
    }

    override fun getItemCount() = items.size
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])

    inner class VH(private val b: ItemMensajeBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(msg: Mensaje) {
            b.tvContenido.text = msg.contenido
            val fmt = DateTimeFormatter.ofPattern("HH:mm")
            b.tvHora.text = msg.fechaHora.format(fmt)
            val esPropio = msg.remitenteId == currentUserId
            b.container.gravity = if (esPropio) android.view.Gravity.END else android.view.Gravity.START
            b.cardMensaje.setCardBackgroundColor(
                if (esPropio) 0xFFDCF8C6.toInt() else 0xFFFFFFFF.toInt()
            )
        }
    }
}

// ── HISTORIAL ────────────────────────────────────────────────────────────────

@AndroidEntryPoint
class HistorialFragment : Fragment() {

    private var _binding: FragmentHistorialBinding? = null
    private val binding get() = _binding!!
    private val visitasByCuidadorUseCase: com.assentia.app.domain.usecase.GetVisitasByPacienteUseCase by lazy {
        com.assentia.app.domain.usecase.GetVisitasByPacienteUseCase(
            (requireActivity().application as com.assentia.app.AssentIAApplication)
                .let { throw UnsupportedOperationException("Usa Hilt ViewModel en producción") }
        )
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHistorialBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        // La lista de visitas del historial se cargaría vía ViewModel igual que AgendaFragment
    }

    override fun onDestroyView() { super.onDestroyView(); _binding = null }
}
