package com.assentia.app.domain.usecase;

import com.assentia.app.domain.repository.IncidenciaRepository;
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
public final class GetIncidenciasByPacienteUseCase_Factory implements Factory<GetIncidenciasByPacienteUseCase> {
  private final Provider<IncidenciaRepository> incidenciaRepositoryProvider;

  public GetIncidenciasByPacienteUseCase_Factory(
      Provider<IncidenciaRepository> incidenciaRepositoryProvider) {
    this.incidenciaRepositoryProvider = incidenciaRepositoryProvider;
  }

  @Override
  public GetIncidenciasByPacienteUseCase get() {
    return newInstance(incidenciaRepositoryProvider.get());
  }

  public static GetIncidenciasByPacienteUseCase_Factory create(
      Provider<IncidenciaRepository> incidenciaRepositoryProvider) {
    return new GetIncidenciasByPacienteUseCase_Factory(incidenciaRepositoryProvider);
  }

  public static GetIncidenciasByPacienteUseCase newInstance(
      IncidenciaRepository incidenciaRepository) {
    return new GetIncidenciasByPacienteUseCase(incidenciaRepository);
  }
}
