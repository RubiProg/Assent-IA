package com.assentia.app.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0015H\u0016J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0013J*\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n2\u0006\u0010\u0019\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001a\u0010\u0013J*\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n2\u0006\u0010\u001c\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001d\u0010\u0013J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006 "}, d2 = {"Lcom/assentia/app/data/repository/PacienteRepositoryImpl;", "Lcom/assentia/app/domain/repository/PacienteRepository;", "mock", "Lcom/assentia/app/data/datasource/MockDataSource;", "(Lcom/assentia/app/data/datasource/MockDataSource;)V", "_pacientes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/assentia/app/domain/model/Paciente;", "createPaciente", "Lkotlin/Result;", "paciente", "createPaciente-gIAlu-s", "(Lcom/assentia/app/domain/model/Paciente;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePaciente", "", "id", "", "deletePaciente-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPacientes", "Lkotlinx/coroutines/flow/Flow;", "getPacienteById", "getPacienteById-gIAlu-s", "getPacientesByCuidador", "cuidadorId", "getPacientesByCuidador-gIAlu-s", "getPacientesByFamiliar", "familiarId", "getPacientesByFamiliar-gIAlu-s", "updatePaciente", "updatePaciente-gIAlu-s", "app_debug"})
public final class PacienteRepositoryImpl implements com.assentia.app.domain.repository.PacienteRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.data.datasource.MockDataSource mock = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.assentia.app.domain.model.Paciente>> _pacientes = null;
    
    @javax.inject.Inject()
    public PacienteRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.datasource.MockDataSource mock) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.assentia.app.domain.model.Paciente>> getAllPacientes() {
        return null;
    }
}