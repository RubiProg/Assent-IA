package com.assentia.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001dJ\u0018\u0010!\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\u001dJ\u0006\u0010$\u001a\u00020\u001bJ0\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010#\u001a\u00020\u001dR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006+"}, d2 = {"Lcom/assentia/app/presentation/viewmodel/DetalleVisitaViewModel;", "Landroidx/lifecycle/ViewModel;", "getVisitaByIdUseCase", "Lcom/assentia/app/domain/usecase/GetVisitaByIdUseCase;", "getPacienteByIdUseCase", "Lcom/assentia/app/domain/usecase/GetPacienteByIdUseCase;", "iniciarVisitaUseCase", "Lcom/assentia/app/domain/usecase/IniciarVisitaUseCase;", "completarVisitaUseCase", "Lcom/assentia/app/domain/usecase/CompletarVisitaUseCase;", "completarTareaUseCase", "Lcom/assentia/app/domain/usecase/CompletarTareaUseCase;", "getMedicacionPacienteUseCase", "Lcom/assentia/app/domain/usecase/GetMedicacionPacienteUseCase;", "getRegistrosMedicacionUseCase", "Lcom/assentia/app/domain/usecase/GetRegistrosMedicacionUseCase;", "registrarMedicacionUseCase", "Lcom/assentia/app/domain/usecase/RegistrarMedicacionUseCase;", "(Lcom/assentia/app/domain/usecase/GetVisitaByIdUseCase;Lcom/assentia/app/domain/usecase/GetPacienteByIdUseCase;Lcom/assentia/app/domain/usecase/IniciarVisitaUseCase;Lcom/assentia/app/domain/usecase/CompletarVisitaUseCase;Lcom/assentia/app/domain/usecase/CompletarTareaUseCase;Lcom/assentia/app/domain/usecase/GetMedicacionPacienteUseCase;Lcom/assentia/app/domain/usecase/GetRegistrosMedicacionUseCase;Lcom/assentia/app/domain/usecase/RegistrarMedicacionUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/assentia/app/presentation/state/DetalleVisitaUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "cargarDatos", "", "visitaId", "", "clearError", "completarTarea", "tareaId", "completarVisita", "firma", "observaciones", "iniciarVisita", "registrarMedicacion", "medicacionId", "pacienteId", "cuidadorId", "administrada", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DetalleVisitaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetVisitaByIdUseCase getVisitaByIdUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetPacienteByIdUseCase getPacienteByIdUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.IniciarVisitaUseCase iniciarVisitaUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.CompletarVisitaUseCase completarVisitaUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.CompletarTareaUseCase completarTareaUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetMedicacionPacienteUseCase getMedicacionPacienteUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetRegistrosMedicacionUseCase getRegistrosMedicacionUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.RegistrarMedicacionUseCase registrarMedicacionUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assentia.app.presentation.state.DetalleVisitaUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.DetalleVisitaUiState> uiState = null;
    
    @javax.inject.Inject()
    public DetalleVisitaViewModel(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetVisitaByIdUseCase getVisitaByIdUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetPacienteByIdUseCase getPacienteByIdUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.IniciarVisitaUseCase iniciarVisitaUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.CompletarVisitaUseCase completarVisitaUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.CompletarTareaUseCase completarTareaUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetMedicacionPacienteUseCase getMedicacionPacienteUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetRegistrosMedicacionUseCase getRegistrosMedicacionUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.RegistrarMedicacionUseCase registrarMedicacionUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.DetalleVisitaUiState> getUiState() {
        return null;
    }
    
    public final void cargarDatos(@org.jetbrains.annotations.NotNull()
    java.lang.String visitaId) {
    }
    
    public final void iniciarVisita() {
    }
    
    public final void completarTarea(@org.jetbrains.annotations.NotNull()
    java.lang.String tareaId) {
    }
    
    public final void registrarMedicacion(@org.jetbrains.annotations.NotNull()
    java.lang.String medicacionId, @org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId, @org.jetbrains.annotations.NotNull()
    java.lang.String cuidadorId, boolean administrada, @org.jetbrains.annotations.NotNull()
    java.lang.String observaciones) {
    }
    
    public final void completarVisita(@org.jetbrains.annotations.Nullable()
    java.lang.String firma, @org.jetbrains.annotations.NotNull()
    java.lang.String observaciones) {
    }
    
    public final void clearError() {
    }
}