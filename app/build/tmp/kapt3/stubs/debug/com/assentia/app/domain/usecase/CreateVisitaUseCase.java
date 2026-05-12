package com.assentia.app.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JJ\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086B\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0013"}, d2 = {"Lcom/assentia/app/domain/usecase/CreateVisitaUseCase;", "", "visitaRepository", "Lcom/assentia/app/domain/repository/VisitaRepository;", "(Lcom/assentia/app/domain/repository/VisitaRepository;)V", "invoke", "Lkotlin/Result;", "Lcom/assentia/app/domain/model/Visita;", "pacienteId", "", "cuidadorId", "inicio", "Ljava/time/LocalDateTime;", "fin", "tareas", "", "Lcom/assentia/app/domain/model/TareaVisita;", "invoke-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CreateVisitaUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.repository.VisitaRepository visitaRepository = null;
    
    @javax.inject.Inject()
    public CreateVisitaUseCase(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.repository.VisitaRepository visitaRepository) {
        super();
    }
}