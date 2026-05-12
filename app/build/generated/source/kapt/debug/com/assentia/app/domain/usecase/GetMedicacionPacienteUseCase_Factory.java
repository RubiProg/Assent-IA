package com.assentia.app.domain.usecase;

import com.assentia.app.domain.repository.MedicacionRepository;
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
public final class GetMedicacionPacienteUseCase_Factory implements Factory<GetMedicacionPacienteUseCase> {
  private final Provider<MedicacionRepository> medicacionRepositoryProvider;

  public GetMedicacionPacienteUseCase_Factory(
      Provider<MedicacionRepository> medicacionRepositoryProvider) {
    this.medicacionRepositoryProvider = medicacionRepositoryProvider;
  }

  @Override
  public GetMedicacionPacienteUseCase get() {
    return newInstance(medicacionRepositoryProvider.get());
  }

  public static GetMedicacionPacienteUseCase_Factory create(
      Provider<MedicacionRepository> medicacionRepositoryProvider) {
    return new GetMedicacionPacienteUseCase_Factory(medicacionRepositoryProvider);
  }

  public static GetMedicacionPacienteUseCase newInstance(
      MedicacionRepository medicacionRepository) {
    return new GetMedicacionPacienteUseCase(medicacionRepository);
  }
}
