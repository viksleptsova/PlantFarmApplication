package com.example.plantfarmapplication.model.abstractions

import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.model.objects.PlantsInLib

interface IPlantsInLibService {
    val plantsInLib: LiveData<List<Plant>>
    var currentClickedDate: Int
}