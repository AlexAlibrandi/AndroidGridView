package com.android.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    var names = ArrayList<String>()
    var images = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridview)

        fillArray()

        val adapter = AnimalAdapter(this,names,images)

        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(applicationContext,"you selected ${names[position]}", Toast.LENGTH_SHORT).show()
        }

    }

    fun fillArray(){

        names.add("Bird")
        names.add("Fox")
        names.add("Cat")
        names.add("Monkey")
        names.add("Dog")
        names.add("Lion")
        names.add("Sheep")
        names.add("Fish")
        names.add("Frog")

        images.add(R.drawable.bird)
        images.add(R.drawable.fox)
        images.add(R.drawable.cat)
        images.add(R.drawable.monkey)
        images.add(R.drawable.dog)
        images.add(R.drawable.lion)
        images.add(R.drawable.sheep)
        images.add(R.drawable.fish)
        images.add(R.drawable.frog)
    }
}