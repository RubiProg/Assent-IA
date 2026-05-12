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
public final class ResolverIncidenciaUseCase_Factory implements Factory<ResolverIncidenciaUseCase> {
  private final Provider<IncidenciaRepository> incidenciaRepositoryProvider;

  public ResolverIncidenciaUseCase_Factory(
      Provider<IncidenciaRepository> incidenciaRepositoryProvider) {
    this.incidenciaRepositoryProvider = incidenciaRepositoryProvider;
  }

  @Override
  public ResolverIncidenciaUseCase get() {
    return newInstance(incidenciaRepositoryProvider.get());
  }

  public static ResolverIncidenciaUseCase_Factory create(
      Provider<IncidenciaRepository> incidenciaRepositoryProvider) {
    return new ResolverIncidenciaUseCase_Factory(incidenciaRepositoryProvider);
  }

  public static ResolverIncidenciaUseCase newInstance(IncidenciaRepository incidenciaRepository) {
    return new ResolverIncidenciaUseCase(incidenciaRepository);
  }
}
