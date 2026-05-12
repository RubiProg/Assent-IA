package com.assentia.app.domain.usecase;

import com.assentia.app.domain.repository.VisitaRepository;
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
public final class CreateVisitaUseCase_Factory implements Factory<CreateVisitaUseCase> {
  private final Provider<VisitaRepository> visitaRepositoryProvider;

  public CreateVisitaUseCase_Factory(Provider<VisitaRepository> visitaRepositoryProvider) {
    this.visitaRepositoryProvider = visitaRepositoryProvider;
  }

  @Override
  public CreateVisitaUseCase get() {
    return newInstance(visitaRepositoryProvider.get());
  }

  public static CreateVisitaUseCase_Factory create(
      Provider<VisitaRepository> visitaRepositoryProvider) {
    return new CreateVisitaUseCase_Factory(visitaRepositoryProvider);
  }

  public static CreateVisitaUseCase newInstance(VisitaRepository visitaRepository) {
    return new CreateVisitaUseCase(visitaRepository);
  }
}
