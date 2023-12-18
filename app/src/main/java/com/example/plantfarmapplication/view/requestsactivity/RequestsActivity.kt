package com.example.plantfarmapplication.view.requestsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.view.fieldsactivity.FieldsActivity
import com.example.plantfarmapplication.view.plantsactivity.PlantsActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

//страница заявок
class RequestsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requests)

        tabLayout = findViewById(R.id.tab_layout)

        adapter  = RequestsAdapter(this)
        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter  = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = titleList[position]
        }.attach()


        navBar = findViewById(R.id.navBarInRequests)
        navBar.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.plants->startPlantsActivity()
                R.id.home->startFieldsActivity()
            }
            true
        }

    }

    private fun startFieldsActivity(){
        val intent = Intent(this, FieldsActivity::class.java)
        startActivity(intent)
    }

    private fun startPlantsActivity(){
        val intent = Intent(this, PlantsActivity::class.java)
        startActivity(intent)
    }



    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var navBar: BottomNavigationView
    private lateinit var adapter: RequestsAdapter

    private val titleList = listOf("Ожидают","Выполнены")
}