package com.example.pdm

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlin.collections.ArrayList


class JobAdapter(context: Context, private val jobModelArrayList: ArrayList<JobModel>) :
    ArrayAdapter<JobModel?>(context, 0, jobModelArrayList as List<JobModel?>) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listItemView = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false)
        }
        val jobModel: JobModel? = getItem(position)
        val jobTV = listItemView!!.findViewById<TextView>(R.id.idTVCourse)
        val jobIV = listItemView.findViewById<ImageView>(R.id.idIVcourse)
        jobTV.text = jobModel!!.job_name
        jobIV.setImageResource(jobModel.imgid)
        return listItemView
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

}
