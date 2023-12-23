package com.example.plantfarmapplication.model.services

import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.dao.PlantDao
import com.example.plantfarmapplication.model.abstractions.IPlantsInLibService
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.model.objects.PlantsInLib

class PlantsInLibService(private val plantDao: PlantDao) : IPlantsInLibService {
    override val plantsInLib: LiveData<List<Plant>>
        get() = plantDao.getPlants()
            /*listOf(PlantsInLib(0, 0, "Стефандра надрезаннолистная", "Stephandra incise"),
            PlantsInLib(1, 1, "Спирея японская", "Spires japonica Golden Princess"),
            PlantsInLib(2, 2, "Виноград девичий", "Parthenocissus"),
            PlantsInLib(3, 3, "Гортензия метельчатая", "Hydrangea paniculata Scyfall"),
            PlantsInLib(4, 4, "Дербенник иволистный", "Lythrum salicaria"),
            PlantsInLib(5, 5, "Очиток видный Бриллиант", "Sedum spectabile Brilliant"),
            PlantsInLib(6, 6, "Рябина обыкновенная", "Sorbus aucuparia"),
            PlantsInLib(7, 7, "Черемуха виргинская", "Prunus virginiana")
        )*/

    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private var _currentClickedDate = 0
}