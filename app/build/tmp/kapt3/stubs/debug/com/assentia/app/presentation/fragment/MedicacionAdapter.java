package com.assentia.app.presentation.fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\"\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/assentia/app/presentation/fragment/MedicacionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/assentia/app/presentation/fragment/MedicacionAdapter$VH;", "onRegistrar", "Lkotlin/Function1;", "Lcom/assentia/app/domain/model/Medicacion;", "", "(Lkotlin/jvm/functions/Function1;)V", "items", "", "registros", "", "Lcom/assentia/app/domain/model/RegistroMedicacion;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "VH", "app_debug"})
public final class MedicacionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.assentia.app.presentation.fragment.MedicacionAdapter.VH> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.assentia.app.domain.model.Medicacion, kotlin.Unit> onRegistrar = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.assentia.app.domain.model.Medicacion> items = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.assentia.app.domain.model.RegistroMedicacion> registros;
    
    public MedicacionAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.assentia.app.domain.model.Medicacion, kotlin.Unit> onRegistrar) {
        super();
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.Medicacion> list, @org.jetbrains.annotations.NotNull()
    java.util.List<com.assentia.app.domain.model.RegistroMedicacion> registros) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.assentia.app.presentation.fragment.MedicacionAdapter.VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.assentia.app.presentation.fragment.MedicacionAdapter.VH holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/assentia/app/presentation/fragment/MedicacionAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "b", "Lcom/assentia/app/databinding/ItemMedicacionBinding;", "(Lcom/assentia/app/presentation/fragment/MedicacionAdapter;Lcom/assentia/app/databinding/ItemMedicacionBinding;)V", "bind", "", "med", "Lcom/assentia/app/domain/model/Medicacion;", "app_debug"})
    public final class VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.assentia.app.databinding.ItemMedicacionBinding b = null;
        
        public VH(@org.jetbrains.annotations.NotNull()
        com.assentia.app.databinding.ItemMedicacionBinding b) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.assentia.app.domain.model.Medicacion med) {
        }
    }
}