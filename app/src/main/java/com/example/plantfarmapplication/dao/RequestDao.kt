package com.example.plantfarmapplication.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.plantfarmapplication.model.objects.Request
import kotlinx.coroutines.flow.Flow

@Dao
interface RequestDao {

    @Upsert
    suspend fun upsertRequest(request: Request)

    @Delete
    suspend fun deleteRequest(request: Request)

    @Query("SELECT * from request")
    fun getRequests(): Flow<List<Request>>
}