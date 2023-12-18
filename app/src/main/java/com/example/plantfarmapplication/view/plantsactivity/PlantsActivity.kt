package com.example.plantfarmapplication.view.plantsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.model.objects.PlantsInLib
import com.example.plantfarmapplication.presenter.FieldsPresenter
import com.example.plantfarmapplication.presenter.PlantsPresenter
import com.example.plantfarmapplication.view.fieldsactivity.FieldsActivity
import com.example.plantfarmapplication.view.fieldsactivity.FieldsAdapter
import com.example.plantfarmapplication.view.requestsactivity.RequestsActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.*
import kotlin.collections.ArrayList

// страница базы данных растений

class PlantsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plants)

        recyclerView = findViewById<RecyclerView?>(R.id.plantsRecyclerView).apply {
            adapter = this@PlantsActivity.adapter
        }
        recyclerView.layoutManager = LinearLayoutManager(this@PlantsActivity)

        navBar = findViewById(R.id.navBarInPlants)
        navBar.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.home->startFieldsActivity()
                R.id.requests->startRequestsActivity()
            }
            true
        }


        searchView = findViewById(R.id.searchPlants)
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }
        })
    }

    private fun filterList(query: String?) {
        if (query != null) {
            val filteredList = ArrayList<PlantsInLib>()
            for (plant in presenter.plants) {
                if (plant.plantName.lowercase(Locale.ROOT).contains(query)) {
                    filteredList.add(plant)
                }
            }
            if (filteredList.isEmpty()) {
                Toast.makeText(this, "Нет поля с таким названием", Toast.LENGTH_SHORT).show()
            } else {
                adapter.setFilteredList(filteredList)
            }
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
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private val presenter = PlantsPresenter()
    private val adapter = PlantsInfoAdapter(presenter)
}