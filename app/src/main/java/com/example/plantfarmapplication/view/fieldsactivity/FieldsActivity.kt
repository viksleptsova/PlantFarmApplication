package com.example.plantfarmapplication.view.fieldsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.model.objects.Field
import com.example.plantfarmapplication.presenter.FieldsPresenter
import com.example.plantfarmapplication.view.abstractions.IFieldsActivityView
import com.example.plantfarmapplication.view.fieldinfoactivity.FieldInformationActivity
import com.example.plantfarmapplication.view.plantsactivity.PlantsActivity
import com.example.plantfarmapplication.view.requestsactivity.RequestsActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.*
import kotlin.collections.ArrayList

class FieldsActivity : AppCompatActivity(), IFieldsActivityView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fields_activity)
        recyclerView = findViewById<RecyclerView?>(R.id.fieldsRecyclerView).apply {
            adapter = this@FieldsActivity.adapter
        }
        recyclerView.layoutManager = LinearLayoutManager(this@FieldsActivity)

        searchView = findViewById(R.id.searchBar)
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
               filterList(newText)
                return true
            }
        })

        navBar = findViewById(R.id.navBar)
        navBar.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.plants->startPlantsActivity()
                R.id.requests->startRequestsActivity()
            }
            true
        }



        presenter.onViewCreated(this)
    }

   private fun filterList(query: String?) {
       if (query != null) {
           val filteredList = ArrayList<Field>()
           for (field in presenter.fields) {
               if (field.fieldName.lowercase(Locale.ROOT).contains(query)) {
                   filteredList.add(field)
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

    private fun startPlantsActivity(){
        val intent = Intent(this, PlantsActivity::class.java)
        startActivity(intent)
    }

    override fun startFieldInformationActivity(field: Field) {
        val intent = Intent(this, FieldInformationActivity::class.java)
        startActivity(intent)
        }

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private lateinit var navBar: BottomNavigationView
    private val presenter = FieldsPresenter()
    private val adapter = FieldsAdapter(presenter)

}