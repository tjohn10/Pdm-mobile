package com.example.pdm.payment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


@Suppress("DEPRECATION")
class ViewPagerAdapter ( fm: FragmentManager,  var tabCount: Int) :
    FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                PayPalFragment()
            }
            1 -> {
                CardFragment()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}