package com.example.kotlindemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import java.lang.Exception

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        Toast.makeText(context, "RUNNNIING", Toast.LENGTH_SHORT).show()



        val smsIntent =  Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"))
      val  phoneNo = "7599293058"
       val message = "HEELLLLOOOO"
        smsIntent.setData(Uri.parse("smsto:"))
        // smsIntent.setType("vnd.android-dir/mms-sms")
        smsIntent.putExtra("address"  , phoneNo)
        smsIntent.putExtra(Intent.EXTRA_TEXT  , message)

        try {
            context!!.startActivity(smsIntent);
            Toast.makeText(context, "SMS sent.",Toast.LENGTH_LONG).show();
            //finish();

        } catch (e: Exception) {
           Toast.makeText(context,"SMS faild, please try again later.   "+e.toString(), Toast.LENGTH_SHORT).show();
        }

        // val notificationUtils = NotificationUtils(context)
        //val notification = notificationUtils.getNotificationBuilder().build()
        //notificationUtils.getManager().notify(150, notification)
    }

}
