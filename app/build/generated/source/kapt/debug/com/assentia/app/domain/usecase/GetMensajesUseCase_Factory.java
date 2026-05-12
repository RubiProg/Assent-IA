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
public final class GetMensajesUseCase_Factory implements Factory<GetMensajesUseCase> {
  private final Provider<MensajeRepository> mensajeRepositoryProvider;

  public GetMensajesUseCase_Factory(Provider<MensajeRepository> mensajeRepositoryProvider) {
    this.mensajeRepositoryProvider = mensajeRepositoryProvider;
  }

  @Override
  public GetMensajesUseCase get() {
    return newInstance(mensajeRepositoryProvider.get());
  }

  public static GetMensajesUseCase_Factory create(
      Provider<MensajeRepository> mensajeRepositoryProvider) {
    return new GetMensajesUseCase_Factory(mensajeRepositoryProvider);
  }

  public static GetMensajesUseCase newInstance(MensajeRepository mensajeRepository) {
    return new GetMensajesUseCase(mensajeRepository);
  }
}
