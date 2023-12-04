package com.example.plantfarmapplication.model.objects

import com.example.plantfarmapplication.model.abstractions.IEventPlant

class Plant (
    val id: Int,
    val plantName: String,
    val plantCount: Int
)
    :IEventPlant