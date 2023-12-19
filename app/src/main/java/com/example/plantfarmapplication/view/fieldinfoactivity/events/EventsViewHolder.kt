package com.example.plantfarmapplication.view.fieldinfoactivity.events

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter

class EventsViewHolder (private val presenter: PlantsEventsFragmentPresenter, view: View) : RecyclerView.ViewHolder(view){


    fun onBind(event: Event) {
        eventName = itemView.findViewById(R.id.eventName)
        eventDate = itemView.findViewById(R.id.eventDate)
        setEvents(event)
    }

    private fun setEvents(event: Event){
        eventName.text = event.eventName
        eventDate.text = event.eventDate.toString()
    }


    private lateinit var eventName: TextView
    private lateinit var eventDate: TextView
}