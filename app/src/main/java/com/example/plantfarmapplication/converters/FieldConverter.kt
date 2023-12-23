package com.example.plantfarmapplication.converters

import androidx.room.TypeConverter
import com.example.plantfarmapplication.model.objects.Field
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class FieldConverter {
    @TypeConverter
    fun storedJsonToFieldList(data: String?): List<Field?>? {
        if (data == null) {
            return emptyList<Field>()
        }
        return Json.decodeFromString<List<Field>>(data)
    }

    @TypeConverter
    fun myObjectsToStoredString(fields: List<Field>): String {
        return Json.encodeToString(fields)
    }
}