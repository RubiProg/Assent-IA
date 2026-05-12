package com.assentia.app.domain.usecase;

import com.assentia.app.domain.repository.ValoracionRepository;
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
public final class CreateValoracionUseCase_Factory implements Factory<CreateValoracionUseCase> {
  private final Provider<ValoracionRepository> valoracionRepositoryProvider;

  public CreateValoracionUseCase_Factory(
      Provider<ValoracionRepository> valoracionRepositoryProvider) {
    this.valoracionRepositoryProvider = valoracionRepositoryProvider;
  }

  @Override
  public CreateValoracionUseCase get() {
    return newInstance(valoracionRepositoryProvider.get());
  }

  public static CreateValoracionUseCase_Factory create(
      Provider<ValoracionRepository> valoracionRepositoryProvider) {
    return new CreateValoracionUseCase_Factory(valoracionRepositoryProvider);
  }

  public static CreateValoracionUseCase newInstance(ValoracionRepository valoracionRepository) {
    return new CreateValoracionUseCase(valoracionRepository);
  }
}
