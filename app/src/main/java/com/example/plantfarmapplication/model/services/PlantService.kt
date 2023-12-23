package com.example.plantfarmapplication.model.services

import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.dao.PlantDao
import com.example.plantfarmapplication.model.abstractions.IPlantsService
import com.example.plantfarmapplication.model.objects.Plant

class PlantService(private val plantDao: PlantDao) : IPlantsService {
    override val plants: LiveData<List<Plant>>
        get() = plantDao.getPlants()

    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private var _currentClickedDate = 0
}
