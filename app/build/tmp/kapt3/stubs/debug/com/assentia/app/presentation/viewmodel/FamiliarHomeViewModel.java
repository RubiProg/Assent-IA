package com.assentia.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/assentia/app/presentation/viewmodel/FamiliarHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "getPacientesByFamiliarUseCase", "Lcom/assentia/app/domain/usecase/GetPacientesByFamiliarUseCase;", "getVisitasByPacienteUseCase", "Lcom/assentia/app/domain/usecase/GetVisitasByPacienteUseCase;", "getUnreadCountUseCase", "Lcom/assentia/app/domain/usecase/GetUnreadCountUseCase;", "(Lcom/assentia/app/domain/usecase/GetPacientesByFamiliarUseCase;Lcom/assentia/app/domain/usecase/GetVisitasByPacienteUseCase;Lcom/assentia/app/domain/usecase/GetUnreadCountUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/assentia/app/presentation/state/FamiliarHomeUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "cargarHome", "", "familiarId", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FamiliarHomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetPacientesByFamiliarUseCase getPacientesByFamiliarUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetVisitasByPacienteUseCase getVisitasByPacienteUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetUnreadCountUseCase getUnreadCountUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assentia.app.presentation.state.FamiliarHomeUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.FamiliarHomeUiState> uiState = null;
    
    @javax.inject.Inject()
    public FamiliarHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetPacientesByFamiliarUseCase getPacientesByFamiliarUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetVisitasByPacienteUseCase getVisitasByPacienteUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetUnreadCountUseCase getUnreadCountUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.FamiliarHomeUiState> getUiState() {
        return null;
    }
    
    public final void cargarHome(@org.jetbrains.annotations.NotNull()
    java.lang.String familiarId) {
    }
}