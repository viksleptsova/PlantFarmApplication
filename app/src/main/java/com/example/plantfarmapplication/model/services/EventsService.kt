package com.example.plantfarmapplication.model.services

import com.example.plantfarmapplication.model.abstractions.IEventPlant
import com.example.plantfarmapplication.model.abstractions.IEventsService
import com.example.plantfarmapplication.model.objects.Event

class EventsService : IEventsService {
    override val map: Map<Int, Array<IEventPlant>>
        get() = _map


    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private lateinit var _map: Map<Int, Array<IEventPlant>>
    private var _currentClickedDate = 0
}