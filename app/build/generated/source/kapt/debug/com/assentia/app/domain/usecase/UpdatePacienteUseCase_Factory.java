package com.assentia.app.domain.usecase;

import com.assentia.app.domain.repository.PacienteRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class UpdatePacienteUseCase_Factory implements Factory<UpdatePacienteUseCase> {
  private final Provider<PacienteRepository> pacienteRepositoryProvider;

  public UpdatePacienteUseCase_Factory(Provider<PacienteRepository> pacienteRepositoryProvider) {
    this.pacienteRepositoryProvider = pacienteRepositoryProvider;
  }

  @Override
  public UpdatePacienteUseCase get() {
    return newInstance(pacienteRepositoryProvider.get());
  }

  public static UpdatePacienteUseCase_Factory create(
      Provider<PacienteRepository> pacienteRepositoryProvider) {
    return new UpdatePacienteUseCase_Factory(pacienteRepositoryProvider);
  }

  public static UpdatePacienteUseCase newInstance(PacienteRepository pacienteRepository) {
    return new UpdatePacienteUseCase(pacienteRepository);
  }
}
