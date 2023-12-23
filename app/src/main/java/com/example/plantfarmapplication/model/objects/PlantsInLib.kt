package com.example.plantfarmapplication.model.objects

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity
@Serializable
class PlantsInLib (
    val pictureId: Int,
    val plantName: String,
    val plantLatinName: String,
    @PrimaryKey(autoGenerate = true)
    val plantsInLibId: Int
)