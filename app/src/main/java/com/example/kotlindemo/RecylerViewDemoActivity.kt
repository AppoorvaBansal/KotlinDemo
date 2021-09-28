package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecylerViewDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyler_view_demo)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<DataInRecycleView>()

// This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..50) {
            data.add(DataInRecycleView(R.drawable.ic_email, "Item " + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = MyRecycleViewCustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter


    }
}
