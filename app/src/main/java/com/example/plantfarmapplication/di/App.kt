package com.example.plantfarmapplication.di

import android.app.Application
import com.example.plantfarmapplication.model.abstractions.IFieldService
import com.example.plantfarmapplication.model.services.FieldsService

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        fieldsService = FieldsService()
    }

    companion object{
        lateinit var fieldsService: IFieldService
    }
}