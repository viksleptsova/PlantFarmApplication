package com.example.plantfarmapplication.model.services

import com.example.plantfarmapplication.model.abstractions.IPlantsInLibService
import com.example.plantfarmapplication.model.objects.PlantsInLib

class PlantsInLibService : IPlantsInLibService {
    override val plantsInLib: List<PlantsInLib>
        get() = listOf(PlantsInLib(0, 0, "Стефандра надрезаннолистная", "Stephandra incise"),
            PlantsInLib(1, 1, "Спирея японская", "Spires japonica Golden Princess"),
            PlantsInLib(2, 2, "Виноград девичий", "Parthenocissus"),
            PlantsInLib(3, 3, "Гортензия метельчатая", "Hydrangea paniculata Scyfall"),
            PlantsInLib(4, 4, "Дербенник иволистный", "Lythrum salicaria"),
            PlantsInLib(5, 5, "Очиток видный Бриллиант", "Sedum spectabile Brilliant"),
            PlantsInLib(6, 6, "Рябина обыкновенная", "Sorbus aucuparia"),
            PlantsInLib(7, 7, "Черемуха виргинская", "Prunus virginiana")
        )

    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private var _currentClickedDate = 0
}