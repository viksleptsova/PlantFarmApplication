package com.example.plantfarmapplication.presenter

import com.example.plantfarmapplication.di.App
import com.example.plantfarmapplication.model.objects.Field
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
    var plants: List<PlantsInLib> =  App.plantsInLibService.plantsInLib
    var plantsCount: Int = plants.size

    private var currentClickedPosition: Int = -1



}