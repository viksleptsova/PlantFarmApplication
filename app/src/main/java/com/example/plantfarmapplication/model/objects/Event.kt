package com.example.plantfarmapplication.model.objects

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.plantfarmapplication.model.abstractions.IEventPlant
import java.util.Date

@Entity
data class Event (
    val eventName: String,
    val eventDate: Date,
    @PrimaryKey(autoGenerate = true)
    val eventId: Int = 0
): IEventPlant
