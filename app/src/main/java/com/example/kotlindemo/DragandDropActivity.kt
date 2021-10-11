package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

class DragandDropActivity : AppCompatActivity() {

    var imgDD:ImageView?=null
    var xd:Float= 0F  // down
    var yd:Float=0F   //down
    var xm:Float?=null
    var ym:Float?=null
    var xdes:Float?=null
    var ydes:Float?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dragand_drop)

        imgDD = findViewById(R.id.imageView2)

        imgDD!!.setOnTouchListener { v, event ->


            val e = event.getActionMasked();

            when (e) {
                MotionEvent.ACTION_DOWN -> {
                    xd = event.getX();
                    yd = event.getY();
                }
                MotionEvent.ACTION_MOVE -> {
                    xm = event.getX();
                    ym = event.getY();

                    xdes = xm!!.toFloat() - xd;
                    ydes = ym!!.toFloat() - yd;

                    v.setX(v.getX() + xdes!!.toFloat());
                    v.setY(v.getY() + ydes!!.toFloat());

                }

            }
            return@setOnTouchListener true


        }

    }
}
