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
public final class CreatePacienteUseCase_Factory implements Factory<CreatePacienteUseCase> {
  private final Provider<PacienteRepository> pacienteRepositoryProvider;

  public CreatePacienteUseCase_Factory(Provider<PacienteRepository> pacienteRepositoryProvider) {
    this.pacienteRepositoryProvider = pacienteRepositoryProvider;
  }

  @Override
  public CreatePacienteUseCase get() {
    return newInstance(pacienteRepositoryProvider.get());
  }

  public static CreatePacienteUseCase_Factory create(
      Provider<PacienteRepository> pacienteRepositoryProvider) {
    return new CreatePacienteUseCase_Factory(pacienteRepositoryProvider);
  }

  public static CreatePacienteUseCase newInstance(PacienteRepository pacienteRepository) {
    return new CreatePacienteUseCase(pacienteRepository);
  }
}
