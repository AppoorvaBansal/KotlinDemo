package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_factorial.*

class FactorialActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factorial)

       val ednum=findViewById<EditText>(R.id.ednum);
        var btnfact=findViewById<Button>(R.id.btnfact);
        val txtres=findViewById<TextView>(R.id.txtresult)
        var btnsq=findViewById<Button>(R.id.btnsquare);
        btnsq.setOnClickListener {

            val num:Int=(ednum.text.toString()).toInt()

            val sq=num*num
            txtres.text=sq.toString()

        }


    }

    fun fact(view:View)
    {
       val num:Int=(ednum.text.toString()).toInt()
        var facto:Long=1
        for(i in 1..num)
        {
            facto=facto*i.toLong()
        }

        txtresult.text=facto.toString()



    }
}
