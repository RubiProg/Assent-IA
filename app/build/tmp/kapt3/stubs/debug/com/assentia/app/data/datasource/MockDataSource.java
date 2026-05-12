package com.assentia.app.data.datasource;

/**
 * Fuente de datos simulada. Sustituir por llamadas Retrofit cuando haya API real.
 * Todos los datos son ficticios pero realistas para facilitar el desarrollo y testing.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/assentia/app/data/datasource/MockDataSource;", "", "()V", "incidencias", "", "Lcom/assentia/app/domain/model/Incidencia;", "getIncidencias", "()Ljava/util/List;", "medicaciones", "Lcom/assentia/app/domain/model/Medicacion;", "getMedicaciones", "mensajes", "Lcom/assentia/app/domain/model/Mensaje;", "getMensajes", "pacientes", "Lcom/assentia/app/domain/model/Paciente;", "getPacientes", "passwords", "", "", "getPasswords", "()Ljava/util/Map;", "users", "Lcom/assentia/app/domain/model/User;", "getUsers", "visitas", "Lcom/assentia/app/domain/model/Visita;", "getVisitas", "app_debug"})
public final class MockDataSource {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.User> users = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> passwords = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Paciente> pacientes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Visita> visitas = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Medicacion> medicaciones = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Incidencia> incidencias = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Mensaje> mensajes = null;
    
    @javax.inject.Inject()
    public MockDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.User> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getPasswords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Paciente> getPacientes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Visita> getVisitas() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.Mensaje> getMensajes() {
        return null;
    }
}