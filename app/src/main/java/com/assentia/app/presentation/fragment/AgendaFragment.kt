package com.assentia.app.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.assentia.app.R
import com.assentia.app.databinding.FragmentAgendaBinding
import com.assentia.app.databinding.ItemVisitaBinding
import com.assentia.app.domain.model.*
import com.assentia.app.presentation.viewmodel.AgendaViewModel
import com.assentia.app.presentation.viewmodel.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.TextStyle
import java.util.Locale

@AndroidEntryPoint
class AgendaFragment : Fragment() {

    private var _binding: FragmentAgendaBinding? = null
    private val binding get() = _binding!!
    private val agendaViewModel: AgendaViewModel by viewModels()
    private val authViewModel: AuthViewModel by activityViewModels()
    private lateinit var adapter: VisitasAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAgendaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupToolbar()
        setupDate()
        observeState()

        // Cargar agenda del usuario actual
        viewLifecycleOwner.lifecycleScope.launch {
            authViewModel.currentUser.collect { user ->
                user?.let { agendaViewModel.cargarAgenda(it.id) }
            }
        }

        binding.swipeRefresh.setOnRefreshListener {
            viewLifecycleOwner.lifecycleScope.launch {
                authViewModel.currentUser.value?.let {
                    agendaViewModel.cargarAgenda(it.id)
                }
            }
            binding.swipeRefresh.isRefreshing = false
        }
    }

    private fun setupRecyclerView() {
        adapter = VisitasAdapter(
            onVerDetalle = { visita ->
                val bundle = Bundle().apply { putString("visitaId", visita.id) }
                findNavController().navigate(R.id.action_agenda_to_visita, bundle)
            },
            onIniciar = { visita -> agendaViewModel.iniciarVisita(visita.id) }
        )
        binding.rvVisitas.layoutManager = LinearLayoutManager(requireContext())
        binding.rvVisitas.adapter = adapter
    }

    private fun setupToolbar() {
        binding.toolbar.setOnMenuItemClickListener { item ->
            if (item.itemId == R.id.menu_logout) {
                authViewModel.logout()
                findNavController().navigate(R.id.loginFragment, null, androidx.navigation.NavOptions.Builder()
                    .setPopUpTo(R.id.nav_graph, true)
                    .build())
                true
            } else false
        }
    }

    private fun setupDate() {
        val hoy = LocalDate.now()
        val diaSemana = hoy.dayOfWeek.getDisplayName(TextStyle.FULL, Locale("es"))
        val fecha = hoy.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", Locale("es")))
        binding.tvFecha.text = "${diaSemana.replaceFirstChar { it.uppercase() }}, $fecha"
    }

    private fun observeState() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                agendaViewModel.uiState.collect { state ->
                    if (state.visitasHoy.isEmpty() && !state.isLoading) {
                        binding.tvEmpty.visibility = View.VISIBLE
                        binding.rvVisitas.visibility = View.GONE
                    } else {
                        binding.tvEmpty.visibility = View.GONE
                        binding.rvVisitas.visibility = View.VISIBLE
                        adapter.submitList(state.visitasHoy, state.pacientes)
                    }
                }
            }
        }
    }
    
    // ... (rest of the file)
}

// ── Adapter ─────────────────────────────────────────────────────────────────

class VisitasAdapter(
    private val onVerDetalle: (Visita) -> Unit,
    private val onIniciar: (Visita) -> Unit
) : RecyclerView.Adapter<VisitasAdapter.VH>() {

    private val items = mutableListOf<Visita>()
    private var pacientes = mapOf<String, Paciente>()

    fun submitList(list: List<Visita>, pacientes: Map<String, Paciente>) {
        this.items.clear()
        this.items.addAll(list)
        this.pacientes = pacientes
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = ItemVisitaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])

    inner class VH(private val b: ItemVisitaBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(visita: Visita) {
            val paciente = pacientes[visita.pacienteId]
            val inicio = visita.fechaHoraInicio.toLocalTime().toString().substring(0, 5)
            val fin = visita.fechaHoraFin.toLocalTime().toString().substring(0, 5)
            
            b.tvHora.text = "$inicio — $fin"
            b.tvNombrePaciente.text = paciente?.let { "${it.nombre} ${it.apellidos}" } ?: "Paciente desconocido"
            b.tvDireccion.text = paciente?.direccion ?: visita.pacienteId
            b.tvTareasCount.text = "${visita.tareas.count { it.completada }}/${visita.tareas.size} tareas completadas"

            val (estadoLabel, estadoColor) = when (visita.estado) {
                EstadoVisita.PENDIENTE -> "Pendiente" to 0xFF757575.toInt()
                EstadoVisita.EN_CURSO -> "En curso" to 0xFF388E3C.toInt()
                EstadoVisita.COMPLETADA -> "Completada" to 0xFF1565C0.toInt()
                EstadoVisita.CANCELADA -> "Cancelada" to 0xFFD32F2F.toInt()
            }
            b.tvEstado.text = estadoLabel
            b.tvEstado.setBackgroundColor(estadoColor)
            // b.tvEstado.setPadding(16, 4, 16, 4) // Ya tiene padding en el XML usualmente o se maneja con background drawable

            b.btnVerVisita.setOnClickListener { onVerDetalle(visita) }
        }
    }
}
