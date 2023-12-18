package com.example.plantfarmapplication.model.abstractions

import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.model.objects.Plant


interface IEventPlantService {
        val fieldsEventMap : Map<Int, List<Event>>
        val fieldsPlantMap : Map<Int, List<Plant>>
}