package com.example.plantfarmapplication.model.objects

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity
@Serializable
data class Plant (
    val plantName: String,
    val plantCount: Int,
    val plantCategory: String,
    val height: Int,
    val diameter: Int,
    val winter_survivability: String,
    val placement: String,
    val soils: String,
    val count: Int,
    val traits: String,
    @PrimaryKey(autoGenerate = true)
    val plantId: Int
)
