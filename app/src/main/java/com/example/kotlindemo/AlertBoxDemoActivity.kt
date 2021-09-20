package com.example.kotlindemo

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertBoxDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_box_demo)
        val btnsendalert=findViewById<Button>(R.id.btnsendlert)

        btnsendalert.setOnClickListener {
            val adb=AlertDialog.Builder(this)

            adb.setTitle("Exit from the Application")
            adb.setMessage("Do you want to exit from the application")

            //action
            // positive // yes

            adb.setPositiveButton("YES"){
                dialog: DialogInterface?, which: Int ->

                //finish()
                //Intent
                Toast.makeText(this,"OKKKK",Toast.LENGTH_LONG).show()
            }

            adb.setNegativeButton("NO"){
                dialog: DialogInterface?, which: Int ->

                Toast.makeText(this,"NOOOOOOO",Toast.LENGTH_LONG).show()

            }

            adb.setNeutralButton("Cancel"){
                dialog: DialogInterface?, which: Int ->
                Toast.makeText(this,"CANCEL",Toast.LENGTH_LONG).show()


            }

           val alt:AlertDialog =adb.create()
            alt.show()





        }

    }
}
