package com.example.plantfarmapplication.model.objects

import com.example.plantfarmapplication.model.abstractions.IEventPlant

class Event (
    val id: Int,
    val eventName: String,
    val eventDate: String
): IEventPlant