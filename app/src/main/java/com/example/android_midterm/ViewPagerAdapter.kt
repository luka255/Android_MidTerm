package com.example.android_midterm

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3 // Number of tabs

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ReviewFragment()
            1 -> ApprovedFragment()
            2 -> RejectedFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}