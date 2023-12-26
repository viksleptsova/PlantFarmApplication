package com.example.plantfarmapplication.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.plantfarmapplication.model.objects.Plant
import kotlinx.coroutines.flow.Flow

@Dao
interface PlantDao {

    @Upsert
    suspend fun upsertPlant(plant: Plant)

    @Delete
    suspend fun deletePlant(plant: Plant)

    @Query("SELECT * from plant")
    fun getPlants(): Flow<List<Plant>>
}