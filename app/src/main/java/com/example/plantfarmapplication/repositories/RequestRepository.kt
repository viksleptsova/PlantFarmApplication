package com.example.plantfarmapplication.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.dao.RequestDao
import com.example.plantfarmapplication.model.objects.Request
import java.util.concurrent.Flow

class RequestRepository(private val requestDao: RequestDao) {

    val allRequests: LiveData<List<Request>> = requestDao.getRequests()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun upsert(request: Request) {
        requestDao.upsertRequest(request)
    }
}