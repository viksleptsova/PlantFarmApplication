package com.example.plantfarmapplication.view.fieldinfoactivity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter
import com.example.plantfarmapplication.view.fieldinfoactivity.events.EventsFragment
import com.example.plantfarmapplication.view.fieldinfoactivity.plants.PlantsFragment

const val ARG_OBJECT = "object"
class PlantsEventsAdapter(fragment: FragmentActivity, val presenter: PlantsEventsFragmentPresenter) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> PlantsFragment()
            else -> {EventsFragment()}
        }
    }


}