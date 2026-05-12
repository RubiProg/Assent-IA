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
public final class GetPacienteByIdUseCase_Factory implements Factory<GetPacienteByIdUseCase> {
  private final Provider<PacienteRepository> pacienteRepositoryProvider;

  public GetPacienteByIdUseCase_Factory(Provider<PacienteRepository> pacienteRepositoryProvider) {
    this.pacienteRepositoryProvider = pacienteRepositoryProvider;
  }

  @Override
  public GetPacienteByIdUseCase get() {
    return newInstance(pacienteRepositoryProvider.get());
  }

  public static GetPacienteByIdUseCase_Factory create(
      Provider<PacienteRepository> pacienteRepositoryProvider) {
    return new GetPacienteByIdUseCase_Factory(pacienteRepositoryProvider);
  }

  public static GetPacienteByIdUseCase newInstance(PacienteRepository pacienteRepository) {
    return new GetPacienteByIdUseCase(pacienteRepository);
  }
}
