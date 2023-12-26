package com.example.plantfarmapplication.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.dao.PlantDao
import com.example.plantfarmapplication.model.objects.Plant
import kotlinx.coroutines.flow.Flow

class PlantRepository(private val plantDao: PlantDao) {

    val allPlants: Flow<List<Plant>> = plantDao.getPlants()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun upsert(plant: Plant) {
        plantDao.upsertPlant(plant)
    }
}