package com.example.plantfarmapplication.model.objects

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Field (
    val fieldName: String,
    val plantsCount: Int,
    val fieldCategory: String,
    val eventList: List<Event>,
    val plantList: List<Plant>,
    @PrimaryKey(autoGenerate = true)
    val fieldId: Int = 0
)