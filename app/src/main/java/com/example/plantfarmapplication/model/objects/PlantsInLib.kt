package com.example.plantfarmapplication.model.objects

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class PlantsInLib (
    val pictureId: Int,
    val plantName: String,
    val plantLatinName: String,
    @PrimaryKey(autoGenerate = true)
    val plantsInLibId: Int
)