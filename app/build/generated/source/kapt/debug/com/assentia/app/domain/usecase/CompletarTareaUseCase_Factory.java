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
public final class CompletarTareaUseCase_Factory implements Factory<CompletarTareaUseCase> {
  private final Provider<VisitaRepository> visitaRepositoryProvider;

  public CompletarTareaUseCase_Factory(Provider<VisitaRepository> visitaRepositoryProvider) {
    this.visitaRepositoryProvider = visitaRepositoryProvider;
  }

  @Override
  public CompletarTareaUseCase get() {
    return newInstance(visitaRepositoryProvider.get());
  }

  public static CompletarTareaUseCase_Factory create(
      Provider<VisitaRepository> visitaRepositoryProvider) {
    return new CompletarTareaUseCase_Factory(visitaRepositoryProvider);
  }

  public static CompletarTareaUseCase newInstance(VisitaRepository visitaRepository) {
    return new CompletarTareaUseCase(visitaRepository);
  }
}
