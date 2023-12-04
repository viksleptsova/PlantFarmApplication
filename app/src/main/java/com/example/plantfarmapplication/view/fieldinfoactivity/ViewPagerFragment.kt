package com.example.plantfarmapplication.view.fieldinfoactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plantfarmapplication.R
import com.example.plantfarmapplication.presenter.FieldsPresenter
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.vp_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById<RecyclerView?>(R.id.recyclerView).apply {
            adapter = this@ViewPagerFragment.adapter
        }
        recyclerView.layoutManager = LinearLayoutManager(context)

    }

    private val presenter = PlantsEventsFragmentPresenter()
    private val adapter = PlantsEventsRecyclerViewAdapter(presenter)
    private lateinit var recyclerView: RecyclerView
}