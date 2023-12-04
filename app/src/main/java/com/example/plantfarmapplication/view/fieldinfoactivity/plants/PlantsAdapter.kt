package com.example.plantfarmapplication.view.fieldinfoactivity.plants

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Event
import com.example.plantfarmapplication.model.objects.Plant
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter

class PlantsAdapter(private val presenter: PlantsEventsFragmentPresenter) :
    RecyclerView.Adapter<PlantsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.plants_fragment, parent, false)
        return PlantsViewHolder(presenter, view)
    }

    override fun onBindViewHolder(holder: PlantsViewHolder, position: Int) {
        holder.onBind(plantList[position])
    }

    override fun getItemCount(): Int {
        return plantList.size
    }


    private var plantList: List<Plant> = presenter.plants


}