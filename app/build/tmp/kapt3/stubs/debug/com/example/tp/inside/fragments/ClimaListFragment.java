package com.example.tp.inside.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010\u001bJ&\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010$\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/tp/inside/fragments/ClimaListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "btnSalir", "Landroid/widget/Button;", "completedCalls", "", "distritos", "", "Lcom/example/tp/inside/fragments/ClimaListFragment$DistritoView;", "successfulCalls", "tvEstadoCarga", "Landroid/widget/TextView;", "abrirDetalleDistrito", "", "nombreDistrito", "", "climaData", "Lcom/example/tp/dtos/PostDTO;", "actualizarEstado", "cargarTodosLosClimas", "initViews", "view", "Landroid/view/View;", "obtenerClimaDistrito", "distrito", "position", "(Lcom/example/tp/inside/fragments/ClimaListFragment$DistritoView;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setupListeners", "DistritoView", "app_debug"})
public final class ClimaListFragment extends androidx.fragment.app.Fragment {
    private android.widget.TextView tvEstadoCarga;
    private android.widget.Button btnSalir;
    private int completedCalls = 0;
    private int successfulCalls = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.tp.inside.fragments.ClimaListFragment.DistritoView> distritos = null;
    
    public ClimaListFragment() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews(android.view.View view) {
    }
    
    private final void setupListeners() {
    }
    
    private final void cargarTodosLosClimas() {
    }
    
    private final java.lang.Object obtenerClimaDistrito(com.example.tp.inside.fragments.ClimaListFragment.DistritoView distrito, int position, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void actualizarEstado() {
    }
    
    private final void abrirDetalleDistrito(java.lang.String nombreDistrito, com.example.tp.dtos.PostDTO climaData) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JC\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006+"}, d2 = {"Lcom/example/tp/inside/fragments/ClimaListFragment$DistritoView;", "", "nombre", "", "textView", "Landroid/widget/TextView;", "button", "Landroid/widget/Button;", "card", "Landroidx/cardview/widget/CardView;", "climaData", "Lcom/example/tp/dtos/PostDTO;", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/Button;Landroidx/cardview/widget/CardView;Lcom/example/tp/dtos/PostDTO;)V", "getButton", "()Landroid/widget/Button;", "setButton", "(Landroid/widget/Button;)V", "getCard", "()Landroidx/cardview/widget/CardView;", "setCard", "(Landroidx/cardview/widget/CardView;)V", "getClimaData", "()Lcom/example/tp/dtos/PostDTO;", "setClimaData", "(Lcom/example/tp/dtos/PostDTO;)V", "getNombre", "()Ljava/lang/String;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    static final class DistritoView {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String nombre = null;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView textView;
        @org.jetbrains.annotations.Nullable()
        private android.widget.Button button;
        @org.jetbrains.annotations.Nullable()
        private androidx.cardview.widget.CardView card;
        @org.jetbrains.annotations.Nullable()
        private com.example.tp.dtos.PostDTO climaData;
        
        public DistritoView(@org.jetbrains.annotations.NotNull()
        java.lang.String nombre, @org.jetbrains.annotations.Nullable()
        android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
        android.widget.Button button, @org.jetbrains.annotations.Nullable()
        androidx.cardview.widget.CardView card, @org.jetbrains.annotations.Nullable()
        com.example.tp.dtos.PostDTO climaData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNombre() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getTextView() {
            return null;
        }
        
        public final void setTextView(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.Button getButton() {
            return null;
        }
        
        public final void setButton(@org.jetbrains.annotations.Nullable()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.cardview.widget.CardView getCard() {
            return null;
        }
        
        public final void setCard(@org.jetbrains.annotations.Nullable()
        androidx.cardview.widget.CardView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.tp.dtos.PostDTO getClimaData() {
            return null;
        }
        
        public final void setClimaData(@org.jetbrains.annotations.Nullable()
        com.example.tp.dtos.PostDTO p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.Button component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.cardview.widget.CardView component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.tp.dtos.PostDTO component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.tp.inside.fragments.ClimaListFragment.DistritoView copy(@org.jetbrains.annotations.NotNull()
        java.lang.String nombre, @org.jetbrains.annotations.Nullable()
        android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
        android.widget.Button button, @org.jetbrains.annotations.Nullable()
        androidx.cardview.widget.CardView card, @org.jetbrains.annotations.Nullable()
        com.example.tp.dtos.PostDTO climaData) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}