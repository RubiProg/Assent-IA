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
public final class GetUnreadCountUseCase_Factory implements Factory<GetUnreadCountUseCase> {
  private final Provider<MensajeRepository> mensajeRepositoryProvider;

  public GetUnreadCountUseCase_Factory(Provider<MensajeRepository> mensajeRepositoryProvider) {
    this.mensajeRepositoryProvider = mensajeRepositoryProvider;
  }

  @Override
  public GetUnreadCountUseCase get() {
    return newInstance(mensajeRepositoryProvider.get());
  }

  public static GetUnreadCountUseCase_Factory create(
      Provider<MensajeRepository> mensajeRepositoryProvider) {
    return new GetUnreadCountUseCase_Factory(mensajeRepositoryProvider);
  }

  public static GetUnreadCountUseCase newInstance(MensajeRepository mensajeRepository) {
    return new GetUnreadCountUseCase(mensajeRepository);
  }
}
