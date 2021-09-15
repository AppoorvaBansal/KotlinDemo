package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class CustomToastDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast_demo)

        val ll=findViewById<LinearLayout>(R.id.ll)
        val btntoast=findViewById<Button>(R.id.btnToast)
        val tstlay=layoutInflater.inflate(R.layout.toastlayout,ll)




    }
}
