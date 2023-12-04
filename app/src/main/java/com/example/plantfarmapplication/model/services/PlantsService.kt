package com.example.plantfarmapplication.model.services

import com.example.plantfarmapplication.model.abstractions.IPlantsService
import com.example.plantfarmapplication.model.objects.Plant

class PlantsService() : IPlantsService {
    override val plants: List<Plant>
        get() = listOf(
            Plant(1, "Черемуха", 100),
            Plant(2, "Черемуха", 70),
            Plant(3, "Черемуха", 50),
            Plant(4, "Черемуха", 50),
            Plant(5, "Черемуха", 60),
            Plant(6, "Черемуха", 80),

            )


    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private var _currentClickedDate = 0
}