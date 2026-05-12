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
public final class RegistrarMedicacionUseCase_Factory implements Factory<RegistrarMedicacionUseCase> {
  private final Provider<MedicacionRepository> medicacionRepositoryProvider;

  public RegistrarMedicacionUseCase_Factory(
      Provider<MedicacionRepository> medicacionRepositoryProvider) {
    this.medicacionRepositoryProvider = medicacionRepositoryProvider;
  }

  @Override
  public RegistrarMedicacionUseCase get() {
    return newInstance(medicacionRepositoryProvider.get());
  }

  public static RegistrarMedicacionUseCase_Factory create(
      Provider<MedicacionRepository> medicacionRepositoryProvider) {
    return new RegistrarMedicacionUseCase_Factory(medicacionRepositoryProvider);
  }

  public static RegistrarMedicacionUseCase newInstance(MedicacionRepository medicacionRepository) {
    return new RegistrarMedicacionUseCase(medicacionRepository);
  }
}
