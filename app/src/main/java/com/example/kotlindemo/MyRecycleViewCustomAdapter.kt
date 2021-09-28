package com.example.kotlindemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyRecycleViewCustomAdapter(data: ArrayList<DataInRecycleView>) : RecyclerView.Adapter<MyRecycleViewCustomAdapter.ViewHolder>() {
        val data =data
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyRecycleViewCustomAdapter.ViewHolder {

        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.cardview1,parent,false)
        return ViewHolder(view)

    }

    class ViewHolder(val view:View):RecyclerView.ViewHolder(view) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val Items = data[position]
        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(Items.image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = Items.text


    }


}
