package com.assentia.app.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0017\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001a"}, d2 = {"Lcom/assentia/app/data/repository/MensajeRepositoryImpl;", "Lcom/assentia/app/domain/repository/MensajeRepository;", "mock", "Lcom/assentia/app/data/datasource/MockDataSource;", "(Lcom/assentia/app/data/datasource/MockDataSource;)V", "_mensajes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/assentia/app/domain/model/Mensaje;", "enviarMensaje", "Lkotlin/Result;", "mensaje", "enviarMensaje-gIAlu-s", "(Lcom/assentia/app/domain/model/Mensaje;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMensajesByPaciente", "Lkotlinx/coroutines/flow/Flow;", "pacienteId", "", "userId", "getUnreadCount", "", "marcarComoLeido", "", "mensajeId", "marcarComoLeido-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MensajeRepositoryImpl implements com.assentia.app.domain.repository.MensajeRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.data.datasource.MockDataSource mock = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.assentia.app.domain.model.Mensaje>> _mensajes = null;
    
    @javax.inject.Inject()
    public MensajeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.datasource.MockDataSource mock) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.assentia.app.domain.model.Mensaje>> getMensajesByPaciente(@org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.lang.Integer> getUnreadCount(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
}