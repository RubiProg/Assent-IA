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
public final class IniciarVisitaUseCase_Factory implements Factory<IniciarVisitaUseCase> {
  private final Provider<VisitaRepository> visitaRepositoryProvider;

  public IniciarVisitaUseCase_Factory(Provider<VisitaRepository> visitaRepositoryProvider) {
    this.visitaRepositoryProvider = visitaRepositoryProvider;
  }

  @Override
  public IniciarVisitaUseCase get() {
    return newInstance(visitaRepositoryProvider.get());
  }

  public static IniciarVisitaUseCase_Factory create(
      Provider<VisitaRepository> visitaRepositoryProvider) {
    return new IniciarVisitaUseCase_Factory(visitaRepositoryProvider);
  }

  public static IniciarVisitaUseCase newInstance(VisitaRepository visitaRepository) {
    return new IniciarVisitaUseCase(visitaRepository);
  }
}
