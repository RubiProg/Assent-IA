package com.assentia.app.presentation.viewmodel;

import com.assentia.app.domain.usecase.GetAllPacientesUseCase;
import com.assentia.app.domain.usecase.GetVisitasByCuidadorUseCase;
import com.assentia.app.domain.usecase.GetVisitasHoyUseCase;
import com.assentia.app.domain.usecase.IniciarVisitaUseCase;
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
public final class AgendaViewModel_Factory implements Factory<AgendaViewModel> {
  private final Provider<GetVisitasHoyUseCase> getVisitasHoyUseCaseProvider;

  private final Provider<GetVisitasByCuidadorUseCase> getVisitasByCuidadorUseCaseProvider;

  private final Provider<GetAllPacientesUseCase> getAllPacientesUseCaseProvider;

  private final Provider<IniciarVisitaUseCase> iniciarVisitaUseCaseProvider;

  public AgendaViewModel_Factory(Provider<GetVisitasHoyUseCase> getVisitasHoyUseCaseProvider,
      Provider<GetVisitasByCuidadorUseCase> getVisitasByCuidadorUseCaseProvider,
      Provider<GetAllPacientesUseCase> getAllPacientesUseCaseProvider,
      Provider<IniciarVisitaUseCase> iniciarVisitaUseCaseProvider) {
    this.getVisitasHoyUseCaseProvider = getVisitasHoyUseCaseProvider;
    this.getVisitasByCuidadorUseCaseProvider = getVisitasByCuidadorUseCaseProvider;
    this.getAllPacientesUseCaseProvider = getAllPacientesUseCaseProvider;
    this.iniciarVisitaUseCaseProvider = iniciarVisitaUseCaseProvider;
  }

  @Override
  public AgendaViewModel get() {
    return newInstance(getVisitasHoyUseCaseProvider.get(), getVisitasByCuidadorUseCaseProvider.get(), getAllPacientesUseCaseProvider.get(), iniciarVisitaUseCaseProvider.get());
  }

  public static AgendaViewModel_Factory create(
      Provider<GetVisitasHoyUseCase> getVisitasHoyUseCaseProvider,
      Provider<GetVisitasByCuidadorUseCase> getVisitasByCuidadorUseCaseProvider,
      Provider<GetAllPacientesUseCase> getAllPacientesUseCaseProvider,
      Provider<IniciarVisitaUseCase> iniciarVisitaUseCaseProvider) {
    return new AgendaViewModel_Factory(getVisitasHoyUseCaseProvider, getVisitasByCuidadorUseCaseProvider, getAllPacientesUseCaseProvider, iniciarVisitaUseCaseProvider);
  }

  public static AgendaViewModel newInstance(GetVisitasHoyUseCase getVisitasHoyUseCase,
      GetVisitasByCuidadorUseCase getVisitasByCuidadorUseCase,
      GetAllPacientesUseCase getAllPacientesUseCase, IniciarVisitaUseCase iniciarVisitaUseCase) {
    return new AgendaViewModel(getVisitasHoyUseCase, getVisitasByCuidadorUseCase, getAllPacientesUseCase, iniciarVisitaUseCase);
  }
}
