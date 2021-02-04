package com.example.pdm.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.example.pdm.*
import com.example.pdm.payment.PaymentActivity

class HomeFragment : Fragment(){
    private lateinit var gridView: GridView

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment
        val rootView: View = inflater.inflate(R.layout.fragment_home, container, false)

        gridView = rootView.findViewById(R.id.grids)

        val jobModelArrayList = ArrayList<JobModel>()
        jobModelArrayList.add(JobModel("Create Job", R.drawable.ic_setup))
        jobModelArrayList.add(JobModel("View Jobs", R.drawable.ic_accounting))
        jobModelArrayList.add(JobModel("Pay", R.drawable.ic_payment_method))
        jobModelArrayList.add(JobModel("Request a worker", R.drawable.ic_profile_user))
        val adapter = context?.let { JobAdapter(it, jobModelArrayList) }
        gridView.adapter = adapter

        gridView.onItemClickListener =
            OnItemClickListener { _, _, position, _ ->
                val gridItem = jobModelArrayList[position]
                when(gridItem.job_name) {
                    "Create Job" -> {
                        val intent = Intent(context, CreateJobActivity::class.java)
                        context?.startActivity(intent)
                    }
                    "View Jobs" -> {
                        val intent = Intent(context, ViewJobActivity::class.java)
                        context?.startActivity(intent)
                    }
                    "Request a worker" -> {
                        val intent = Intent(context, RequestWorkerActivity::class.java)
                        context?.startActivity(intent)
                    }
                    "Pay" -> {
                        val intent = Intent(context, PaymentActivity::class.java)
                        context?.startActivity(intent)
                    }
                }
            }
        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance() : HomeFragment {
            val fragment = HomeFragment()
            val args = Bundle()
            args.putInt("icon", R.drawable.ic_home)
            fragment.arguments = args
            return fragment
        }
    }
}

