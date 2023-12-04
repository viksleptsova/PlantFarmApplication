package com.example.plantfarmapplication.view.fieldinfoactivity.plants

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter

class PlantsFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.vp_plants_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById<RecyclerView?>(R.id.recyclerViewPlants).apply {
            adapter = this@PlantsFragment.adapter
        }
        recyclerView.layoutManager = LinearLayoutManager(context)
    }


    private val presenter = PlantsEventsFragmentPresenter()
    private val adapter = PlantsAdapter(presenter)
    private lateinit var recyclerView: RecyclerView
}