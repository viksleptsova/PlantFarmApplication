package com.example.plantfarmapplication.view.fieldinfoactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter
import com.example.plantfarmapplication.view.fieldsactivity.FieldsViewHolder

class PlantsEventsRecyclerViewAdapter(private val presenter: PlantsEventsFragmentPresenter) :
    RecyclerView.Adapter<PlantsEventsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantsEventsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.plants_events_fragment, parent, false)
        return PlantsEventsViewHolder(presenter, view)
    }

    override fun onBindViewHolder(holder: PlantsEventsViewHolder, position: Int) {
        if (presenter.getTabLayoutPosition() == 0) {
            holder.onBind(plantList[position])
        } else if (presenter.getTabLayoutPosition() == 1) {
            holder.onBind(eventList[position])
        }
    }

    override fun getItemCount(): Int {
        return when (presenter.getTabLayoutPosition()) {
            0 -> plantList.size
            else -> {
                eventList.size
            }
        }

    }


    private var plantList: List<Plant> = presenter.plants
    private var eventList: List<Event> = presenter.events

}