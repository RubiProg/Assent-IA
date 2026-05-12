package com.assentia.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0017JD\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0019J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0019J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013\u00a8\u0006&"}, d2 = {"Lcom/assentia/app/presentation/viewmodel/IncidenciasViewModel;", "Landroidx/lifecycle/ViewModel;", "getIncidenciasByPacienteUseCase", "Lcom/assentia/app/domain/usecase/GetIncidenciasByPacienteUseCase;", "getIncidenciasAbiertasUseCase", "Lcom/assentia/app/domain/usecase/GetIncidenciasAbiertasUseCase;", "createIncidenciaUseCase", "Lcom/assentia/app/domain/usecase/CreateIncidenciaUseCase;", "resolverIncidenciaUseCase", "Lcom/assentia/app/domain/usecase/ResolverIncidenciaUseCase;", "(Lcom/assentia/app/domain/usecase/GetIncidenciasByPacienteUseCase;Lcom/assentia/app/domain/usecase/GetIncidenciasAbiertasUseCase;Lcom/assentia/app/domain/usecase/CreateIncidenciaUseCase;Lcom/assentia/app/domain/usecase/ResolverIncidenciaUseCase;)V", "_nuevaState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/assentia/app/presentation/state/NuevaIncidenciaUiState;", "_uiState", "Lcom/assentia/app/presentation/state/IncidenciasUiState;", "nuevaState", "Lkotlinx/coroutines/flow/StateFlow;", "getNuevaState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "cargarIncidencias", "", "pacienteId", "", "clearError", "crearIncidencia", "cuidadorId", "visitaId", "titulo", "descripcion", "gravedad", "Lcom/assentia/app/domain/model/GravedadIncidencia;", "fotoUrl", "resolverIncidencia", "id", "setGravedad", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class IncidenciasViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetIncidenciasByPacienteUseCase getIncidenciasByPacienteUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetIncidenciasAbiertasUseCase getIncidenciasAbiertasUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.CreateIncidenciaUseCase createIncidenciaUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.ResolverIncidenciaUseCase resolverIncidenciaUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assentia.app.presentation.state.IncidenciasUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.IncidenciasUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assentia.app.presentation.state.NuevaIncidenciaUiState> _nuevaState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.NuevaIncidenciaUiState> nuevaState = null;
    
    @javax.inject.Inject()
    public IncidenciasViewModel(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetIncidenciasByPacienteUseCase getIncidenciasByPacienteUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetIncidenciasAbiertasUseCase getIncidenciasAbiertasUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.CreateIncidenciaUseCase createIncidenciaUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.ResolverIncidenciaUseCase resolverIncidenciaUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.IncidenciasUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.NuevaIncidenciaUiState> getNuevaState() {
        return null;
    }
    
    public final void cargarIncidencias(@org.jetbrains.annotations.Nullable()
    java.lang.String pacienteId) {
    }
    
    public final void crearIncidencia(@org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId, @org.jetbrains.annotations.NotNull()
    java.lang.String cuidadorId, @org.jetbrains.annotations.Nullable()
    java.lang.String visitaId, @org.jetbrains.annotations.NotNull()
    java.lang.String titulo, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.GravedadIncidencia gravedad, @org.jetbrains.annotations.Nullable()
    java.lang.String fotoUrl) {
    }
    
    public final void resolverIncidencia(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void setGravedad(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.GravedadIncidencia gravedad) {
    }
    
    public final void clearError() {
    }
}