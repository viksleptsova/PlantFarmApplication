package com.example.plantfarmapplication.di

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.plantfarmapplication.dao.EventDao
import com.example.plantfarmapplication.dao.FieldDao
import com.example.plantfarmapplication.dao.PlantDao
import com.example.plantfarmapplication.dao.RequestDao
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.model.objects.PlantsInLib
import com.example.plantfarmapplication.model.objects.Request
import java.util.concurrent.Executors


@Database(
    entities = [Field::class, Plant::class, Event::class, Request::class, PlantsInLib::class],
    version = 1)
abstract class Database: RoomDatabase() {
    abstract fun fieldDao(): FieldDao
    abstract fun plantDao(): PlantDao
    abstract fun eventDao(): EventDao
    abstract fun requestDao(): RequestDao

    companion object {
        @Volatile
        private var INSTANCE: com.example.plantfarmapplication.di.Database? = null

        private const val NUMBER_OF_THREADS = 4
        val databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS)

        fun getInstance(context: Context): com.example.plantfarmapplication.di.Database {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    com.example.plantfarmapplication.di.Database::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }

            fun destroyInstance() {
                INSTANCE = null
            }
        }
    }
}