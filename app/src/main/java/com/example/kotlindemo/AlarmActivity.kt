package com.example.kotlindemo

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast
import android.widget.ToggleButton
import java.util.*

class AlarmActivity : AppCompatActivity() {

    var timePicker:TimePicker?=null
    var tb:ToggleButton?=null
    var am:AlarmManager?=null
    var pendingIntent:PendingIntent?=null
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)
        timePicker=findViewById(R.id.timePicker)
        tb=findViewById(R.id.toggleButton)

        am= getSystemService(Context.ALARM_SERVICE) as AlarmManager?

        tb!!.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked)
            {
                    Toast.makeText(this, "ALARM ON", Toast.LENGTH_SHORT).show();
                val calendar: Calendar = Calendar.getInstance()
                if (Build.VERSION.SDK_INT >= 23) {
                    calendar.set(
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH),
                        timePicker!!.hour,
                        timePicker!!.minute,
                        0
                    )
               } else {
                    calendar.set(
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH),
                        timePicker!!.currentHour,
                        timePicker!!.currentMinute, 0
                    )
                }
                setAlarm(calendar)
                }
            else
            {
                val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
                val intent = Intent(this, AlarmReceiver::class.java)
                val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)
                alarmManager.cancel(pendingIntent)
                //alarm_time_text.text = getString(R.string.time_dosent_set)
                Toast.makeText(this, "ALARM OFF", Toast.LENGTH_SHORT).show();
            }
        }




    }

    private fun setAlarm(calendar: Calendar) {
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)
        alarmManager.setRepeating(
            AlarmManager.RTC,// alaram time in SYSTEM.Current
            calendar.timeInMillis, // time that u have set in millis
            AlarmManager.INTERVAL_DAY,  // recurring
            pendingIntent // send the request to the alrmrecive
        )


       /* val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
*/
        Toast.makeText(this, "Alarm is set", Toast.LENGTH_SHORT).show()

    }
}
