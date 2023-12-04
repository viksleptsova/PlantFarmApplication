package com.example.plantfarmapplication.view.fieldinfoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FieldInformationActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_field_information)

        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener(this)

        adapter = PlantsEventsAdapter(this, presenter)

        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = adapter

        tabLayout = findViewById(R.id.tab_layout)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "${(position + 1)}"
        }.attach()

        presenter.setTabLayoutPosition(tabLayout.selectedTabPosition)

    }

    override fun onClick(view: View?) {
        if(view == backButton){
            onBackPressedDispatcher.onBackPressed()
        }
    }


    private lateinit var backButton: Button
    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: PlantsEventsAdapter
    private lateinit var tabLayout: TabLayout
    private val presenter = PlantsEventsFragmentPresenter()

}