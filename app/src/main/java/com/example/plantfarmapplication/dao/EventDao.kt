package com.example.plantfarmapplication.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.plantfarmapplication.model.objects.Event
import kotlinx.coroutines.flow.Flow

@Dao
interface EventDao {

    @Upsert
    suspend fun upsertEvent(event: Event)

    @Delete
    suspend fun deleteEvent(event: Event)

    @Query("SELECT * from event")
    fun getEvents(): Flow<List<Event>>
}