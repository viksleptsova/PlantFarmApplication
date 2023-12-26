package com.example.plantfarmapplication.presenter

import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.di.App
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.presenter.abstractions.IPresenter
import com.example.plantfarmapplication.view.abstractions.IFieldsActivityView

class FieldsPresenter: IPresenter<IFieldsActivityView> {


    fun onItemClick(position: Int){
        currentClickedPosition = position
        App.fieldsService.currentClickedDate = position
        view?.startFieldInformationActivity()
    }


    override fun onViewCreated(view: IFieldsActivityView) {
        this.view = view
    }

    override fun onDestroy() {
        view = null
    }

    private var view: IFieldsActivityView? = null
    var fields: LiveData<List<Field>> =  App.fieldsService.fields
    var fieldsCount: Int = fields.value!!.size

    private var currentClickedPosition: Int = -1

}