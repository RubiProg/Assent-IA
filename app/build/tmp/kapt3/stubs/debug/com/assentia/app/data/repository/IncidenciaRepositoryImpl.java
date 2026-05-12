package com.assentia.app.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000fH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001b"}, d2 = {"Lcom/assentia/app/data/repository/IncidenciaRepositoryImpl;", "Lcom/assentia/app/domain/repository/IncidenciaRepository;", "mock", "Lcom/assentia/app/data/datasource/MockDataSource;", "(Lcom/assentia/app/data/datasource/MockDataSource;)V", "_incidencias", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/assentia/app/domain/model/Incidencia;", "createIncidencia", "Lkotlin/Result;", "incidencia", "createIncidencia-gIAlu-s", "(Lcom/assentia/app/domain/model/Incidencia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllIncidenciasAbiertas", "Lkotlinx/coroutines/flow/Flow;", "getIncidenciasByCuidador", "cuidadorId", "", "getIncidenciasByPaciente", "pacienteId", "updateEstado", "id", "estado", "Lcom/assentia/app/domain/model/EstadoIncidencia;", "updateEstado-0E7RQCE", "(Ljava/lang/String;Lcom/assentia/app/domain/model/EstadoIncidencia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class IncidenciaRepositoryImpl implements com.assentia.app.domain.repository.IncidenciaRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.data.datasource.MockDataSource mock = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.assentia.app.domain.model.Incidencia>> _incidencias = null;
    
    @javax.inject.Inject()
    public IncidenciaRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.datasource.MockDataSource mock) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.assentia.app.domain.model.Incidencia>> getIncidenciasByPaciente(@org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.assentia.app.domain.model.Incidencia>> getIncidenciasByCuidador(@org.jetbrains.annotations.NotNull()
    java.lang.String cuidadorId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.assentia.app.domain.model.Incidencia>> getAllIncidenciasAbiertas() {
        return null;
    }
}