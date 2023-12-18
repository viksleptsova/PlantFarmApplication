package com.example.plantfarmapplication.view.requestsactivity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.plantfarmapplication.view.EmptyFragment


class RequestsAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            1 -> EmptyFragment()
            else -> {EmptyFragment()}
        }
    }
}