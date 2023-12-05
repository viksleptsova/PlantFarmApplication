package com.example.plantfarmapplication.model.objects

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Request (
    val requestedPlant: Plant,
    val receiver: String,
    val requestDate: Date,
    val count: Int,
    @PrimaryKey(autoGenerate = true)
    val requestId: Int
)
