package com.example.plantfarmapplication.view.plantsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.view.fieldsactivity.FieldsActivity
import com.example.plantfarmapplication.view.requestsactivity.RequestsActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

// страница базы данных растений

class PlantsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plants)

        navBar = findViewById(R.id.navBarInPlants)
        navBar.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.home->startFieldsActivity()
                R.id.requests->startRequestsActivity()
            }
            true
        }
    }

    private fun startRequestsActivity(){
        val intent = Intent(this, RequestsActivity::class.java)
        startActivity(intent)
    }

    private fun startFieldsActivity(){
        val intent = Intent(this, FieldsActivity::class.java)
        startActivity(intent)
    }

    private lateinit var navBar: BottomNavigationView
}