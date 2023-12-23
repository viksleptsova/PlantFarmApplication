package com.example.plantfarmapplication.converters

import androidx.room.TypeConverter
import com.example.plantfarmapplication.model.objects.Event
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString

class EventConverter {
    @TypeConverter
    fun storedJsonToEventList(data: String?): List<Event?>? {
        if (data == null) {
            return emptyList<Event>()
        }
        return Json.decodeFromString<List<Event>>(data)
    }

    @TypeConverter
    fun myObjectsToStoredString(events: List<Event>): String {
        return Json.encodeToString(events)
    }
}