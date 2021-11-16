@file:Suppress("DEPRECATION")

package com.example.kotlindemo

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.PhoneStateListener
import android.telephony.TelephonyManager
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_telephony.*
import java.util.concurrent.Executor

class TelephonyActivity : AppCompatActivity() {
    var textOut: TextView?=null
    var telephonyManager: TelephonyManager?=null
    var listener: PhoneStateListener?=null
    @SuppressLint("MissingPermission", "HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephony)

// Get the UI
        textOut = findViewById(R.id.textOut);

        // Get the telephony manager
        telephonyManager = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager?;

     //val imeinNumber=telephonyManager!!.deviceId
     //val ssnum=telephonyManager!!.simSerialNumber
        val networkCOuntry=telephonyManager!!.networkCountryIso
        val simCountryISO=telephonyManager!!.simCountryIso
        val voiceMailNumber=telephonyManager!!.voiceMailNumber
        val softwareversion=telephonyManager!!.deviceSoftwareVersion


      //  listener=PhoneStateListener()

        val phoneType=telephonyManager!!.phoneType
        var str:String?=null
        when(phoneType)
        {

            TelephonyManager.PHONE_TYPE_CDMA-> str="CDMA"
            TelephonyManager.PHONE_TYPE_GSM->str="GSM"
            TelephonyManager.PHONE_TYPE_NONE->str="NONE"
        }

        val isRoaming:Boolean=telephonyManager!!.isNetworkRoaming

        textOut!!.setText("PHONE DETAILS: \n" +"\n"+"\n"+networkCOuntry+"\n"+simCountryISO+"\n"+voiceMailNumber+"\n"+softwareversion+"\n"+str+"\n"+isRoaming)

      // listener =MyPhoneStateListner()


//telephonyManager!!.listen(listener,PhoneStateListener.LISTEN_CALL_STATE)

    }
}
