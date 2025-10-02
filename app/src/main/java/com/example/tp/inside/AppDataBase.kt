package com.example.tp.inside

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Usuario::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDao
    companion object{
        private var INSTANCIA: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            if(INSTANCIA == null){
                synchronized(this){
                    INSTANCIA = Room.databaseBuilder(
                        context,
                        AppDatabase::class.java, "usuarios_database")
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCIA!!
        }
    }
}