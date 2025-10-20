package com.example.tp.inside;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\'J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\'\u00a8\u0006\f"}, d2 = {"Lcom/example/tp/inside/UsuarioDao;", "", "getAll", "", "Lcom/example/tp/inside/Usuario;", "getUsuarioByName", "usuario", "", "insert", "", "login", "password", "app_debug"})
@androidx.room.Dao()
public abstract interface UsuarioDao {
    
    @androidx.room.Query(value = "SELECT * FROM usuario_desc")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.tp.inside.Usuario> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM usuario_desc WHERE user = :usuario LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.tp.inside.Usuario getUsuarioByName(@org.jetbrains.annotations.NotNull()
    java.lang.String usuario);
    
    @androidx.room.Query(value = "SELECT * FROM usuario_desc WHERE user = :usuario AND password = :password LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.tp.inside.Usuario login(@org.jetbrains.annotations.NotNull()
    java.lang.String usuario, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.tp.inside.Usuario usuario);
}