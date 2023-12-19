package com.example.plantfarmapplication.dao

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.plantfarmapplication.model.objects.Plant

interface PlantDao {

    @Upsert
    suspend fun upsertPlant(plant: Plant)

    @Delete
    suspend fun deletePlant(plant: Plant)

    @Query("SELECT * from plant")
    fun getPlants(): LiveData<List<Plant>>
}