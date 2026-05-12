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
public final class GetPacientesByFamiliarUseCase_Factory implements Factory<GetPacientesByFamiliarUseCase> {
  private final Provider<PacienteRepository> pacienteRepositoryProvider;

  public GetPacientesByFamiliarUseCase_Factory(
      Provider<PacienteRepository> pacienteRepositoryProvider) {
    this.pacienteRepositoryProvider = pacienteRepositoryProvider;
  }

  @Override
  public GetPacientesByFamiliarUseCase get() {
    return newInstance(pacienteRepositoryProvider.get());
  }

  public static GetPacientesByFamiliarUseCase_Factory create(
      Provider<PacienteRepository> pacienteRepositoryProvider) {
    return new GetPacientesByFamiliarUseCase_Factory(pacienteRepositoryProvider);
  }

  public static GetPacientesByFamiliarUseCase newInstance(PacienteRepository pacienteRepository) {
    return new GetPacientesByFamiliarUseCase(pacienteRepository);
  }
}
