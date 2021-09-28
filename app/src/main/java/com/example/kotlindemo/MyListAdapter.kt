package com.example.kotlindemo

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity

class MyListAdapter(applicationContext: Context?, arrimg: ArrayList<Int>, arrname: ArrayList<String>, arrcontact: ArrayList<String>, arrmail: ArrayList<String>) :
    BaseAdapter() {

    private val context=applicationContext
    private val arrimg=arrimg
    private val arrname=arrname
    private val arrcontact=arrcontact
    private val arrmail=arrmail
    private val inflater=LayoutInflater.from(context)

    override fun getCount(): Int {

        return arrname.size

    }

    override fun getItem(position: Int): Any {
        return arrname[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val lay=inflater.inflate(R.layout.mylistviewcontact,parent,false)

        val img1=lay.findViewById<ImageView>(R.id.imgcon)
        val txtname=lay.findViewById<TextView>(R.id.txtname)
        val txtcon=lay.findViewById<TextView>(R.id.txtcontact)
        val txtmail=lay.findViewById<TextView>(R.id.txtemail)
        val imgcall=lay.findViewById<ImageButton>(R.id.iconcall)


        imgcall.setOnClickListener {

            val uri=Uri.parse("tel:"+ txtcon.text.toString())
            val i=Intent(Intent.ACTION_DIAL,uri)
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            //startActivity(context!!,i,)
            context!!.startActivity(i)
        }




        img1.setImageResource(arrimg.get(position))
        txtname.setText(arrname[position])
        txtcon.setText(arrcontact[position])
        txtmail.setText(arrmail[position])





        return lay




    }

}
