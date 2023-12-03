package com.example.plantfarmapplication.view.fieldsactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.presenter.FieldsPresenter
import com.example.plantfarmapplication.view.fieldsactivity.FieldsViewHolder

class FieldsAdapter (private val presenter: FieldsPresenter): RecyclerView.Adapter<FieldsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FieldsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fields_fragment, parent, false)
        return FieldsViewHolder(presenter, view)
    }

    override fun onBindViewHolder(holder: FieldsViewHolder, position: Int) {
        holder.onBind(fieldsList[position])
    }

    override fun onViewRecycled(holder: FieldsViewHolder){
        super.onViewRecycled(holder)
        holder.onCleanUp()
    }

    override fun getItemCount(): Int {
        return fieldsList.size
    }

    fun setFilteredList(fields: List<Field>){
        fieldsList = fields
        notifyDataSetChanged()
    }

    private var fieldsList: List<Field> = presenter.fields
}