package com.assentia.app.domain.usecase;

import com.assentia.app.domain.repository.MensajeRepository;
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
public final class EnviarMensajeUseCase_Factory implements Factory<EnviarMensajeUseCase> {
  private final Provider<MensajeRepository> mensajeRepositoryProvider;

  public EnviarMensajeUseCase_Factory(Provider<MensajeRepository> mensajeRepositoryProvider) {
    this.mensajeRepositoryProvider = mensajeRepositoryProvider;
  }

  @Override
  public EnviarMensajeUseCase get() {
    return newInstance(mensajeRepositoryProvider.get());
  }

  public static EnviarMensajeUseCase_Factory create(
      Provider<MensajeRepository> mensajeRepositoryProvider) {
    return new EnviarMensajeUseCase_Factory(mensajeRepositoryProvider);
  }

  public static EnviarMensajeUseCase newInstance(MensajeRepository mensajeRepository) {
    return new EnviarMensajeUseCase(mensajeRepository);
  }
}
