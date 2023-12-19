package com.example.plantfarmapplication.repositories

import androidx.annotation.WorkerThread
import com.example.plantfarmapplication.dao.FieldDao
import com.example.plantfarmapplication.model.objects.Field
import java.util.concurrent.Flow

class FieldRepository(private val fieldDao: FieldDao) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val allFields: Flow<List<Field>> = fieldDao.getFields()

    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun upsert(field: Field) {
        fieldDao.upsertField(field)
    }
}