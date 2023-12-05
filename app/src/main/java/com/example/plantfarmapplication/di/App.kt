package com.example.plantfarmapplication.di

import android.app.Application
import com.example.plantfarmapplication.model.abstractions.IEventPlantService
import com.example.plantfarmapplication.model.abstractions.IEventsService
import com.example.plantfarmapplication.model.abstractions.IFieldService
import com.example.plantfarmapplication.model.abstractions.IPlantsService
import com.example.plantfarmapplication.model.services.EventPlantService
import com.example.plantfarmapplication.model.services.FieldsService

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        fieldsService = FieldsService()
        eventPlantService = EventPlantService()
    }

    companion object{
        lateinit var fieldsService: IFieldService
        // lateinit var plantsService : IPlantsService
        // lateinit var eventsService : IEventsService
        lateinit var eventPlantService: IEventPlantService
    }
}