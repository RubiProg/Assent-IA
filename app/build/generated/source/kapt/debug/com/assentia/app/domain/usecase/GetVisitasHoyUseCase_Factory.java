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
public final class GetVisitasHoyUseCase_Factory implements Factory<GetVisitasHoyUseCase> {
  private final Provider<VisitaRepository> visitaRepositoryProvider;

  public GetVisitasHoyUseCase_Factory(Provider<VisitaRepository> visitaRepositoryProvider) {
    this.visitaRepositoryProvider = visitaRepositoryProvider;
  }

  @Override
  public GetVisitasHoyUseCase get() {
    return newInstance(visitaRepositoryProvider.get());
  }

  public static GetVisitasHoyUseCase_Factory create(
      Provider<VisitaRepository> visitaRepositoryProvider) {
    return new GetVisitasHoyUseCase_Factory(visitaRepositoryProvider);
  }

  public static GetVisitasHoyUseCase newInstance(VisitaRepository visitaRepository) {
    return new GetVisitasHoyUseCase(visitaRepository);
  }
}
