package com.example.androidbasics

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        val isAirplaneModeEnable = intent?.getBooleanExtra("state", false) ?: return
        if (isAirplaneModeEnable){
            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()
        }
    }
}