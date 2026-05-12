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
public final class CompletarVisitaUseCase_Factory implements Factory<CompletarVisitaUseCase> {
  private final Provider<VisitaRepository> visitaRepositoryProvider;

  public CompletarVisitaUseCase_Factory(Provider<VisitaRepository> visitaRepositoryProvider) {
    this.visitaRepositoryProvider = visitaRepositoryProvider;
  }

  @Override
  public CompletarVisitaUseCase get() {
    return newInstance(visitaRepositoryProvider.get());
  }

  public static CompletarVisitaUseCase_Factory create(
      Provider<VisitaRepository> visitaRepositoryProvider) {
    return new CompletarVisitaUseCase_Factory(visitaRepositoryProvider);
  }

  public static CompletarVisitaUseCase newInstance(VisitaRepository visitaRepository) {
    return new CompletarVisitaUseCase(visitaRepository);
  }
}
