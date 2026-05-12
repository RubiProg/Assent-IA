package com.assentia.app.presentation.viewmodel;

import com.assentia.app.domain.usecase.CreateIncidenciaUseCase;
import com.assentia.app.domain.usecase.GetIncidenciasAbiertasUseCase;
import com.assentia.app.domain.usecase.GetIncidenciasByPacienteUseCase;
import com.assentia.app.domain.usecase.ResolverIncidenciaUseCase;
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
public final class IncidenciasViewModel_Factory implements Factory<IncidenciasViewModel> {
  private final Provider<GetIncidenciasByPacienteUseCase> getIncidenciasByPacienteUseCaseProvider;

  private final Provider<GetIncidenciasAbiertasUseCase> getIncidenciasAbiertasUseCaseProvider;

  private final Provider<CreateIncidenciaUseCase> createIncidenciaUseCaseProvider;

  private final Provider<ResolverIncidenciaUseCase> resolverIncidenciaUseCaseProvider;

  public IncidenciasViewModel_Factory(
      Provider<GetIncidenciasByPacienteUseCase> getIncidenciasByPacienteUseCaseProvider,
      Provider<GetIncidenciasAbiertasUseCase> getIncidenciasAbiertasUseCaseProvider,
      Provider<CreateIncidenciaUseCase> createIncidenciaUseCaseProvider,
      Provider<ResolverIncidenciaUseCase> resolverIncidenciaUseCaseProvider) {
    this.getIncidenciasByPacienteUseCaseProvider = getIncidenciasByPacienteUseCaseProvider;
    this.getIncidenciasAbiertasUseCaseProvider = getIncidenciasAbiertasUseCaseProvider;
    this.createIncidenciaUseCaseProvider = createIncidenciaUseCaseProvider;
    this.resolverIncidenciaUseCaseProvider = resolverIncidenciaUseCaseProvider;
  }

  @Override
  public IncidenciasViewModel get() {
    return newInstance(getIncidenciasByPacienteUseCaseProvider.get(), getIncidenciasAbiertasUseCaseProvider.get(), createIncidenciaUseCaseProvider.get(), resolverIncidenciaUseCaseProvider.get());
  }

  public static IncidenciasViewModel_Factory create(
      Provider<GetIncidenciasByPacienteUseCase> getIncidenciasByPacienteUseCaseProvider,
      Provider<GetIncidenciasAbiertasUseCase> getIncidenciasAbiertasUseCaseProvider,
      Provider<CreateIncidenciaUseCase> createIncidenciaUseCaseProvider,
      Provider<ResolverIncidenciaUseCase> resolverIncidenciaUseCaseProvider) {
    return new IncidenciasViewModel_Factory(getIncidenciasByPacienteUseCaseProvider, getIncidenciasAbiertasUseCaseProvider, createIncidenciaUseCaseProvider, resolverIncidenciaUseCaseProvider);
  }

  public static IncidenciasViewModel newInstance(
      GetIncidenciasByPacienteUseCase getIncidenciasByPacienteUseCase,
      GetIncidenciasAbiertasUseCase getIncidenciasAbiertasUseCase,
      CreateIncidenciaUseCase createIncidenciaUseCase,
      ResolverIncidenciaUseCase resolverIncidenciaUseCase) {
    return new IncidenciasViewModel(getIncidenciasByPacienteUseCase, getIncidenciasAbiertasUseCase, createIncidenciaUseCase, resolverIncidenciaUseCase);
  }
}
