package com.example.kotlindemo

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class AboutUsFragment : Fragment() {
    var fm:FragmentManager?=null
    var ft:FragmentTransaction?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState==null)
        {
            fm=childFragmentManager
            ft=fm!!.beginTransaction()
            ft!!.add(R.id.fragment1,F1Fragment())
            ft!!.add(R.id.fragment2,F2Fragment())
            ft!!.add(R.id.fragment3,F3Fragment())
            ft!!.commit()

        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
       val v= inflater.inflate(R.layout.fragment_about_us, container, false)
        val btnf1=v.findViewById<Button>(R.id.btnf1)
        val btnf2=v.findViewById<Button>(R.id.btnf2)
        val btnf3=v.findViewById<Button>(R.id.btnf3)




        btnf1.setOnClickListener {
            fm=childFragmentManager
            ft=fm!!.beginTransaction()
            ft!!.replace(R.id.fragment1,F1Fragment())
            ft!!.replace(R.id.fragment2,F2Fragment())
            ft!!.replace(R.id.fragment3,F3Fragment())
            ft!!.commit()

        }
        btnf2.setOnClickListener {
            fm=childFragmentManager
            ft=fm!!.beginTransaction()
            ft!!.replace(R.id.fragment1,F1AFragment())
            ft!!.replace(R.id.fragment2,F2AFragment())
            ft!!.replace(R.id.fragment3,F3AFragment())
            ft!!.commit()
        }
        btnf3.setOnClickListener {
            fm=childFragmentManager
            ft=fm!!.beginTransaction()
            ft!!.replace(R.id.fragment1,F1BFragment())
            ft!!.replace(R.id.fragment2,F2BFragment())
            ft!!.replace(R.id.fragment3,F3BFragment())
            ft!!.commit()
        }






        return v;
    }


}
