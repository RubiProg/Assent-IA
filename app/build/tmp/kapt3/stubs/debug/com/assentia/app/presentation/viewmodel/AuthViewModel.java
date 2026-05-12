package com.assentia.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/assentia/app/presentation/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "loginUseCase", "Lcom/assentia/app/domain/usecase/LoginUseCase;", "logoutUseCase", "Lcom/assentia/app/domain/usecase/LogoutUseCase;", "getCurrentUserUseCase", "Lcom/assentia/app/domain/usecase/GetCurrentUserUseCase;", "(Lcom/assentia/app/domain/usecase/LoginUseCase;Lcom/assentia/app/domain/usecase/LogoutUseCase;Lcom/assentia/app/domain/usecase/GetCurrentUserUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/assentia/app/presentation/state/LoginUiState;", "currentUser", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/assentia/app/domain/model/User;", "getCurrentUser", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "clearErrors", "", "login", "email", "", "password", "logout", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.LoginUseCase loginUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.LogoutUseCase logoutUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetCurrentUserUseCase getCurrentUserUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assentia.app.presentation.state.LoginUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.LoginUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.assentia.app.domain.model.User> currentUser = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.LogoutUseCase logoutUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetCurrentUserUseCase getCurrentUserUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.LoginUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.assentia.app.domain.model.User> getCurrentUser() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void logout() {
    }
    
    public final void clearErrors() {
    }
}