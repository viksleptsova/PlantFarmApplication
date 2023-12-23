package com.example.plantfarmapplication.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.dao.FieldDao
import com.example.plantfarmapplication.model.objects.Field
import kotlinx.coroutines.flow.Flow

class FieldRepository(private val fieldDao: FieldDao) {

    val allFields: LiveData<List<Field>> = fieldDao.getFields()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun upsert(field: Field) {
        fieldDao.upsertField(field)
    }
}