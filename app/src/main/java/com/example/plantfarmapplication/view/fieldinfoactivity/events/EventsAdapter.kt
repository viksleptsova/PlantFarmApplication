package com.example.plantfarmapplication.view.fieldinfoactivity.events

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter
import com.example.plantfarmapplication.view.fieldinfoactivity.plants.PlantsViewHolder

class EventsAdapter(private val presenter: PlantsEventsFragmentPresenter) :
    RecyclerView.Adapter<EventsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.events_fragment, parent, false)
        return EventsViewHolder(presenter, view)
    }

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {
        holder.onBind(presenter.events[position])
    }

    override fun getItemCount(): Int {
        return presenter.events.size
    }
}