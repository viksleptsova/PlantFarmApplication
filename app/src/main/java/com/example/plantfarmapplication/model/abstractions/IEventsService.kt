package com.example.plantfarmapplication.model.abstractions

import com.example.plantfarmapplication.model.objects.Event

interface IEventsService {
    val events: List<Event>
    var currentClickedDate: Int
}