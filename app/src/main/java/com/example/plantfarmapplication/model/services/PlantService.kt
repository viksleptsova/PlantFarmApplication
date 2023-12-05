package com.example.plantfarmapplication.model.services

import com.example.plantfarmapplication.model.abstractions.IPlantsService
import com.example.plantfarmapplication.model.objects.Plant

class PlantService : IPlantsService {
    override val plants: List<Plant>
        get() = TODO("Not yet implemented")

    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private var _currentClickedDate = 0
}
