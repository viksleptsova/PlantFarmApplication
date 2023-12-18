package com.example.plantfarmapplication.view.plantsactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.model.objects.PlantsInLib
import com.example.plantfarmapplication.presenter.PlantsPresenter
import com.example.plantfarmapplication.view.fieldsactivity.FieldsViewHolder

class PlantsInfoAdapter(private val presenter: PlantsPresenter) : RecyclerView.Adapter<PlantsInfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantsInfoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_plants, parent, false)
        return PlantsInfoViewHolder(presenter, view)
    }

    override fun onBindViewHolder(holder: PlantsInfoViewHolder, position: Int) {
        holder.onBind(plantsList[position])
    }

    override fun getItemCount(): Int {
       return plantsList.size
    }

    fun setFilteredList(plantsInLib: List<PlantsInLib>){
        plantsList = plantsInLib
        notifyDataSetChanged()
    }


    private var plantsList: List<PlantsInLib> = presenter.plants
}