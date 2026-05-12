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
public final class GetIncidenciasAbiertasUseCase_Factory implements Factory<GetIncidenciasAbiertasUseCase> {
  private final Provider<IncidenciaRepository> incidenciaRepositoryProvider;

  public GetIncidenciasAbiertasUseCase_Factory(
      Provider<IncidenciaRepository> incidenciaRepositoryProvider) {
    this.incidenciaRepositoryProvider = incidenciaRepositoryProvider;
  }

  @Override
  public GetIncidenciasAbiertasUseCase get() {
    return newInstance(incidenciaRepositoryProvider.get());
  }

  public static GetIncidenciasAbiertasUseCase_Factory create(
      Provider<IncidenciaRepository> incidenciaRepositoryProvider) {
    return new GetIncidenciasAbiertasUseCase_Factory(incidenciaRepositoryProvider);
  }

  public static GetIncidenciasAbiertasUseCase newInstance(
      IncidenciaRepository incidenciaRepository) {
    return new GetIncidenciasAbiertasUseCase(incidenciaRepository);
  }
}
