package com.example.plantfarmapplication.converters

import androidx.room.TypeConverter
import com.example.plantfarmapplication.model.objects.PlantsInLib
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class PlantsInLibConverter {

    @TypeConverter
    fun storedJsonToPlantsInLibList(data: String?): List<PlantsInLib?>? {
        if (data == null) {
            return emptyList<PlantsInLib>()
        }
        return Json.decodeFromString<List<PlantsInLib>>(data)
    }

    @TypeConverter
    fun plantListToStoredString(plantsInLib: List<PlantsInLib>): String {
        return Json.encodeToString(plantsInLib)
    }

    @TypeConverter
    fun storedJsonToPlantsInLib(data: String?): PlantsInLib? {
        if (data == null) {
            return null
        }
        return Json.decodeFromString<PlantsInLib>(data)
    }

    @TypeConverter
    fun plantToStoredString(plant: PlantsInLib): String {
        return Json.encodeToString(plant)
    }
}