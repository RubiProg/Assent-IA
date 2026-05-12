package com.assentia.app.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\tH&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t2\u0006\u0010\f\u001a\u00020\rH&J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t2\u0006\u0010\u000f\u001a\u00020\rH&J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0016"}, d2 = {"Lcom/assentia/app/domain/repository/IncidenciaRepository;", "", "createIncidencia", "Lkotlin/Result;", "Lcom/assentia/app/domain/model/Incidencia;", "incidencia", "createIncidencia-gIAlu-s", "(Lcom/assentia/app/domain/model/Incidencia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllIncidenciasAbiertas", "Lkotlinx/coroutines/flow/Flow;", "", "getIncidenciasByCuidador", "cuidadorId", "", "getIncidenciasByPaciente", "pacienteId", "updateEstado", "id", "estado", "Lcom/assentia/app/domain/model/EstadoIncidencia;", "updateEstado-0E7RQCE", "(Ljava/lang/String;Lcom/assentia/app/domain/model/EstadoIncidencia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IncidenciaRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.assentia.app.domain.model.Incidencia>> getIncidenciasByPaciente(@org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.assentia.app.domain.model.Incidencia>> getIncidenciasByCuidador(@org.jetbrains.annotations.NotNull()
    java.lang.String cuidadorId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.assentia.app.domain.model.Incidencia>> getAllIncidenciasAbiertas();
}