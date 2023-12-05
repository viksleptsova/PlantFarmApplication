package com.example.plantfarmapplication.view.plantsactivity

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.PlantsInLib
import com.example.plantfarmapplication.presenter.PlantsPresenter

class PlantsInfoViewHolder(private val presenter: PlantsPresenter, view: View) :
    RecyclerView.ViewHolder(view) {

    fun onBind(plantsInLib: PlantsInLib) {
        plantsImageView = itemView.findViewById(R.id.plantImage)
        plantName = itemView.findViewById(R.id.plantName)
        latinPlantName = itemView.findViewById(R.id.latinPlantName)
        setPlants(plantsInLib)
    }

    private fun setPlants(plantsInLib: PlantsInLib) {
        plantName.text = plantsInLib.plantName
        latinPlantName.text = plantsInLib.plantLatinName
        plantsImageView.setImageResource(imageIdList[plantsInLib.pictureId])
    }


    private lateinit var plantsImageView: ImageView
    private lateinit var plantName: TextView
    private lateinit var latinPlantName: TextView
    private var imageIdList  = listOf(R.drawable.plant1,
        R.drawable.plant2,
        R.drawable.plant3,
        R.drawable.plant4,
        R.drawable.plant5,
        R.drawable.plant6,
        R.drawable.plant7,
        R.drawable.plant8,
    )

}