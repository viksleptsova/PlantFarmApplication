package com.example.plantfarmapplication.presenter

import com.example.plantfarmapplication.di.App
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.presenter.abstractions.IFieldPresenter
import com.example.plantfarmapplication.view.abstractions.IFieldsActivityView

class FieldsPresenter: IFieldPresenter<IFieldsActivityView> {


    fun onItemClick(position: Int){
        currentClickedPosition = position
        App.fieldsService.currentClickedDate = position

        //start next activity
    }


    override fun onViewCreated(view: IFieldsActivityView) {
        this.view = view
    }


    private var view: IFieldsActivityView? = null
    var fields: List<Field> =  App.fieldsService.fields
    var fieldsCount: Int = fields.size

    private var currentClickedPosition: Int = -1
}