package com.assentia.app.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jk\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006."}, d2 = {"Lcom/assentia/app/domain/model/Visita;", "", "id", "", "pacienteId", "cuidadorId", "fechaHoraInicio", "Ljava/time/LocalDateTime;", "fechaHoraFin", "estado", "Lcom/assentia/app/domain/model/EstadoVisita;", "tareas", "", "Lcom/assentia/app/domain/model/TareaVisita;", "observaciones", "firmaDigital", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Lcom/assentia/app/domain/model/EstadoVisita;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCuidadorId", "()Ljava/lang/String;", "getEstado", "()Lcom/assentia/app/domain/model/EstadoVisita;", "getFechaHoraFin", "()Ljava/time/LocalDateTime;", "getFechaHoraInicio", "getFirmaDigital", "getId", "getObservaciones", "getPacienteId", "getTareas", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Visita {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pacienteId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cuidadorId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime fechaHoraInicio = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime fechaHoraFin = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.model.EstadoVisita estado = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.TareaVisita> tareas = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String observaciones = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String firmaDigital = null;
    
    public Visita(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId, @org.jetbrains.annotations.NotNull()
    java.lang.String cuidadorId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime fechaHoraInicio, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime fechaHoraFin, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.EstadoVisita estado, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.TareaVisita> tareas, @org.jetbrains.annotations.NotNull()
    java.lang.String observaciones, @org.jetbrains.annotations.Nullable()
    java.lang.String firmaDigital) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getFechaHoraInicio() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getFechaHoraFin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.domain.model.EstadoVisita getEstado() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.TareaVisita> getTareas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getObservaciones() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirmaDigital() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.domain.model.EstadoVisita component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.assentia.app.domain.model.TareaVisita> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.assentia.app.domain.model.Visita copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId, @org.jetbrains.annotations.NotNull()
    java.lang.String cuidadorId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime fechaHoraInicio, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime fechaHoraFin, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.model.EstadoVisita estado, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.TareaVisita> tareas, @org.jetbrains.annotations.NotNull()
    java.lang.String observaciones, @org.jetbrains.annotations.Nullable()
    java.lang.String firmaDigital) {
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