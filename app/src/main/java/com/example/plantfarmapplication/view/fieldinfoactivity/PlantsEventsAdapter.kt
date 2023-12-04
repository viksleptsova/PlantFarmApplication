package com.example.plantfarmapplication.view.fieldinfoactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.plantfarmapplication.presenter.PlantsEventsFragmentPresenter

const val ARG_OBJECT = "object"
class PlantsEventsAdapter(fragment: FragmentActivity, val presenter: PlantsEventsFragmentPresenter) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT, position)
        }
        return fragment
    }
}