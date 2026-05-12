package com.assentia.app.presentation.state;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\t\u0010(\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016\u00a8\u0006)"}, d2 = {"Lcom/assentia/app/presentation/state/AdminDashboardUiState;", "", "isLoading", "", "totalPacientes", "", "totalCuidadores", "visitasHoy", "incidenciasAbiertas", "visitasPendientes", "", "Lcom/assentia/app/domain/model/Visita;", "incidenciasRecientes", "Lcom/assentia/app/domain/model/Incidencia;", "error", "", "(ZIIIILjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getIncidenciasAbiertas", "()I", "getIncidenciasRecientes", "()Ljava/util/List;", "()Z", "getTotalCuidadores", "getTotalPacientes", "getVisitasHoy", "getVisitasPendientes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class AdminDashboardUiState {
    private final boolean isLoading = false;
    private final int totalPacientes = 0;
    private final int totalCuidadores = 0;
    private final int visitasHoy = 0;
    private final int incidenciasAbiertas = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Visita> visitasPendientes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Incidencia> incidenciasRecientes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    public AdminDashboardUiState(boolean isLoading, int totalPacientes, int totalCuidadores, int visitasHoy, int incidenciasAbiertas, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Visita> visitasPendientes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Incidencia> incidenciasRecientes, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final int getTotalPacientes() {
        return 0;
    }
    
    public final int getTotalCuidadores() {
        return 0;
    }
    
    public final int getVisitasHoy() {
        return 0;
    }
    
    public final int getIncidenciasAbiertas() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Visita> getVisitasPendientes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Incidencia> getIncidenciasRecientes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public AdminDashboardUiState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Visita> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Incidencia> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.presentation.state.AdminDashboardUiState copy(boolean isLoading, int totalPacientes, int totalCuidadores, int visitasHoy, int incidenciasAbiertas, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Visita> visitasPendientes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Incidencia> incidenciasRecientes, @org.jetbrains.annotations.Nullable()
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