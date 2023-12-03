package com.example.plantfarmapplication.view.fieldsactivity

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.presenter.FieldsPresenter

class FieldsViewHolder(private val presenter: FieldsPresenter, view: View) : RecyclerView.ViewHolder(view),
    View.OnClickListener {

    fun onBind(field: Field) {
        fieldName = itemView.findViewById(R.id.fieldName)
        plantsCount = itemView.findViewById(R.id.plantsCountTextView)
        itemView.setOnClickListener(this)
        setFields(field)
    }

    override fun onClick(view: View?) {
        if(view == itemView){
            presenter.onItemClick(adapterPosition)
        }
    }

    private fun setFields(field: Field){
        fieldName.text = field.fieldName
        plantsCount.text = "Количество культур:" + field.plantsCount.toString()
    }

    fun onCleanUp() {
        itemView.setOnClickListener(null)
    }

    private lateinit var fieldName: TextView
    private lateinit var plantsCount: TextView

}