package com.example.kotlindemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton

class ButtonDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_demo)

        val swtbtn=findViewById<Switch>(R.id.swtbtn)
        val imgbtn1=findViewById<ImageButton>(R.id.imgbtn1)
        val togbtn1=findViewById<ToggleButton>(R.id.togbtn)
        togbtn1.isChecked=true
        togbtn1.textOn="BUTTON IS ON"
        togbtn1.textOff="BUTTON IS OFF"


        swtbtn.setOnCheckedChangeListener { buttonView, isChecked ->

            val state=if(isChecked)"Swtich is ONN" else "Switch is OFF"

            if(isChecked)
                swtbtn.setThumbResource(R.drawable.ic_mic_on)
            else
                swtbtn.setThumbResource(R.drawable.ic_mic_off)



            Toast.makeText(this,state,Toast.LENGTH_LONG).show()


        }

        imgbtn1.setOnClickListener {
            val i= Intent(Intent.ACTION_SEND)
            i.data= Uri.parse("mailto:")
            i.type="text/plain"
            i.putExtra(Intent.EXTRA_EMAIL,"abc@gmail.com")
            i.putExtra(Intent.EXTRA_CC,"xyz@gmail.com")// send mail
            startActivity(Intent.createChooser(i,"SELECT"))
        }

        togbtn1.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked)
            {
                Toast.makeText(this,"TOOGLE BUTTON IS ON",Toast.LENGTH_LONG).show()

                //

            }
            else
                Toast.makeText(this,"TOOGLE BUTTON IS OFF",Toast.LENGTH_LONG).show()
        }

    }
}
