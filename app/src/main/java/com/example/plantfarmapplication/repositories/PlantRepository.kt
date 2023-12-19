package com.example.plantfarmapplication.repositories

import androidx.annotation.WorkerThread
import com.example.plantfarmapplication.dao.PlantDao
import com.example.plantfarmapplication.model.objects.Plant
import java.util.concurrent.Flow

class PlantRepository(private val plantDao: PlantDao) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allPlants: Flow<List<Plant>> = plantDao.getPlants()

    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun upsert(plant: Plant) {
        plantDao.upsertPlant(plant)
    }
}