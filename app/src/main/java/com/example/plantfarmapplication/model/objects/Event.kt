package com.example.plantfarmapplication.model.objects

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable
import java.util.Date

@Entity
@Serializable
data class Event (
    val eventName: String,
    val eventDate: Date,
    @PrimaryKey(autoGenerate = true)
    val eventId: Int = 0
)
