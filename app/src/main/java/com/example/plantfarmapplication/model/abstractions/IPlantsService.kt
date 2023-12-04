package com.example.plantfarmapplication.model.abstractions

import com.example.plantfarmapplication.model.objects.Plant

interface IPlantsService {
    val plants: List<Plant>
    var currentClickedDate: Int
}