package com.assentia.app.presentation.viewmodel;

import com.assentia.app.domain.usecase.EnviarMensajeUseCase;
import com.assentia.app.domain.usecase.GetMensajesUseCase;
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
public final class ChatViewModel_Factory implements Factory<ChatViewModel> {
  private final Provider<GetMensajesUseCase> getMensajesUseCaseProvider;

  private final Provider<EnviarMensajeUseCase> enviarMensajeUseCaseProvider;

  public ChatViewModel_Factory(Provider<GetMensajesUseCase> getMensajesUseCaseProvider,
      Provider<EnviarMensajeUseCase> enviarMensajeUseCaseProvider) {
    this.getMensajesUseCaseProvider = getMensajesUseCaseProvider;
    this.enviarMensajeUseCaseProvider = enviarMensajeUseCaseProvider;
  }

  @Override
  public ChatViewModel get() {
    return newInstance(getMensajesUseCaseProvider.get(), enviarMensajeUseCaseProvider.get());
  }

  public static ChatViewModel_Factory create(
      Provider<GetMensajesUseCase> getMensajesUseCaseProvider,
      Provider<EnviarMensajeUseCase> enviarMensajeUseCaseProvider) {
    return new ChatViewModel_Factory(getMensajesUseCaseProvider, enviarMensajeUseCaseProvider);
  }

  public static ChatViewModel newInstance(GetMensajesUseCase getMensajesUseCase,
      EnviarMensajeUseCase enviarMensajeUseCase) {
    return new ChatViewModel(getMensajesUseCase, enviarMensajeUseCase);
  }
}
