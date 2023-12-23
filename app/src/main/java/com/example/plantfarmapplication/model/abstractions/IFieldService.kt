package com.example.plantfarmapplication.model.abstractions

import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.model.objects.Field


interface IFieldService {
    val fields: LiveData<List<Field>>
    var currentClickedDate: Int
}