package com.assentia.app.di

import com.assentia.app.data.repository.*
import com.assentia.app.domain.repository.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindAuthRepository(impl: AuthRepositoryImpl): AuthRepository

    @Binds
    @Singleton
    abstract fun bindUserRepository(impl: UserRepositoryImpl): UserRepository

    @Binds
    @Singleton
    abstract fun bindPacienteRepository(impl: PacienteRepositoryImpl): PacienteRepository

    @Binds
    @Singleton
    abstract fun bindVisitaRepository(impl: VisitaRepositoryImpl): VisitaRepository

    @Binds
    @Singleton
    abstract fun bindMedicacionRepository(impl: MedicacionRepositoryImpl): MedicacionRepository

    @Binds
    @Singleton
    abstract fun bindIncidenciaRepository(impl: IncidenciaRepositoryImpl): IncidenciaRepository

    @Binds
    @Singleton
    abstract fun bindMensajeRepository(impl: MensajeRepositoryImpl): MensajeRepository

    @Binds
    @Singleton
    abstract fun bindValoracionRepository(impl: ValoracionRepositoryImpl): ValoracionRepository
}
