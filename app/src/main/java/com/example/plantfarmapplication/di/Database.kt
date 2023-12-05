package com.example.plantfarmapplication.di

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.plantfarmapplication.dao.EventDao
import com.example.plantfarmapplication.dao.FieldDao
import com.example.plantfarmapplication.dao.PlantDao
import com.example.plantfarmapplication.dao.RequestDao
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.model.objects.Request

@Database(
    entities = [Field::class, Plant::class, Event::class, Request::class],
    version = 1)
abstract class Database: RoomDatabase() {
    abstract val fieldDao: FieldDao
    abstract val plantDao: PlantDao
    abstract val eventDao: EventDao
    abstract val requestDao: RequestDao

}