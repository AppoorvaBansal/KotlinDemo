package com.example.kotlindemo

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(fm: FragmentManager) :FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
               return HomeFragment()
            }
            1 -> {
                return AboutUsFragment()
            }
            2 -> {
                // val movieFragment = MovieFragment()
                return ChatFragment()
            }
            else -> return HomeFragment()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return 3
    }
    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "First"
        } else if (position == 1) {
            title = "Second"
        } else if (position == 2) {
            title = "Third"
        }
        return title
    }
}
