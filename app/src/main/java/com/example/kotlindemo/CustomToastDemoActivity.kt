package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class CustomToastDemoActivity : AppCompatActivity() {
    var fm: FragmentManager?=null
    var ft: FragmentTransaction?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast_demo)

        val ll=findViewById<LinearLayout>(R.id.ll)
        val btntoast=findViewById<Button>(R.id.btnToast)
        val tstlay=layoutInflater.inflate(R.layout.toastlayout,ll)
        fm=supportFragmentManager
        ft=fm!!.beginTransaction()
        ft!!.add(R.id.frm,F1Fragment())
        ft!!.commit()
        btntoast.setOnClickListener {

            val t=Toast(applicationContext)
            t.duration=Toast.LENGTH_LONG
            t.setGravity(Gravity.CENTER_VERTICAL,0,0)
            t.view=tstlay
            t.show()

            fm=supportFragmentManager
            ft=fm!!.beginTransaction()
            ft!!.replace(R.id.frm,F2Fragment())

            ft!!.commit()



}


    }
}
