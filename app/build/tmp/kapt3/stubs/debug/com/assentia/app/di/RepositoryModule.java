package com.assentia.app.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0018H\'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001bH\'\u00a8\u0006\u001c"}, d2 = {"Lcom/assentia/app/di/RepositoryModule;", "", "()V", "bindAuthRepository", "Lcom/assentia/app/domain/repository/AuthRepository;", "impl", "Lcom/assentia/app/data/repository/AuthRepositoryImpl;", "bindIncidenciaRepository", "Lcom/assentia/app/domain/repository/IncidenciaRepository;", "Lcom/assentia/app/data/repository/IncidenciaRepositoryImpl;", "bindMedicacionRepository", "Lcom/assentia/app/domain/repository/MedicacionRepository;", "Lcom/assentia/app/data/repository/MedicacionRepositoryImpl;", "bindMensajeRepository", "Lcom/assentia/app/domain/repository/MensajeRepository;", "Lcom/assentia/app/data/repository/MensajeRepositoryImpl;", "bindPacienteRepository", "Lcom/assentia/app/domain/repository/PacienteRepository;", "Lcom/assentia/app/data/repository/PacienteRepositoryImpl;", "bindUserRepository", "Lcom/assentia/app/domain/repository/UserRepository;", "Lcom/assentia/app/data/repository/UserRepositoryImpl;", "bindValoracionRepository", "Lcom/assentia/app/domain/repository/ValoracionRepository;", "Lcom/assentia/app/data/repository/ValoracionRepositoryImpl;", "bindVisitaRepository", "Lcom/assentia/app/domain/repository/VisitaRepository;", "Lcom/assentia/app/data/repository/VisitaRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.assentia.app.domain.repository.AuthRepository bindAuthRepository(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.repository.AuthRepositoryImpl impl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.assentia.app.domain.repository.UserRepository bindUserRepository(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.repository.UserRepositoryImpl impl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.assentia.app.domain.repository.PacienteRepository bindPacienteRepository(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.repository.PacienteRepositoryImpl impl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.assentia.app.domain.repository.VisitaRepository bindVisitaRepository(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.repository.VisitaRepositoryImpl impl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.assentia.app.domain.repository.MedicacionRepository bindMedicacionRepository(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.repository.MedicacionRepositoryImpl impl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.assentia.app.domain.repository.IncidenciaRepository bindIncidenciaRepository(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.repository.IncidenciaRepositoryImpl impl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.assentia.app.domain.repository.MensajeRepository bindMensajeRepository(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.repository.MensajeRepositoryImpl impl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.assentia.app.domain.repository.ValoracionRepository bindValoracionRepository(@org.jetbrains.annotations.NotNull()
    com.assentia.app.data.repository.ValoracionRepositoryImpl impl);
}