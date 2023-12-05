package com.example.plantfarmapplication.model.services

import com.example.plantfarmapplication.model.abstractions.IFieldService
import com.example.plantfarmapplication.model.objects.Field

class FieldsService() : IFieldService {
   override val fields: List<Field>
   get() = listOf(
           Field(0, "6. Сектор размножения/ отделение черенкования", 85),
       Field(1, "7. Сектор размножения/ посевное отделение", 50),
       Field(2, "8. Теплица", 40),
       Field(4, "9. Маточник хвойных", 20),
       Field(5, "10. Маточник низко- и среднерослых кустарников", 30),
       Field(6, "11. Демонстрационно маточный участок", 0),
       Field(7, "12. Маточник травянистых многолетников", 20),
    )

    override var currentClickedDate: Int
        get() = _currentClickedDate
        set(value) {
            _currentClickedDate = value
        }

    private var _currentClickedDate = 0
}