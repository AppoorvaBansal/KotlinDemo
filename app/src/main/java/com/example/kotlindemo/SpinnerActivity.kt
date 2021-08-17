package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_spinner.*
import java.util.ArrayList
import java.util.HashMap

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
       // val spinlist = findViewById<Spinner>(R.id.spinlist)
        val btnsave = findViewById<Button>(R.id.btnsave)
        val eduid = findViewById<EditText>(R.id.eduid)
        val edcity = findViewById<EditText>(R.id.edCITY)
        val edname = findViewById<EditText>(R.id.edname)
       val uiddata = ArrayList<String>()
        val spinlist =this.spinlist
        var hashData=HashMap<String,StudentSpinner>()

        uiddata.add("Select UID")
        var ad =ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,uiddata)
        spinlist.adapter =ad

        btnsave!!.setOnClickListener {
            var name:String=edname.text.toString()
            var city=edcity.text.toString()
            var uid=eduid.text.toString()

            var s=StudentSpinner(name,city)

            uiddata.add(uid)
            hashData.put(uid,s)

        }




    }
}
