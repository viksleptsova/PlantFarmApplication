package com.example.plantfarmapplication.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.plantfarmapplication.model.objects.Field
import java.util.concurrent.Flow

@Dao
interface FieldDao {

    @Upsert
    suspend fun upsertField(field: Field)

    @Delete
    suspend fun deleteField(field: Field)

    @Query("SELECT * from field")
    fun getFields(): List<Field>
}