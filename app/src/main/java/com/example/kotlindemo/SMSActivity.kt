package com.example.kotlindemo

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.lang.Exception

class SMSActivity : AppCompatActivity() {
    var phoneNo:String?=null
    var message:String?=null
    val rqcode=0
    var sendBtn:Button?=null
    var appBtn:Button?=null
    var txtMessage:EditText?=null
    var txtphoneNo:EditText?=null
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms)
            appBtn =  findViewById(R.id.btnsendsms);
        sendBtn =  findViewById(R.id.btnsend);
        txtphoneNo = findViewById(R.id.edcontact);
        txtMessage = findViewById(R.id.edmessage);

            appBtn!!.setOnClickListener {

            }


            sendBtn!!.setOnClickListener {
                Toast.makeText(getApplicationContext(), "IN BUTTON",Toast.LENGTH_LONG).show();

                phoneNo = txtphoneNo!!.text.toString();
                message = txtMessage!!.text.toString();

                if (ContextCompat.checkSelfPermission(this,Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(getApplicationContext(), "outter if",Toast.LENGTH_LONG).show();

                    if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.SEND_SMS))
                    {
                        Toast.makeText(getApplicationContext(), "if",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), " elseee",Toast.LENGTH_LONG).show();

                        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.SEND_SMS),rqcode)


                    }
                }
                try {
                    val smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent.",
                        Toast.LENGTH_LONG).show();
                }
                catch (e:Exception){
                    Toast.makeText(
                        getApplicationContext(),
                        "SMS faild, please try again.", Toast.LENGTH_LONG
                    ).show();
                }
            }


    }

   /* override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            rqcode-> {
                if (grantResults.size > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    val smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent.",
                        Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                        "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }
    } */
}
