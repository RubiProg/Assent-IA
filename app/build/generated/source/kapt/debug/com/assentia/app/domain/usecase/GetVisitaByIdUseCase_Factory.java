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
public final class GetVisitaByIdUseCase_Factory implements Factory<GetVisitaByIdUseCase> {
  private final Provider<VisitaRepository> visitaRepositoryProvider;

  public GetVisitaByIdUseCase_Factory(Provider<VisitaRepository> visitaRepositoryProvider) {
    this.visitaRepositoryProvider = visitaRepositoryProvider;
  }

  @Override
  public GetVisitaByIdUseCase get() {
    return newInstance(visitaRepositoryProvider.get());
  }

  public static GetVisitaByIdUseCase_Factory create(
      Provider<VisitaRepository> visitaRepositoryProvider) {
    return new GetVisitaByIdUseCase_Factory(visitaRepositoryProvider);
  }

  public static GetVisitaByIdUseCase newInstance(VisitaRepository visitaRepository) {
    return new GetVisitaByIdUseCase(visitaRepository);
  }
}
