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
public final class GetVisitasByPacienteUseCase_Factory implements Factory<GetVisitasByPacienteUseCase> {
  private final Provider<VisitaRepository> visitaRepositoryProvider;

  public GetVisitasByPacienteUseCase_Factory(Provider<VisitaRepository> visitaRepositoryProvider) {
    this.visitaRepositoryProvider = visitaRepositoryProvider;
  }

  @Override
  public GetVisitasByPacienteUseCase get() {
    return newInstance(visitaRepositoryProvider.get());
  }

  public static GetVisitasByPacienteUseCase_Factory create(
      Provider<VisitaRepository> visitaRepositoryProvider) {
    return new GetVisitasByPacienteUseCase_Factory(visitaRepositoryProvider);
  }

  public static GetVisitasByPacienteUseCase newInstance(VisitaRepository visitaRepository) {
    return new GetVisitasByPacienteUseCase(visitaRepository);
  }
}
