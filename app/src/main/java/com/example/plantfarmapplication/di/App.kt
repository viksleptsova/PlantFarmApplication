package com.example.plantfarmapplication.di

import android.app.Application
import com.example.plantfarmapplication.model.abstractions.*
import com.example.plantfarmapplication.model.services.EventPlantService
import com.example.plantfarmapplication.model.services.FieldsService
import com.example.plantfarmapplication.model.services.PlantsInLibService

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        fieldsService = FieldsService()
        eventPlantService = EventPlantService()
        plantsInLibService = PlantsInLibService()
    }

    companion object{
        lateinit var fieldsService: IFieldService
        lateinit var plantsInLibService : IPlantsInLibService
        // lateinit var eventsService : IEventsService
        lateinit var eventPlantService: IEventPlantService
    }
}