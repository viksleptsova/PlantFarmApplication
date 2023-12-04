package com.example.plantfarmapplication.model.abstractions

import com.example.plantfarmapplication.model.objects.Event

interface IEventsService {
    val map: Map<Int, Array<IEventPlant>>
    var currentClickedDate: Int
}