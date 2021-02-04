package com.example.pdm.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pdm.*

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
@Suppress("DEPRECATION")
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager,
                           var totalTabs: Int) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HVACFragment()
            }
            1 -> {
                ElectricalFragment()
            }
            2 -> {
                CarpentryFragment()
            }
            3 -> {
                AutoFragment()
            }
            else -> getItem(position)
        }
    }



    override fun getCount(): Int {
        // Show 2 total pages.
        return totalTabs
    }
}