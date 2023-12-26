package com.example.plantfarmapplication.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.dao.PlantsInLibDao
import com.example.plantfarmapplication.model.objects.PlantsInLib
import kotlinx.coroutines.flow.Flow

class PlantsInLibRepository(private val plantsInLibDao: PlantsInLibDao) {

    val allPlantsInLib: Flow<List<PlantsInLib>> = plantsInLibDao.getPlantsInLib()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun upsert(plants: PlantsInLib) {
        plantsInLibDao.upsertPlantInLib(plants)
    }
}