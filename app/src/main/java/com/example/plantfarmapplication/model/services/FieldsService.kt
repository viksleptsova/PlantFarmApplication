package com.example.plantfarmapplication.model.services

import com.example.plantfarmapplication.model.abstractions.IFieldService
import com.example.plantfarmapplication.model.objects.Field

class FieldsService() : IFieldService {
   override val fields: List<Field> = listOf(
       Field("6. Маточник", 47),
       Field("21. Посевочник", 50),
       Field("56. Поле", 200),
       Field("5. Теплица", 100),
    )

    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private var _currentClickedDate = 0
}