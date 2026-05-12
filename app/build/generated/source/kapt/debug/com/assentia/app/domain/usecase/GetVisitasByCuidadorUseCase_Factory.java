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
public final class GetVisitasByCuidadorUseCase_Factory implements Factory<GetVisitasByCuidadorUseCase> {
  private final Provider<VisitaRepository> visitaRepositoryProvider;

  public GetVisitasByCuidadorUseCase_Factory(Provider<VisitaRepository> visitaRepositoryProvider) {
    this.visitaRepositoryProvider = visitaRepositoryProvider;
  }

  @Override
  public GetVisitasByCuidadorUseCase get() {
    return newInstance(visitaRepositoryProvider.get());
  }

  public static GetVisitasByCuidadorUseCase_Factory create(
      Provider<VisitaRepository> visitaRepositoryProvider) {
    return new GetVisitasByCuidadorUseCase_Factory(visitaRepositoryProvider);
  }

  public static GetVisitasByCuidadorUseCase newInstance(VisitaRepository visitaRepository) {
    return new GetVisitasByCuidadorUseCase(visitaRepository);
  }
}
