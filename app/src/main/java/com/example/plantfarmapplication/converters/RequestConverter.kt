package com.example.plantfarmapplication.converters

import androidx.room.TypeConverter
import com.example.plantfarmapplication.model.objects.Request
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class RequestConverter {
    @TypeConverter
    fun storedJsonToRequestList(data: String?): List<Request?>? {
        if (data == null) {
            return emptyList<Request>()
        }
        return Json.decodeFromString<List<Request>>(data)
    }

    @TypeConverter
    fun myObjectsToStoredString(requests: List<Request>): String {
        return Json.encodeToString(requests)
    }
}