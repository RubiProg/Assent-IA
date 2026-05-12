package com.assentia.app.presentation.viewmodel;

import com.assentia.app.domain.usecase.GetAllPacientesUseCase;
import com.assentia.app.domain.usecase.GetIncidenciasAbiertasUseCase;
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
public final class AdminDashboardViewModel_Factory implements Factory<AdminDashboardViewModel> {
  private final Provider<GetAllPacientesUseCase> getAllPacientesUseCaseProvider;

  private final Provider<GetIncidenciasAbiertasUseCase> getIncidenciasAbiertasUseCaseProvider;

  public AdminDashboardViewModel_Factory(
      Provider<GetAllPacientesUseCase> getAllPacientesUseCaseProvider,
      Provider<GetIncidenciasAbiertasUseCase> getIncidenciasAbiertasUseCaseProvider) {
    this.getAllPacientesUseCaseProvider = getAllPacientesUseCaseProvider;
    this.getIncidenciasAbiertasUseCaseProvider = getIncidenciasAbiertasUseCaseProvider;
  }

  @Override
  public AdminDashboardViewModel get() {
    return newInstance(getAllPacientesUseCaseProvider.get(), getIncidenciasAbiertasUseCaseProvider.get());
  }

  public static AdminDashboardViewModel_Factory create(
      Provider<GetAllPacientesUseCase> getAllPacientesUseCaseProvider,
      Provider<GetIncidenciasAbiertasUseCase> getIncidenciasAbiertasUseCaseProvider) {
    return new AdminDashboardViewModel_Factory(getAllPacientesUseCaseProvider, getIncidenciasAbiertasUseCaseProvider);
  }

  public static AdminDashboardViewModel newInstance(GetAllPacientesUseCase getAllPacientesUseCase,
      GetIncidenciasAbiertasUseCase getIncidenciasAbiertasUseCase) {
    return new AdminDashboardViewModel(getAllPacientesUseCase, getIncidenciasAbiertasUseCase);
  }
}
