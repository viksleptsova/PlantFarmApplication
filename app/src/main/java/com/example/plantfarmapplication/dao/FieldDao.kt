package com.example.plantfarmapplication.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.plantfarmapplication.model.objects.Field
import kotlinx.coroutines.flow.Flow

@Dao
interface FieldDao {

    @Upsert
    suspend fun upsertField(field: Field)

    @Delete
    suspend fun deleteField(field: Field)

    @Query("SELECT * from field")
    fun getFields(): Flow<List<Field>>
}