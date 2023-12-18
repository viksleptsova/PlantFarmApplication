package com.example.plantfarmapplication.model.services

import com.example.plantfarmapplication.di.App
import com.example.plantfarmapplication.model.abstractions.IEventPlantService
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.model.objects.Plant

class EventPlantService: IEventPlantService {
    override val fieldsEventMap: Map<Int, List<Event>>
        get() = mapOf(App.fieldsService.fields[0].id to eventList, App.fieldsService.fields[1].id to eventList1, App.fieldsService.fields[4].id to eventList2)
    override val fieldsPlantMap: Map<Int, List<Plant>>
        get() = mapOf(App.fieldsService.fields[0].id to plantList, App.fieldsService.fields[1].id to plantList1,  App.fieldsService.fields[4].id to plantList2)

    private var eventList: List<Event> = listOf(Event(1, "Прополка", "16.10.23"),
        Event(2, "Обработка фунгицидом", "16.10.23")
    )

    private var plantList: List<Plant> = listOf(
        Plant(1, 1, "Черемуха", 15),
        Plant(2, 2, "Барбарис", 70),

    )

    private var eventList1: List<Event> = listOf(Event(2, "Прополка", "16.10.23")
    )

    private var plantList1: List<Plant> = listOf(
        Plant(1, 1, "Черемуха", 20),
        Plant(2, 2,"Рябина", 20),
        )

    private var eventList2: List<Event> = listOf(Event(1, "Прополка", "16.10.23"),
        Event(2, "Обработка фунгицидом", "16.10.23")
    )
    private var plantList2: List<Plant> = listOf(
        Plant(2, 2, "Барбарис", 15),
        Plant(2, 2, "Кустарник", 15)

    )


}