package com.example.plantfarmapplication.repositories

import androidx.annotation.WorkerThread
import com.example.plantfarmapplication.dao.RequestDao
import com.example.plantfarmapplication.model.objects.Request
import java.util.concurrent.Flow

class RequestRepository(private val requestDao: RequestDao) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allRequests: Flow<List<Request>> = requestDao.getRequests()

    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun upsert(request: Request) {
        requestDao.upsertRequest(request)
    }
}