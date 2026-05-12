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
public final class GetRegistrosMedicacionUseCase_Factory implements Factory<GetRegistrosMedicacionUseCase> {
  private final Provider<MedicacionRepository> medicacionRepositoryProvider;

  public GetRegistrosMedicacionUseCase_Factory(
      Provider<MedicacionRepository> medicacionRepositoryProvider) {
    this.medicacionRepositoryProvider = medicacionRepositoryProvider;
  }

  @Override
  public GetRegistrosMedicacionUseCase get() {
    return newInstance(medicacionRepositoryProvider.get());
  }

  public static GetRegistrosMedicacionUseCase_Factory create(
      Provider<MedicacionRepository> medicacionRepositoryProvider) {
    return new GetRegistrosMedicacionUseCase_Factory(medicacionRepositoryProvider);
  }

  public static GetRegistrosMedicacionUseCase newInstance(
      MedicacionRepository medicacionRepository) {
    return new GetRegistrosMedicacionUseCase(medicacionRepository);
  }
}
