package com.example.plantfarmapplication.model.abstractions

import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.model.objects.PlantsInLib

interface IPlantsInLibService {
    val plantsInLib: List<PlantsInLib>
    var currentClickedDate: Int
}