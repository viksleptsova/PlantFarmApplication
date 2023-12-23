package com.example.plantfarmapplication.model.abstractions

import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.model.objects.Plant
import kotlinx.coroutines.flow.Flow


interface IEventPlantService {
        val fieldsEventMap : Flow<Map<Field, List<Event>>>
        val fieldsPlantMap : Map<Int, List<Plant>>
}