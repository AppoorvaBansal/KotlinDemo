package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MenudemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menudemo)


        val lstmenu= findViewById<ListView>(R.id.menulistview)
        val arrlst=ArrayList<String>()


    }
}
