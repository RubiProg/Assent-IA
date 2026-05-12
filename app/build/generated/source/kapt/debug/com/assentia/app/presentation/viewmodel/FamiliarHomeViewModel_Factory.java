package com.assentia.app.presentation.viewmodel;

import com.assentia.app.domain.usecase.GetPacientesByFamiliarUseCase;
import com.assentia.app.domain.usecase.GetUnreadCountUseCase;
import com.assentia.app.domain.usecase.GetVisitasByPacienteUseCase;
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
public final class FamiliarHomeViewModel_Factory implements Factory<FamiliarHomeViewModel> {
  private final Provider<GetPacientesByFamiliarUseCase> getPacientesByFamiliarUseCaseProvider;

  private final Provider<GetVisitasByPacienteUseCase> getVisitasByPacienteUseCaseProvider;

  private final Provider<GetUnreadCountUseCase> getUnreadCountUseCaseProvider;

  public FamiliarHomeViewModel_Factory(
      Provider<GetPacientesByFamiliarUseCase> getPacientesByFamiliarUseCaseProvider,
      Provider<GetVisitasByPacienteUseCase> getVisitasByPacienteUseCaseProvider,
      Provider<GetUnreadCountUseCase> getUnreadCountUseCaseProvider) {
    this.getPacientesByFamiliarUseCaseProvider = getPacientesByFamiliarUseCaseProvider;
    this.getVisitasByPacienteUseCaseProvider = getVisitasByPacienteUseCaseProvider;
    this.getUnreadCountUseCaseProvider = getUnreadCountUseCaseProvider;
  }

  @Override
  public FamiliarHomeViewModel get() {
    return newInstance(getPacientesByFamiliarUseCaseProvider.get(), getVisitasByPacienteUseCaseProvider.get(), getUnreadCountUseCaseProvider.get());
  }

  public static FamiliarHomeViewModel_Factory create(
      Provider<GetPacientesByFamiliarUseCase> getPacientesByFamiliarUseCaseProvider,
      Provider<GetVisitasByPacienteUseCase> getVisitasByPacienteUseCaseProvider,
      Provider<GetUnreadCountUseCase> getUnreadCountUseCaseProvider) {
    return new FamiliarHomeViewModel_Factory(getPacientesByFamiliarUseCaseProvider, getVisitasByPacienteUseCaseProvider, getUnreadCountUseCaseProvider);
  }

  public static FamiliarHomeViewModel newInstance(
      GetPacientesByFamiliarUseCase getPacientesByFamiliarUseCase,
      GetVisitasByPacienteUseCase getVisitasByPacienteUseCase,
      GetUnreadCountUseCase getUnreadCountUseCase) {
    return new FamiliarHomeViewModel(getPacientesByFamiliarUseCase, getVisitasByPacienteUseCase, getUnreadCountUseCase);
  }
}
