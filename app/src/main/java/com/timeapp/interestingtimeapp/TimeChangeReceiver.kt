package com.timeapp.interestingtimeapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.text.SimpleDateFormat
import java.util.*

class TimeChangeReceiver(private val onTimeChanged: OnTimeChanged): BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val dateNow = Date()
        val dateNowFormat = SimpleDateFormat("HH mm", Locale.ENGLISH).format(dateNow)
        val hours = dateNowFormat.substringBefore(" ").toInt()
        val minutes = dateNowFormat.substringAfter(" ").toInt()

        onTimeChanged.onTimeChanged(hours, minutes)
    }
}