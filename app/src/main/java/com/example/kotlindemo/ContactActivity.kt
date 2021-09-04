package com.example.kotlindemo

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.ArrayList

class ContactActivity : AppCompatActivity() {
    var uri:Uri?=null
    var myprojection:Array<String>?=null
    var list:ListView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
         uri= ContactsContract.CommonDataKinds.Phone.CONTENT_URI
        myprojection= arrayOf(
            ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
            ContactsContract.CommonDataKinds.Phone.NUMBER
        );

         list=findViewById<ListView>(R.id.contact_listview)
        getContact()
    }

    fun getContact()
    {
        val getcr : ContentResolver=contentResolver

        val cr:Cursor?= uri?.let { getcr.query(it,myprojection,null,null,null) }
        val str = ArrayList<String>()

        while(cr!!.moveToNext()) {

            val s =cr.getString(0)+cr.getString(1);
            str.add(s);
        }

       val adapter =  ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1,
            str
        );
        list!!.adapter=adapter;


    }
}
