package com.example.plantfarmapplication.converters

import androidx.room.TypeConverter
import com.example.plantfarmapplication.model.objects.Plant
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class PlantConverter {
    @TypeConverter
    fun storedJsonToPlantList(data: String?): List<Plant?>? {
        if (data == null) {
            return emptyList<Plant>()
        }
        return Json.decodeFromString<List<Plant>>(data)
    }

    @TypeConverter
    fun plantListToStoredString(plants: List<Plant>): String {
        return Json.encodeToString(plants)
    }

    @TypeConverter
    fun storedJsonToPlant(data: String?): Plant? {
        if (data == null) {
            return null
        }
        return Json.decodeFromString<Plant>(data)
    }

    @TypeConverter
    fun plantToStoredString(plant: Plant): String {
        return Json.encodeToString(plant)
    }
}