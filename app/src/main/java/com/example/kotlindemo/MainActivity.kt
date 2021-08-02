package com.example.kotlindemo

import android.app.Activity
import android.content.Context
import android.hardware.input.InputManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt1=findViewById<TextView>(R.id.txt1);
        val btnsave=findViewById<Button>(R.id.btnsave);
        val ed1=findViewById<EditText>(R.id.ed1);

        btnsave.setOnClickListener{

            val str=ed1.text
            val count=str.toString().toInt()+5
            hidekey()
            Toast.makeText(this,count.toString(),Toast.LENGTH_LONG).show()

        }


    }

    fun hidekey()
    {
        val view=this.currentFocus
        if(view!=null)
        {
            val mm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            mm.hideSoftInputFromWindow(view.windowToken,0)
        }
    }
}


