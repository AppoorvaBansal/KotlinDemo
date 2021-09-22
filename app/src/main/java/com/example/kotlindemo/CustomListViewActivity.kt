package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CustomListViewActivity : AppCompatActivity() {
var listContact:ListView?=null
var arrname:ArrayList<String>?=null
    var arrcontact:MutableList<String>?=null
    var arrmail:ArrayList<String>?=null
    var arrimg:ArrayList<Int>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)

        listContact=findViewById<ListView>(R.id.listcontact)
        arrname= ArrayList<String>()
        arrcontact= ArrayList<String>()
        arrmail= ArrayList<String>()
        arrimg= ArrayList<Int>()

        arrname!!.add("Ayush")
        arrname!!.add("Ayushi")
        arrname!!.add("Aman")
        arrname!!.add("Arnav")
        arrname!!.add("Ayu")
        arrname!!.add("Anugya")
        arrname!!.add("Anu")
        arrname!!.add("Anusha")
        arrname!!.add("Bhawana")
        arrname!!.add("Divya")
        arrname!!.add("Deepak")

        arrcontact!!.add("5555656545")
        arrcontact!!.add("5555656545")
        arrcontact!!.add("5555656545")
        arrcontact!!.add("5555656545")
        arrcontact!!.add("5555656545")
        arrcontact!!.add("5555656545")
        arrcontact!!.add("5555656545")
        arrcontact!!.add("5555656545")
        arrcontact!!.add("5555656545")
        arrcontact!!.add("5555656545")

        arrmail!!.add("abc@gmail.com")
        arrmail!!.add("abc@gmail.com")
        arrmail!!.add("abc@gmail.com")
        arrmail!!.add("abc@gmail.com")
        arrmail!!.add("abc@gmail.com")
        arrmail!!.add("abc@gmail.com")
        arrmail!!.add("abc@gmail.com")
        arrmail!!.add("abc@gmail.com")
        arrmail!!.add("abc@gmail.com")
        arrmail!!.add("abc@gmail.com")



    }
}
