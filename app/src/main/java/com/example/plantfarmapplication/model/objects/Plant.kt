package com.example.plantfarmapplication.model.objects

import com.example.plantfarmapplication.model.abstractions.IEventPlantService

class Plant(
    val id: Int,
    val pictureId: Int,
    val plantName: String,
    val plantCount: Int
)