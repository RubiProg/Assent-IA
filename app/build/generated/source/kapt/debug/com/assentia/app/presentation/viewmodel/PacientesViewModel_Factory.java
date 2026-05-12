package com.assentia.app.presentation.viewmodel;

import com.assentia.app.domain.repository.MedicacionRepository;
import com.assentia.app.domain.repository.UserRepository;
import com.assentia.app.domain.usecase.CreatePacienteUseCase;
import com.assentia.app.domain.usecase.GetAllPacientesUseCase;
import com.assentia.app.domain.usecase.UpdatePacienteUseCase;
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
public final class PacientesViewModel_Factory implements Factory<PacientesViewModel> {
  private final Provider<GetAllPacientesUseCase> getAllPacientesUseCaseProvider;

  private final Provider<CreatePacienteUseCase> createPacienteUseCaseProvider;

  private final Provider<UpdatePacienteUseCase> updatePacienteUseCaseProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<MedicacionRepository> medicacionRepositoryProvider;

  public PacientesViewModel_Factory(Provider<GetAllPacientesUseCase> getAllPacientesUseCaseProvider,
      Provider<CreatePacienteUseCase> createPacienteUseCaseProvider,
      Provider<UpdatePacienteUseCase> updatePacienteUseCaseProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<MedicacionRepository> medicacionRepositoryProvider) {
    this.getAllPacientesUseCaseProvider = getAllPacientesUseCaseProvider;
    this.createPacienteUseCaseProvider = createPacienteUseCaseProvider;
    this.updatePacienteUseCaseProvider = updatePacienteUseCaseProvider;
    this.userRepositoryProvider = userRepositoryProvider;
    this.medicacionRepositoryProvider = medicacionRepositoryProvider;
  }

  @Override
  public PacientesViewModel get() {
    return newInstance(getAllPacientesUseCaseProvider.get(), createPacienteUseCaseProvider.get(), updatePacienteUseCaseProvider.get(), userRepositoryProvider.get(), medicacionRepositoryProvider.get());
  }

  public static PacientesViewModel_Factory create(
      Provider<GetAllPacientesUseCase> getAllPacientesUseCaseProvider,
      Provider<CreatePacienteUseCase> createPacienteUseCaseProvider,
      Provider<UpdatePacienteUseCase> updatePacienteUseCaseProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<MedicacionRepository> medicacionRepositoryProvider) {
    return new PacientesViewModel_Factory(getAllPacientesUseCaseProvider, createPacienteUseCaseProvider, updatePacienteUseCaseProvider, userRepositoryProvider, medicacionRepositoryProvider);
  }

  public static PacientesViewModel newInstance(GetAllPacientesUseCase getAllPacientesUseCase,
      CreatePacienteUseCase createPacienteUseCase, UpdatePacienteUseCase updatePacienteUseCase,
      UserRepository userRepository, MedicacionRepository medicacionRepository) {
    return new PacientesViewModel(getAllPacientesUseCase, createPacienteUseCase, updatePacienteUseCase, userRepository, medicacionRepository);
  }
}
