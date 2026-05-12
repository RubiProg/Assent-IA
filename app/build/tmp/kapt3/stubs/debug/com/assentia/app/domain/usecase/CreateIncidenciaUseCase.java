package com.assentia.app.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JZ\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0086B\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0013"}, d2 = {"Lcom/assentia/app/domain/usecase/CreateIncidenciaUseCase;", "", "incidenciaRepository", "Lcom/assentia/app/domain/repository/IncidenciaRepository;", "(Lcom/assentia/app/domain/repository/IncidenciaRepository;)V", "invoke", "Lkotlin/Result;", "Lcom/assentia/app/domain/model/Incidencia;", "pacienteId", "", "cuidadorId", "visitaId", "titulo", "descripcion", "gravedad", "Lcom/assentia/app/domain/model/GravedadIncidencia;", "fotoUrl", "invoke-eH_QyT8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assentia/app/domain/model/GravedadIncidencia;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CreateIncidenciaUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.repository.IncidenciaRepository incidenciaRepository = null;
    
    @javax.inject.Inject()
    public CreateIncidenciaUseCase(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.repository.IncidenciaRepository incidenciaRepository) {
        super();
    }
}