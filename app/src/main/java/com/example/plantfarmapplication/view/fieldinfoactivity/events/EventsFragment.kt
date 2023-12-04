package com.example.plantfarmapplication.view.fieldinfoactivity.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter
import com.example.plantfarmapplication.view.fieldinfoactivity.plants.PlantsAdapter

class EventsFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.vp_events_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById<RecyclerView?>(R.id.recyclerViewEvents).apply {
            adapter = this@EventsFragment.adapter
        }
        recyclerView.layoutManager = LinearLayoutManager(context)
    }



    private val presenter = PlantsEventsFragmentPresenter()
    private val adapter = EventsAdapter(presenter)
    private lateinit var recyclerView: RecyclerView
}