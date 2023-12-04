package com.example.plantfarmapplication.view.fieldinfoactivity.plants

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter

class PlantsViewHolder(private val presenter: PlantsEventsFragmentPresenter, view: View) : RecyclerView.ViewHolder(view) {


    fun onBind(plant: Plant) {
        plantName = itemView.findViewById(R.id.plantName)
        plantCount = itemView.findViewById(R.id.plantCount)
        setPlants(plant)
    }

    private fun setPlants(plant: Plant){
        plantName.text = plant.plantName
        plantCount.text = "Количество:" + plant.plantCount.toString()
    }


    private lateinit var plantName: TextView
    private lateinit var plantCount: TextView
}