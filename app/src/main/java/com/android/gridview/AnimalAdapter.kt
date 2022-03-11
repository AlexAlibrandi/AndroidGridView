package com.android.gridview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.LayoutInflater.from
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AnimalAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>
) : BaseAdapter() {

    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = from(parent!!.context)
            .inflate(R.layout.customlayout,parent,false)

        var animalName : TextView = view.findViewById(R.id.textView)
        var animalImage : ImageView = view.findViewById(R.id.imageView)

        animalName.text = nameList[position]
        animalImage.setImageResource(imageList[position])

        return  view
    }
}