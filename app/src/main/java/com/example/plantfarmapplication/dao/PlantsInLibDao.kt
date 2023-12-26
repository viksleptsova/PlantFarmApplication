package com.example.plantfarmapplication.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.plantfarmapplication.model.objects.PlantsInLib
import kotlinx.coroutines.flow.Flow

@Dao
interface PlantsInLibDao {
    @Upsert
    suspend fun upsertPlantInLib(plants: PlantsInLib)

    @Delete
    suspend fun deletePlantInLib(plants: PlantsInLib)

    @Query("SELECT * from plantsinlib")
    fun getPlantsInLib(): Flow<List<PlantsInLib>>
}