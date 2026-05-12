package com.assentia.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011J\u001e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/assentia/app/presentation/viewmodel/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "getMensajesUseCase", "Lcom/assentia/app/domain/usecase/GetMensajesUseCase;", "enviarMensajeUseCase", "Lcom/assentia/app/domain/usecase/EnviarMensajeUseCase;", "(Lcom/assentia/app/domain/usecase/GetMensajesUseCase;Lcom/assentia/app/domain/usecase/EnviarMensajeUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/assentia/app/presentation/state/ChatUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "actualizarTexto", "", "texto", "", "cargarMensajes", "pacienteId", "userId", "enviarMensaje", "remitenteId", "destinatarioId", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ChatViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.GetMensajesUseCase getMensajesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.assentia.app.domain.usecase.EnviarMensajeUseCase enviarMensajeUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.assentia.app.presentation.state.ChatUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.ChatUiState> uiState = null;
    
    @javax.inject.Inject()
    public ChatViewModel(@org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.GetMensajesUseCase getMensajesUseCase, @org.jetbrains.annotations.NotNull()
    com.assentia.app.domain.usecase.EnviarMensajeUseCase enviarMensajeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.assentia.app.presentation.state.ChatUiState> getUiState() {
        return null;
    }
    
    public final void cargarMensajes(@org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    public final void actualizarTexto(@org.jetbrains.annotations.NotNull()
    java.lang.String texto) {
    }
    
    public final void enviarMensaje(@org.jetbrains.annotations.NotNull()
    java.lang.String remitenteId, @org.jetbrains.annotations.NotNull()
    java.lang.String destinatarioId, @org.jetbrains.annotations.NotNull()
    java.lang.String pacienteId) {
    }
}