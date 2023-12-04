package com.example.plantfarmapplication.view.fieldinfoactivity

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter

class PlantsEventsViewHolder(private val presenter: PlantsEventsFragmentPresenter, view: View) : RecyclerView.ViewHolder(view) {


    fun onBind(plant: Plant) {
        nameField = itemView.findViewById(R.id.plantOrEventName)
        additionalTextView = itemView.findViewById(R.id.dateOrCount)
        setPlants(plant)
    }

    fun onBind(event: Event) {
        nameField = itemView.findViewById(R.id.plantOrEventName)
        additionalTextView = itemView.findViewById(R.id.dateOrCount)
        setEvent(event)
    }

    private fun setPlants(plant: Plant){
        nameField.text = plant.plantName
        additionalTextView.text = "Количество:" + plant.plantCount.toString()
    }

    private fun setEvent(event: Event){
        nameField.text = event.eventName
        additionalTextView.text = event.eventDate
    }


    private lateinit var nameField: TextView
    private lateinit var additionalTextView: TextView
}