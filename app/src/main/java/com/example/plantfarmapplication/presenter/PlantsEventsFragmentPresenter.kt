package com.example.plantfarmapplication.presenter

import com.example.plantfarmapplication.di.App
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.presenter.abstractions.IPresenter
import com.example.plantfarmapplication.view.fieldinfoactivity.ViewPagerFragment

class PlantsEventsFragmentPresenter : IPresenter<ViewPagerFragment> {

    override fun onViewCreated(view: ViewPagerFragment ) {
        this.view
    }

    override fun onDestroy() {
        view = null
    }

    fun getTabLayoutPosition() : Int = index

    fun setTabLayoutPosition(i: Int){
        index = i
    }

    private var view: ViewPagerFragment? = null

    var plants: List<Plant> =  App.plantsService.plants
    var events: List<Event> =  App.eventsService.events
    var index = 0

}