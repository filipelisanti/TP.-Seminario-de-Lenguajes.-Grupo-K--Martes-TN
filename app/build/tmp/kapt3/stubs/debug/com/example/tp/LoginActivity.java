package com.example.tp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\u0010\u0010\'\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020!H\u0002J\u0012\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202H\u0016J-\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u00152\u000e\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0013062\u0006\u00107\u001a\u000208H\u0016\u00a2\u0006\u0002\u00109R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006:"}, d2 = {"Lcom/example/tp/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CvRecordarUsuario", "Landroid/widget/CheckBox;", "getCvRecordarUsuario", "()Landroid/widget/CheckBox;", "setCvRecordarUsuario", "(Landroid/widget/CheckBox;)V", "EtPass", "Landroid/widget/EditText;", "getEtPass", "()Landroid/widget/EditText;", "setEtPass", "(Landroid/widget/EditText;)V", "EtUsuario", "getEtUsuario", "setEtUsuario", "pendingUsername", "", "rand", "", "getRand", "()I", "setRand", "(I)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "createNotificationChannel", "", "login", "usuario", "password", "mostrarNotificacionRecordarUsuario", "mostrarTemp", "navigateToIniciarSesion", "navigateToRegister", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    public androidx.appcompat.widget.Toolbar toolbar;
    public android.widget.EditText EtUsuario;
    public android.widget.EditText EtPass;
    public android.widget.CheckBox CvRecordarUsuario;
    private int rand;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pendingUsername;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtUsuario() {
        return null;
    }
    
    public final void setEtUsuario(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtPass() {
        return null;
    }
    
    public final void setEtPass(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getCvRecordarUsuario() {
        return null;
    }
    
    public final void setCvRecordarUsuario(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox p0) {
    }
    
    public final int getRand() {
        return 0;
    }
    
    public final void setRand(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final int mostrarTemp() {
        return 0;
    }
    
    private final void login(java.lang.String usuario, java.lang.String password) {
    }
    
    private final void navigateToRegister() {
    }
    
    private final void navigateToIniciarSesion(java.lang.String usuario) {
    }
    
    private final void createNotificationChannel() {
    }
    
    private final void mostrarNotificacionRecordarUsuario() {
    }
}