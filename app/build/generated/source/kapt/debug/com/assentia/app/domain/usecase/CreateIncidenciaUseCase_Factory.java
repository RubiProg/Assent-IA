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
public final class CreateIncidenciaUseCase_Factory implements Factory<CreateIncidenciaUseCase> {
  private final Provider<IncidenciaRepository> incidenciaRepositoryProvider;

  public CreateIncidenciaUseCase_Factory(
      Provider<IncidenciaRepository> incidenciaRepositoryProvider) {
    this.incidenciaRepositoryProvider = incidenciaRepositoryProvider;
  }

  @Override
  public CreateIncidenciaUseCase get() {
    return newInstance(incidenciaRepositoryProvider.get());
  }

  public static CreateIncidenciaUseCase_Factory create(
      Provider<IncidenciaRepository> incidenciaRepositoryProvider) {
    return new CreateIncidenciaUseCase_Factory(incidenciaRepositoryProvider);
  }

  public static CreateIncidenciaUseCase newInstance(IncidenciaRepository incidenciaRepository) {
    return new CreateIncidenciaUseCase(incidenciaRepository);
  }
}
