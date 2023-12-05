package com.example.plantfarmapplication.view.fieldinfoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.di.App
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FieldInformationActivity () : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_field_information)

        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener(this)

        addButton = findViewById(R.id.addButton)
        addButton.setOnClickListener(this)

        fieldName = findViewById(R.id.fieldName)
        plantsCount = findViewById(R.id.plantsCount)

        adapter = PlantsEventsAdapter(this, presenter)

        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = adapter

        tabLayout = findViewById(R.id.tab_layout)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = titleList[position]
        }.attach()


        setText(App.fieldsService.fields[App.fieldsService.currentClickedDate])
    }

    private fun setText(field: Field){
        fieldName.text = field.fieldName
        plantsCount.text = "Количество культур: " + field.plantsCount.toString()
    }

    override fun onClick(view: View?) {
        if(view == backButton){
            onBackPressedDispatcher.onBackPressed()
        }
        if (view == addButton){

        }
    }

    private val titleList = listOf("Культуры","Мероприятия")
    private lateinit var backButton: Button
    private lateinit var addButton: Button

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: PlantsEventsAdapter
    private lateinit var tabLayout: TabLayout
    private lateinit var fieldName: TextView
    private lateinit var plantsCount: TextView

    private val presenter = PlantsEventsFragmentPresenter()

}