package com.example.kotlindemo

import android.telephony.PhoneStateListener

class MyPhoneStateListner : PhoneStateListener() {

    override fun onCallStateChanged(state: Int, phoneNumber: String?) {
        super.onCallStateChanged(state, phoneNumber)
    }

}
