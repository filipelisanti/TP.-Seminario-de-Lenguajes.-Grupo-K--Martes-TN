package com.example.tp.inside

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface UsuarioDao {
    @Query("SELECT * FROM usuario_desc")
    fun getAll(): List<Usuario>

    @Query("SELECT * FROM usuario_desc WHERE user = :usuario LIMIT 1")
    fun getUsuarioByName(usuario: String): Usuario?

    @Query("SELECT * FROM usuario_desc WHERE user = :usuario AND password = :password LIMIT 1")
    fun login(usuario: String, password: String): Usuario?
    @Insert
    fun insert(usuario: Usuario)
}