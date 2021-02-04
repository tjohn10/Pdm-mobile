package com.example.pdm.payment

import com.example.pdm.R
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.pdm.payment.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener


class PaymentActivity : AppCompatActivity(), OnTabSelectedListener {
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null
    var viewPagerAdapter: ViewPagerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

//method for initialisation
        init()
    }

    private fun init() {
        tabLayout = findViewById<View>(R.id.tabLayout) as TabLayout

//Adding the tabs using addTab() method
        tabLayout!!.addTab(tabLayout!!.newTab().setText("PayPal"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Card Payment"))
        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL

//Initializing viewPager
        viewPager = findViewById<View>(R.id.pager) as ViewPager

//Initializing view pager adapter
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, tabLayout!!.tabCount)

//Adding adapter to pager
        viewPager!!.adapter = viewPagerAdapter

//Adding onTabSelectedListener to swipe views
        viewPager!!.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
        tabLayout!!.setOnTabSelectedListener(this)
    }

    override fun onTabSelected(tab: TabLayout.Tab) {
        viewPager!!.currentItem = tab.position
    }

    override fun onTabUnselected(tab: TabLayout.Tab) {}
    override fun onTabReselected(tab: TabLayout.Tab) {}
}
