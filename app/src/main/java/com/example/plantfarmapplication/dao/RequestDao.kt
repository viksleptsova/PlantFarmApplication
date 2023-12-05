package com.example.plantfarmapplication.dao

import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.plantfarmapplication.model.objects.Request

interface RequestDao {

    @Upsert
    suspend fun upsertRequest(request: Request)

    @Delete
    suspend fun deleteRequest(request: Request)

    @Query("SELECT * from request")
    fun getRequests(): List<Request>
}