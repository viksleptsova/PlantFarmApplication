package com.example.plantfarmapplication.di

import android.app.Application
import com.example.plantfarmapplication.model.abstractions.*
import com.example.plantfarmapplication.model.services.FieldsService
import com.example.plantfarmapplication.model.services.PlantsInLibService
import com.example.plantfarmapplication.repositories.EventRepository
import com.example.plantfarmapplication.repositories.FieldRepository
import com.example.plantfarmapplication.repositories.PlantRepository
import com.example.plantfarmapplication.repositories.RequestRepository

class App: Application() {

    val database by lazy { Database.getInstance(this) }
    val eventRepository by lazy { EventRepository(database.eventDao()) }
    val fieldRepository by lazy { FieldRepository(database.fieldDao()) }
    val plantRepository by lazy { PlantRepository(database.plantDao()) }
    val requestRepository by lazy { RequestRepository(database.requestDao()) }
    
    override fun onCreate() {
        super.onCreate()
        fieldsService = FieldsService(database.fieldDao())
        plantsInLibService = PlantsInLibService(database.plantDao())
    }

    companion object{
        lateinit var fieldsService: IFieldService
        lateinit var plantsInLibService : IPlantsInLibService
        // lateinit var eventsService : IEventsService
        lateinit var eventPlantService: IEventPlantService
    }
}