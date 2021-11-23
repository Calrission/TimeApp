package com.timeapp.interestingtimeapp

import android.app.Activity
import android.content.Intent
import android.content.IntentFilter
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class TimeViewController(private val context: Activity, onChangeText: OnTimeChanged) {

    var lastHour: Int = 0
    var lastMinutes: Int = 0

    private val onTimeChanged = object: OnTimeChanged {
        override fun onTimeChanged(hours: Int, minutes: Int) {
            updateTime(hours, minutes)

            lastHour = hours
            lastMinutes = minutes

            onChangeText.onTimeChanged(hours, minutes)
        }
    }

    private var timeChangeReceiver: TimeChangeReceiver = TimeChangeReceiver(onTimeChanged)

    private val activatedIdsMinutes = mutableListOf<Int>()
    private val activatedIdsHour = mutableListOf<Int>()
    private val activatedIdsStateHour = mutableListOf<Int>()

    init {
        registerReceiver()
        firstGetTime()
    }

    fun updateTime(hours: Int, minutes: Int){
        if (lastHour != hours) {
            setHourToXML(hours)
            changeStateHour(hours)
        }
    }

    private fun firstGetTime(){
        val dateNow = Date()
        val dateNowFormat = SimpleDateFormat("HH mm", Locale.ENGLISH).format(dateNow)
        val hours = dateNowFormat.substringBefore(" ").toInt()
        val minutes = dateNowFormat.substringAfter(" ").toInt()

        onTimeChanged.onTimeChanged(hours, minutes)
    }

    fun registerReceiver() {
        context.registerReceiver(timeChangeReceiver, IntentFilter(Intent.ACTION_TIME_TICK))
    }

    fun unregisterReceiver() {
        context.unregisterReceiver(timeChangeReceiver)
    }

    private fun setHourToXML(hour: Int){
        if (hour in 0..10)
            activationBasicHour(hour)
        else
            activationHardHour(hour)
    }

    private fun activationBasicHour(hour: Int){
        val ids = BASIC_HOUR_NUM_CODE[hour.toString()]!!.toMutableList()
        activatingHours(ids)
    }

    private fun activationHardHour(hour: Int){
        val idsFirstPartHardHour = getIdsFirstPartHour(hour.toString())
        val idsSecondPartHardHour = getIdsSecondPartHour(hour.toString())

        activatingHours(idsFirstPartHardHour + idsSecondPartHardHour)
    }

    private fun getIdsSecondPartHour(hour: String): MutableList<Int> {
        return if (hour.toInt() == 20) arrayListOf()
                else if (hour.toInt() < 20)
                            EXPAND_CODE["надцать"]!!
                        else
                            BASIC_HOUR_NUM_CODE[hour[1].toString()]!!
    }

    private fun changeStateHour(hour: Int){
        val idsState =
            (if (hour == 1 || hour == 21)
            STATE_HOUR_CODE["час"]!!
            else
                if (hour in 2..4 || hour in 22..23)
                    STATE_HOUR_CODE["часа"]!!
                else
                    STATE_HOUR_CODE["часов"]!!).toMutableList()

        shutdownItem(activatedIdsStateHour)
        activatingItem(idsState)
        replaceActivatedStateHour(idsState)
    }

    private fun getIdsFirstPartHour(hour: String): MutableList<Int>{
        val ids: MutableList<Int>

        if (hour.toInt() < 20) {
            val basicHour = hour[1].toString()
            ids = (if (basicHour != "2")
                BASIC_HOUR_NUM_CODE[basicHour]!!
            else
                EXPAND_CODE["две"]!!).toMutableList()

            if (basicHour != "1" && basicHour != "3" && basicHour != "2")
                ids.removeAt(ids.size - 1)
        }else{
            ids = (BASIC_HOUR_NUM_CODE["2"]!! + EXPAND_CODE["дцать"]!!).toMutableList()
        }

        return ids
    }

    private fun activatingItem(ids: List<Int>){
        ids.forEach { id ->
            val item = context.findViewById<TextView>(id)
            item.setTextColor(context.getColor(R.color.colorActivationText))
        }
    }

    private fun activatingHours(ids: List<Int>){
        shutdownItem(activatedIdsHour)
        activatingItem(ids)
        replaceActivatedHours(ids)
    }

    private fun shutdownItem(ids: List<Int>){
        ids.forEach { id ->
            val item = context.findViewById<TextView>(id)
            item.setTextColor(context.getColor(R.color.colorNoActivationText))
        }
    }

    private fun replaceActivatedHours(ids: List<Int>){
        activatedIdsHour.clear()
        activatedIdsHour.addAll(ids)
    }

    private fun replaceActivatedStateHour(ids: List<Int>){
        activatedIdsStateHour.clear()
        activatedIdsStateHour.addAll(ids)
    }
}