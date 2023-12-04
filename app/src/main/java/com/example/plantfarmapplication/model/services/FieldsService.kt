package com.example.plantfarmapplication.model.services

import com.example.plantfarmapplication.model.abstractions.IFieldService
import com.example.plantfarmapplication.model.objects.Field

class FieldsService() : IFieldService {
   override val fields: List<Field>
   get() = listOf(
       Field(1, "6. Маточник", 47),
       Field(2, "21. Посевочник", 50),
       Field(3, "56. Поле", 200),
       Field(4, "5. Теплица", 100),
       Field(5, "6. Маточник", 47),
       Field(6, "21. Посевочник", 50),
       Field(7, "56. Поле", 200),
       Field(8, "5. Теплица", 100),
    )

    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private var _currentClickedDate = 0
}