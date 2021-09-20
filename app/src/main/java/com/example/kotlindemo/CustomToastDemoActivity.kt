package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
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

        //val mytoast: View =layoutInflater.inflate(R.layout.toastlayout,ll)
        val tstlay=layoutInflater.inflate(R.layout.toastlayout,ll)  // a kind of view object


        fm=supportFragmentManager   // return Frag Mang class obbject
        ft=fm!!.beginTransaction()
        ft!!.add(R.id.frm,F1Fragment())
        ft!!.commit()


        btntoast.setOnClickListener {

           // val mytoast=Toast(applicationContext) // object of toast class
           // mytoast.duration=Toast.LENGTH_LONG
           // mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,0)
           // mytoast.view=tstlay
           // mytoast.show()

           fm=supportFragmentManager
           ft=fm!!.beginTransaction()
            ft!!.replace(R.id.frm,F1AFragment())
            ft!!.commit()

}


    }
}
