package com.example.plantfarmapplication.di

import android.app.Application
import com.example.plantfarmapplication.model.abstractions.IEventsService
import com.example.plantfarmapplication.model.abstractions.IFieldService
import com.example.plantfarmapplication.model.abstractions.IPlantsService
import com.example.plantfarmapplication.model.services.EventsService
import com.example.plantfarmapplication.model.services.FieldsService
import com.example.plantfarmapplication.model.services.PlantsService

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        fieldsService = FieldsService()
        plantsService = PlantsService()
        eventsService = EventsService()
    }

    companion object{
        lateinit var fieldsService: IFieldService
        lateinit var plantsService : IPlantsService
        lateinit var eventsService : IEventsService
    }
}