package com.example.kotlindemo

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.DragEvent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class DragandLongclickActivity : AppCompatActivity() {
    var imgproduct: ImageView?=null
    var imgdrag:ImageView?=null
    var items:Int=0
    var txtcount:TextView?=null
    var llay:ConstraintLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dragand_longclick)

        imgdrag=findViewById(R.id.imgdrag)
        imgproduct=findViewById(R.id.imgproduct)
        //llay = findViewById(R.id.ll);
        txtcount=findViewById(R.id.txtcounter)
        imgproduct!!.setOnLongClickListener {
            val clipData = ClipData.newPlainText("ok", "ok");
            val dragShadow =  View.DragShadowBuilder(it);

            it.startDrag(clipData, dragShadow, it, 0); // startDrag is depricated
            // use startDragandDrop(clipData,dragShadow,v,0)

            return@setOnLongClickListener true;
        }


        imgdrag!!.setOnDragListener { v, event ->

            val action = event.getAction();
            when(action){
                DragEvent.ACTION_DRAG_ENTERED->{
                    items=items+1;
                    Toast.makeText(this,"Enter",Toast.LENGTH_LONG).show()
                }

                DragEvent.ACTION_DRAG_ENDED->{
                    Toast.makeText(this,"ENDD",Toast.LENGTH_LONG).show()
                   // items=items+1;
                    //      Log.d(TAG, "onDrag: Ended")
                   txtcount!!.setText(items.toString());
                    //val snackbar = Snackbar.make(llay as ConstraintLayout,"Items: "+items,Snackbar.LENGTH_LONG);
                    //snackbar.show()
                }

             DragEvent.ACTION_DRAG_EXITED->{
                    items--;
                 Toast.makeText(this,"EXIT",Toast.LENGTH_LONG).show()


             }
            }
            return@setOnDragListener true;
        }

        }



    }

