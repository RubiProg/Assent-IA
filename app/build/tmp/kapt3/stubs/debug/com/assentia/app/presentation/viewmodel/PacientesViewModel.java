package com.assentia.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020#J\u0006\u0010\'\u001a\u00020#J\u000e\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u001fJ6\u0010*\u001a\u00020#2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020%J$\u00100\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f2\u0006\u0010$\u001a\u00020%H\u0002R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/assentia/app/presentation/viewmodel/PacientesViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllPacientesUseCase", "Lcom/assentia/app/domain/usecase/GetAllPacientesUseCase;", "createPacienteUseCase", "Lcom/assentia/app/domain/usecase/CreatePacienteUseCase;", "updatePacienteUseCase", "Lcom/assentia/app/domain/usecase/UpdatePacienteUseCase;", "userRepository", "Lcom/assentia/app/domain/repository/UserRepository;", "medicacionRepository", "Lcom/assentia/app/domain/repository/MedicacionRepository;", "(Lcom/assentia/app/domain/usecase/GetAllPacientesUseCase;Lcom/assentia/app/domain/usecase/CreatePacienteUseCase;Lcom/assentia/app/domain/usecase/UpdatePacienteUseCase;Lcom/assentia/app/domain/repository/UserRepository;Lcom/assentia/app/domain/repository/MedicacionRepository;)V", "_cuidadores", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/assentia/app/domain/model/User;", "_guardadoExitoso", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "_uiState", "Lcom/assentia/app/presentation/state/PacientesUiState;", "cuidadores", "Lkotlinx/coroutines/flow/StateFlow;", "getCuidadores", "()Lkotlinx/coroutines/flow/StateFlow;", "guardadoExitoso", "Lkotlinx/coroutines/flow/SharedFlow;", "getGuardadoExitoso", "()Lkotlinx/coroutines/flow/SharedFlow;", "todosLosPacientes", "Lcom/assentia/app/domain/model/Paciente;", "uiState", "getUiState", "buscar", "", "query", "", "cargarCuidadores", "cargarPacientes", "crearPaciente", "paciente", "crearPacienteCompleto", "familiarNombre", "familiarEmail", "familiarTelefono", "medicacionNombre", "medicacionDosis", "filtrar", "pacientes", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PacientesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetAllPacientesUseCase getAllPacientesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.CreatePacienteUseCase createPacienteUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.UpdatePacienteUseCase updatePacienteUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.repository.MedicacionRepository medicacionRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assentia.app.presentation.state.PacientesUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.PacientesUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.assentia.app.domain.model.User>> _cuidadores = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assentia.app.domain.model.User>> cuidadores = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> _guardadoExitoso = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> guardadoExitoso = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.assentia.app.domain.model.Paciente> todosLosPacientes;
    
    @javax.inject.Inject()
    public PacientesViewModel(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetAllPacientesUseCase getAllPacientesUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.CreatePacienteUseCase createPacienteUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.UpdatePacienteUseCase updatePacienteUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.repository.MedicacionRepository medicacionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.PacientesUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.assentia.app.domain.model.User>> getCuidadores() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> getGuardadoExitoso() {
        return null;
    }
    
    public final void cargarPacientes() {
    }
    
    public final void cargarCuidadores() {
    }
    
    public final void buscar(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final java.util.List<com.assentia.app.domain.model.Paciente> filtrar(java.util.List<com.assentia.app.domain.model.Paciente> pacientes, java.lang.String query) {
        return null;
    }
    
    public final void crearPacienteCompleto(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.Paciente paciente, @org.jetbrains.annotations.NotNull()
    java.lang.String familiarNombre, @org.jetbrains.annotations.NotNull()
    java.lang.String familiarEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String familiarTelefono, @org.jetbrains.annotations.NotNull()
    java.lang.String medicacionNombre, @org.jetbrains.annotations.NotNull()
    java.lang.String medicacionDosis) {
    }
    
    public final void crearPaciente(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.Paciente paciente) {
    }
}