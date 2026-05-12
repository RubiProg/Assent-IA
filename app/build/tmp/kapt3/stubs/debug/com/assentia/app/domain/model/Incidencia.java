package com.assentia.app.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010\'\u001a\u00020\fH\u00c6\u0003J\t\u0010(\u001a\u00020\u000eH\u00c6\u0003Jq\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012\u00a8\u00060"}, d2 = {"Lcom/assentia/app/domain/model/Incidencia;", "", "id", "", "pacienteId", "cuidadorId", "visitaId", "titulo", "descripcion", "gravedad", "Lcom/assentia/app/domain/model/GravedadIncidencia;", "estado", "Lcom/assentia/app/domain/model/EstadoIncidencia;", "fechaHora", "Ljava/time/LocalDateTime;", "fotoUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assentia/app/domain/model/GravedadIncidencia;Lcom/assentia/app/domain/model/EstadoIncidencia;Ljava/time/LocalDateTime;Ljava/lang/String;)V", "getCuidadorId", "()Ljava/lang/String;", "getDescripcion", "getEstado", "()Lcom/assentia/app/domain/model/EstadoIncidencia;", "getFechaHora", "()Ljava/time/LocalDateTime;", "getFotoUrl", "getGravedad", "()Lcom/assentia/app/domain/model/GravedadIncidencia;", "getId", "getPacienteId", "getTitulo", "getVisitaId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Incidencia {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pacienteId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cuidadorId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String visitaId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String titulo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String descripcion = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.model.GravedadIncidencia gravedad = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.model.EstadoIncidencia estado = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime fechaHora = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String fotoUrl = null;
    
    public Incidencia(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId, @org.jetbrains.annotations.NotNull()
    java.lang.String cuidadorId, @org.jetbrains.annotations.Nullable()
    java.lang.String visitaId, @org.jetbrains.annotations.NotNull()
    java.lang.String titulo, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.GravedadIncidencia gravedad, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.EstadoIncidencia estado, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime fechaHora, @org.jetbrains.annotations.Nullable()
    java.lang.String fotoUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPacienteId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCuidadorId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVisitaId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitulo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescripcion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.domain.model.GravedadIncidencia getGravedad() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.domain.model.EstadoIncidencia getEstado() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getFechaHora() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFotoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.domain.model.GravedadIncidencia component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.domain.model.EstadoIncidencia component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.domain.model.Incidencia copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId, @org.jetbrains.annotations.NotNull()
    java.lang.String cuidadorId, @org.jetbrains.annotations.Nullable()
    java.lang.String visitaId, @org.jetbrains.annotations.NotNull()
    java.lang.String titulo, @org.jetbrains.annotations.NotNull()
    java.lang.String descripcion, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.GravedadIncidencia gravedad, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.EstadoIncidencia estado, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime fechaHora, @org.jetbrains.annotations.Nullable()
    java.lang.String fotoUrl) {
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