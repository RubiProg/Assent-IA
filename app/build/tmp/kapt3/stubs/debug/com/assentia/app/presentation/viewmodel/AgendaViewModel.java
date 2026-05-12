package com.assentia.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0015R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/assentia/app/presentation/viewmodel/AgendaViewModel;", "Landroidx/lifecycle/ViewModel;", "getVisitasHoyUseCase", "Lcom/assentia/app/domain/usecase/GetVisitasHoyUseCase;", "getVisitasByCuidadorUseCase", "Lcom/assentia/app/domain/usecase/GetVisitasByCuidadorUseCase;", "getAllPacientesUseCase", "Lcom/assentia/app/domain/usecase/GetAllPacientesUseCase;", "iniciarVisitaUseCase", "Lcom/assentia/app/domain/usecase/IniciarVisitaUseCase;", "(Lcom/assentia/app/domain/usecase/GetVisitasHoyUseCase;Lcom/assentia/app/domain/usecase/GetVisitasByCuidadorUseCase;Lcom/assentia/app/domain/usecase/GetAllPacientesUseCase;Lcom/assentia/app/domain/usecase/IniciarVisitaUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/assentia/app/presentation/state/AgendaUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "cargarAgenda", "", "cuidadorId", "", "clearVisitaIniciada", "iniciarVisita", "visitaId", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AgendaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetVisitasHoyUseCase getVisitasHoyUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetVisitasByCuidadorUseCase getVisitasByCuidadorUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetAllPacientesUseCase getAllPacientesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.IniciarVisitaUseCase iniciarVisitaUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assentia.app.presentation.state.AgendaUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.AgendaUiState> uiState = null;
    
    @javax.inject.Inject()
    public AgendaViewModel(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetVisitasHoyUseCase getVisitasHoyUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetVisitasByCuidadorUseCase getVisitasByCuidadorUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetAllPacientesUseCase getAllPacientesUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.IniciarVisitaUseCase iniciarVisitaUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.AgendaUiState> getUiState() {
        return null;
    }
    
    public final void cargarAgenda(@org.jetbrains.annotations.NotNull()
    java.lang.String cuidadorId) {
    }
    
    public final void iniciarVisita(@org.jetbrains.annotations.NotNull()
    java.lang.String visitaId) {
    }
    
    public final void clearVisitaIniciada() {
    }
}