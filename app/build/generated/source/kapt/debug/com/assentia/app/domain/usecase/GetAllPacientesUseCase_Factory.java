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
public final class GetAllPacientesUseCase_Factory implements Factory<GetAllPacientesUseCase> {
  private final Provider<PacienteRepository> pacienteRepositoryProvider;

  public GetAllPacientesUseCase_Factory(Provider<PacienteRepository> pacienteRepositoryProvider) {
    this.pacienteRepositoryProvider = pacienteRepositoryProvider;
  }

  @Override
  public GetAllPacientesUseCase get() {
    return newInstance(pacienteRepositoryProvider.get());
  }

  public static GetAllPacientesUseCase_Factory create(
      Provider<PacienteRepository> pacienteRepositoryProvider) {
    return new GetAllPacientesUseCase_Factory(pacienteRepositoryProvider);
  }

  public static GetAllPacientesUseCase newInstance(PacienteRepository pacienteRepository) {
    return new GetAllPacientesUseCase(pacienteRepository);
  }
}
