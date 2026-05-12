package com.assentia.app.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.assentia.app.R
import com.assentia.app.databinding.FragmentLoginBinding
import com.assentia.app.domain.model.UserRole
import com.assentia.app.presentation.viewmodel.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AuthViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
        observeState()
    }

    private fun setupListeners() {
        binding.etEmail.doOnTextChanged { _, _, _, _ -> viewModel.clearErrors() }
        binding.etPassword.doOnTextChanged { _, _, _, _ -> viewModel.clearErrors() }

        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text?.toString().orEmpty().trim()
            val password = binding.etPassword.text?.toString().orEmpty()
            viewModel.login(email, password)
        }
    }

    private fun observeState() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    binding.progressBar.visibility = if (state.isLoading) View.VISIBLE else View.GONE
                    binding.btnLogin.isEnabled = !state.isLoading

                    binding.tilEmail.error = state.emailError
                    binding.tilPassword.error = state.passwordError

                    if (state.error != null) {
                        binding.tvError.visibility = View.VISIBLE
                        binding.tvError.text = state.error
                    } else {
                        binding.tvError.visibility = View.GONE
                    }

                    state.user?.let { user ->
                        when (user.rol) {
                            UserRole.ADMIN -> findNavController().navigate(R.id.action_login_to_admin)
                            UserRole.CUIDADOR -> findNavController().navigate(R.id.action_login_to_cuidador)
                            UserRole.FAMILIAR -> findNavController().navigate(R.id.action_login_to_familiar)
                        }
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
