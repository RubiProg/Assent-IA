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
public final class GetPacientesByCuidadorUseCase_Factory implements Factory<GetPacientesByCuidadorUseCase> {
  private final Provider<PacienteRepository> pacienteRepositoryProvider;

  public GetPacientesByCuidadorUseCase_Factory(
      Provider<PacienteRepository> pacienteRepositoryProvider) {
    this.pacienteRepositoryProvider = pacienteRepositoryProvider;
  }

  @Override
  public GetPacientesByCuidadorUseCase get() {
    return newInstance(pacienteRepositoryProvider.get());
  }

  public static GetPacientesByCuidadorUseCase_Factory create(
      Provider<PacienteRepository> pacienteRepositoryProvider) {
    return new GetPacientesByCuidadorUseCase_Factory(pacienteRepositoryProvider);
  }

  public static GetPacientesByCuidadorUseCase newInstance(PacienteRepository pacienteRepository) {
    return new GetPacientesByCuidadorUseCase(pacienteRepository);
  }
}
