package com.example.plantfarmapplication.presenter

import androidx.lifecycle.LiveData
import com.example.plantfarmapplication.di.App
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.model.objects.PlantsInLib
import com.example.plantfarmapplication.presenter.abstractions.IPresenter
import com.example.plantfarmapplication.view.abstractions.IFieldsActivityView
import com.example.plantfarmapplication.view.abstractions.IPlantsActivityView

class PlantsPresenter: IPresenter<IPlantsActivityView> {

    override fun onViewCreated(view: IPlantsActivityView) {
       this.view = view
    }

    override fun onDestroy() {
       view = null
    }


    private var view: IPlantsActivityView? = null
    var plants: LiveData<List<Plant>> =  App.plantsInLibService.plantsInLib
    //todo select count (***) from tableName
    //todo Нужно сделать метод, чтобы получать количество row плэнтов из бд, а пока только 20 их будет
    var plantsCount: Int = 20

    private var currentClickedPosition: Int = -1



}