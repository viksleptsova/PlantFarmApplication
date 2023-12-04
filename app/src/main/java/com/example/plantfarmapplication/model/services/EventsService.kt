package com.example.plantfarmapplication.model.services

import com.example.plantfarmapplication.model.abstractions.IEventsService
import com.example.plantfarmapplication.model.objects.Event

class EventsService : IEventsService {
    override val events: List<Event>
        get() = listOf(Event(1, "Прополка", "16.10.23"),
            Event(2, "Прополка", "16.10.23"),
            Event(3, "Прополка", "16.10.23"),
            Event(4, "Прополка", "16.10.23"),
        )

    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private var _currentClickedDate = 0
}