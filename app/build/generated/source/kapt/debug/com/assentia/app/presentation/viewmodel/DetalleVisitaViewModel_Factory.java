package com.assentia.app.presentation.viewmodel;

import com.assentia.app.domain.usecase.CompletarTareaUseCase;
import com.assentia.app.domain.usecase.CompletarVisitaUseCase;
import com.assentia.app.domain.usecase.GetMedicacionPacienteUseCase;
import com.assentia.app.domain.usecase.GetPacienteByIdUseCase;
import com.assentia.app.domain.usecase.GetRegistrosMedicacionUseCase;
import com.assentia.app.domain.usecase.GetVisitaByIdUseCase;
import com.assentia.app.domain.usecase.IniciarVisitaUseCase;
import com.assentia.app.domain.usecase.RegistrarMedicacionUseCase;
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
public final class DetalleVisitaViewModel_Factory implements Factory<DetalleVisitaViewModel> {
  private final Provider<GetVisitaByIdUseCase> getVisitaByIdUseCaseProvider;

  private final Provider<GetPacienteByIdUseCase> getPacienteByIdUseCaseProvider;

  private final Provider<IniciarVisitaUseCase> iniciarVisitaUseCaseProvider;

  private final Provider<CompletarVisitaUseCase> completarVisitaUseCaseProvider;

  private final Provider<CompletarTareaUseCase> completarTareaUseCaseProvider;

  private final Provider<GetMedicacionPacienteUseCase> getMedicacionPacienteUseCaseProvider;

  private final Provider<GetRegistrosMedicacionUseCase> getRegistrosMedicacionUseCaseProvider;

  private final Provider<RegistrarMedicacionUseCase> registrarMedicacionUseCaseProvider;

  public DetalleVisitaViewModel_Factory(Provider<GetVisitaByIdUseCase> getVisitaByIdUseCaseProvider,
      Provider<GetPacienteByIdUseCase> getPacienteByIdUseCaseProvider,
      Provider<IniciarVisitaUseCase> iniciarVisitaUseCaseProvider,
      Provider<CompletarVisitaUseCase> completarVisitaUseCaseProvider,
      Provider<CompletarTareaUseCase> completarTareaUseCaseProvider,
      Provider<GetMedicacionPacienteUseCase> getMedicacionPacienteUseCaseProvider,
      Provider<GetRegistrosMedicacionUseCase> getRegistrosMedicacionUseCaseProvider,
      Provider<RegistrarMedicacionUseCase> registrarMedicacionUseCaseProvider) {
    this.getVisitaByIdUseCaseProvider = getVisitaByIdUseCaseProvider;
    this.getPacienteByIdUseCaseProvider = getPacienteByIdUseCaseProvider;
    this.iniciarVisitaUseCaseProvider = iniciarVisitaUseCaseProvider;
    this.completarVisitaUseCaseProvider = completarVisitaUseCaseProvider;
    this.completarTareaUseCaseProvider = completarTareaUseCaseProvider;
    this.getMedicacionPacienteUseCaseProvider = getMedicacionPacienteUseCaseProvider;
    this.getRegistrosMedicacionUseCaseProvider = getRegistrosMedicacionUseCaseProvider;
    this.registrarMedicacionUseCaseProvider = registrarMedicacionUseCaseProvider;
  }

  @Override
  public DetalleVisitaViewModel get() {
    return newInstance(getVisitaByIdUseCaseProvider.get(), getPacienteByIdUseCaseProvider.get(), iniciarVisitaUseCaseProvider.get(), completarVisitaUseCaseProvider.get(), completarTareaUseCaseProvider.get(), getMedicacionPacienteUseCaseProvider.get(), getRegistrosMedicacionUseCaseProvider.get(), registrarMedicacionUseCaseProvider.get());
  }

  public static DetalleVisitaViewModel_Factory create(
      Provider<GetVisitaByIdUseCase> getVisitaByIdUseCaseProvider,
      Provider<GetPacienteByIdUseCase> getPacienteByIdUseCaseProvider,
      Provider<IniciarVisitaUseCase> iniciarVisitaUseCaseProvider,
      Provider<CompletarVisitaUseCase> completarVisitaUseCaseProvider,
      Provider<CompletarTareaUseCase> completarTareaUseCaseProvider,
      Provider<GetMedicacionPacienteUseCase> getMedicacionPacienteUseCaseProvider,
      Provider<GetRegistrosMedicacionUseCase> getRegistrosMedicacionUseCaseProvider,
      Provider<RegistrarMedicacionUseCase> registrarMedicacionUseCaseProvider) {
    return new DetalleVisitaViewModel_Factory(getVisitaByIdUseCaseProvider, getPacienteByIdUseCaseProvider, iniciarVisitaUseCaseProvider, completarVisitaUseCaseProvider, completarTareaUseCaseProvider, getMedicacionPacienteUseCaseProvider, getRegistrosMedicacionUseCaseProvider, registrarMedicacionUseCaseProvider);
  }

  public static DetalleVisitaViewModel newInstance(GetVisitaByIdUseCase getVisitaByIdUseCase,
      GetPacienteByIdUseCase getPacienteByIdUseCase, IniciarVisitaUseCase iniciarVisitaUseCase,
      CompletarVisitaUseCase completarVisitaUseCase, CompletarTareaUseCase completarTareaUseCase,
      GetMedicacionPacienteUseCase getMedicacionPacienteUseCase,
      GetRegistrosMedicacionUseCase getRegistrosMedicacionUseCase,
      RegistrarMedicacionUseCase registrarMedicacionUseCase) {
    return new DetalleVisitaViewModel(getVisitaByIdUseCase, getPacienteByIdUseCase, iniciarVisitaUseCase, completarVisitaUseCase, completarTareaUseCase, getMedicacionPacienteUseCase, getRegistrosMedicacionUseCase, registrarMedicacionUseCase);
  }
}
