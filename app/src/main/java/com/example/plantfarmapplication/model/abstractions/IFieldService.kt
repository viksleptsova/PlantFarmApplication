package com.example.plantfarmapplication.model.abstractions

import com.example.plantfarmapplication.model.objects.Field


interface IFieldService {
    val fields: List<Field>
    var currentClickedDate: Int
}