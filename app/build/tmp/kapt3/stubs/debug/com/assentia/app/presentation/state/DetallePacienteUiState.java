package com.assentia.app.presentation.state;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017\u00a8\u0006*"}, d2 = {"Lcom/assentia/app/presentation/state/DetallePacienteUiState;", "", "isLoading", "", "paciente", "Lcom/assentia/app/domain/model/Paciente;", "cuidadorAsignado", "Lcom/assentia/app/domain/model/User;", "visitasRecientes", "", "Lcom/assentia/app/domain/model/Visita;", "medicaciones", "Lcom/assentia/app/domain/model/Medicacion;", "incidencias", "Lcom/assentia/app/domain/model/Incidencia;", "error", "", "(ZLcom/assentia/app/domain/model/Paciente;Lcom/assentia/app/domain/model/User;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getCuidadorAsignado", "()Lcom/assentia/app/domain/model/User;", "getError", "()Ljava/lang/String;", "getIncidencias", "()Ljava/util/List;", "()Z", "getMedicaciones", "getPaciente", "()Lcom/assentia/app/domain/model/Paciente;", "getVisitasRecientes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class DetallePacienteUiState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final com.assentia.app.domain.model.Paciente paciente = null;
    @org.jetbrains.annotations.Nullable()
    private final com.assentia.app.domain.model.User cuidadorAsignado = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Visita> visitasRecientes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Medicacion> medicaciones = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Incidencia> incidencias = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    public DetallePacienteUiState(boolean isLoading, @org.jetbrains.annotations.Nullable()
    com.assentia.app.domain.model.Paciente paciente, @org.jetbrains.annotations.Nullable()
    com.assentia.app.domain.model.User cuidadorAsignado, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Visita> visitasRecientes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Medicacion> medicaciones, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Incidencia> incidencias, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.assentia.app.domain.model.Paciente getPaciente() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.assentia.app.domain.model.User getCuidadorAsignado() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Visita> getVisitasRecientes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Medicacion> getMedicaciones() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Incidencia> getIncidencias() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public DetallePacienteUiState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.assentia.app.domain.model.Paciente component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.assentia.app.domain.model.User component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Visita> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Medicacion> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Incidencia> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.presentation.state.DetallePacienteUiState copy(boolean isLoading, @org.jetbrains.annotations.Nullable()
    com.assentia.app.domain.model.Paciente paciente, @org.jetbrains.annotations.Nullable()
    com.assentia.app.domain.model.User cuidadorAsignado, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Visita> visitasRecientes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Medicacion> medicaciones, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Incidencia> incidencias, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}