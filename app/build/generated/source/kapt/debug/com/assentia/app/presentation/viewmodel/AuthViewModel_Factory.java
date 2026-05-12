package com.assentia.app.presentation.viewmodel;

import com.assentia.app.domain.usecase.GetCurrentUserUseCase;
import com.assentia.app.domain.usecase.LoginUseCase;
import com.assentia.app.domain.usecase.LogoutUseCase;
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
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<LogoutUseCase> logoutUseCaseProvider;

  private final Provider<GetCurrentUserUseCase> getCurrentUserUseCaseProvider;

  public AuthViewModel_Factory(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<LogoutUseCase> logoutUseCaseProvider,
      Provider<GetCurrentUserUseCase> getCurrentUserUseCaseProvider) {
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.logoutUseCaseProvider = logoutUseCaseProvider;
    this.getCurrentUserUseCaseProvider = getCurrentUserUseCaseProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(loginUseCaseProvider.get(), logoutUseCaseProvider.get(), getCurrentUserUseCaseProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<LogoutUseCase> logoutUseCaseProvider,
      Provider<GetCurrentUserUseCase> getCurrentUserUseCaseProvider) {
    return new AuthViewModel_Factory(loginUseCaseProvider, logoutUseCaseProvider, getCurrentUserUseCaseProvider);
  }

  public static AuthViewModel newInstance(LoginUseCase loginUseCase, LogoutUseCase logoutUseCase,
      GetCurrentUserUseCase getCurrentUserUseCase) {
    return new AuthViewModel(loginUseCase, logoutUseCase, getCurrentUserUseCase);
  }
}
