package com.assentia.app.presentation.fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001c\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0016\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/assentia/app/presentation/fragment/MensajesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/assentia/app/presentation/fragment/MensajesAdapter$VH;", "currentUserId", "", "(Ljava/lang/String;)V", "items", "", "Lcom/assentia/app/domain/model/Mensaje;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "", "userId", "VH", "app_debug"})
public final class MensajesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.assentia.app.presentation.fragment.MensajesAdapter.VH> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentUserId;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Mensaje> items = null;
    
    public MensajesAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.String currentUserId) {
        super();
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Mensaje> list, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.assentia.app.presentation.fragment.MensajesAdapter.VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.assentia.app.presentation.fragment.MensajesAdapter.VH holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/assentia/app/presentation/fragment/MensajesAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "b", "Lcom/assentia/app/databinding/ItemMensajeBinding;", "(Lcom/assentia/app/presentation/fragment/MensajesAdapter;Lcom/assentia/app/databinding/ItemMensajeBinding;)V", "bind", "", "msg", "Lcom/assentia/app/domain/model/Mensaje;", "app_debug"})
    public final class VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.assentia.app.databinding.ItemMensajeBinding b = null;
        
        public VH(@org.jetbrains.annotations.NotNull()
        com.assentia.app.databinding.ItemMensajeBinding b) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.assentia.app.domain.model.Mensaje msg) {
        }
    }
}