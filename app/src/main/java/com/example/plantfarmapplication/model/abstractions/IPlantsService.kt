package com.example.plantfarmapplication.model.abstractions

import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.model.objects.Plant

interface IPlantsService {
    val plants: LiveData<List<Plant>>
    var currentClickedDate: Int
}