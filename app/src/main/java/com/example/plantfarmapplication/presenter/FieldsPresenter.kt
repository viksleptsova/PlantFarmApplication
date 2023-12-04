package com.example.plantfarmapplication.presenter

import com.example.plantfarmapplication.di.App
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.presenter.abstractions.IPresenter
import com.example.plantfarmapplication.view.abstractions.IFieldsActivityView

class FieldsPresenter: IPresenter<IFieldsActivityView> {


    fun onItemClick(position: Int){
        currentClickedPosition = position
        App.fieldsService.currentClickedDate = position
        view?.startFieldInformationActivity(fields[position])
    }


    override fun onViewCreated(view: IFieldsActivityView) {
        this.view = view
    }

    override fun onDestroy() {
        view = null
    }

    private var view: IFieldsActivityView? = null
    var fields: List<Field> =  App.fieldsService.fields
    var fieldsCount: Int = fields.size

    private var currentClickedPosition: Int = -1

}