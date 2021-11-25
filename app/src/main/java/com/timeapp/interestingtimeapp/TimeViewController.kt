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
            activatingHours(getIdsNum(hours, MODE_NUM_HOUR))
            changeStateHour(hours)
        }
        if (lastMinutes != minutes){
            //activationMinutes(getIdsNum(minutes, MODE_NUM_MINUTES))
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

    private fun getIdsNum(num: Int, mode: Int): List<Int> {
        return if (num in 0..10)
            getIdsBasicNum(num, mode)
        else
            getIdsHardNum(num, mode)
    }

    private fun getIdsBasicNum(num: Int, mode: Int): List<Int>{
        return (if (mode == MODE_NUM_HOUR) BASIC_HOUR_NUM_CODE else BASIC_MINUTES_NUM_CODE)[num.toString()]!!.toMutableList()
    }

    private fun getIdsHardNum(num: Int, mode: Int): List<Int>{
        val idsFirstPartHard = getIdsFirstPartHardNum(num.toString(), mode)
        val idsSecondPartHard = getIdsSecondPartHardNum(num.toString(), mode)

        return idsFirstPartHard + idsSecondPartHard
    }

    private fun getIdsSecondPartHardNum(num: String, mode: Int): MutableList<Int> {
        return if (num.toInt() == 20) arrayListOf()
                else if (num.toInt() < 20)
                            (if (mode == MODE_NUM_HOUR) EXPAND_CODE_HOUR else EXPAND_CODE_MINUTES)["надцать"]!!
                        else
                            (if (mode == MODE_NUM_HOUR) BASIC_HOUR_NUM_CODE else BASIC_MINUTES_NUM_CODE)[num[1].toString()]!!
    }

    private fun changeStateHour(hour: Int){
        val idsState = getNowHourState(hour)

        shutdownItem(activatedIdsStateHour)
        activatingItem(idsState)
        replaceActivatedStateHour(idsState)
    }

    private fun getNowHourState(hour: Int): MutableList<Int>{
        return (if (hour == 1 || hour == 21)
                STATE_HOUR_CODE["час"]!!
            else
                if (hour in 2..4 || hour in 22..23)
                    STATE_HOUR_CODE["часа"]!!
                else
                    STATE_HOUR_CODE["часов"]!!).toMutableList()
    }

    private fun getIdsFirstPartHardNum(num: String, mode: Int): MutableList<Int>{
        val ids: MutableList<Int>
        val basic = (if (mode == MODE_NUM_HOUR) BASIC_HOUR_NUM_CODE else BASIC_MINUTES_NUM_CODE)
        val expand = (if (mode == MODE_NUM_HOUR) EXPAND_CODE_HOUR else EXPAND_CODE_MINUTES)

        if (num.toInt() < 20) {
            val basicNum = num[1].toString()
            ids = (if (basicNum != "2")
                basic[basicNum]!!
            else
                expand["две"]!!).toMutableList()

            if (basicNum != "1" && basicNum != "3" && basicNum != "2")
                ids.removeAt(ids.size - 1)
        }else{
            ids = (basic["2"]!! + expand["дцать"]!!).toMutableList()
        }

        return ids
    }

    private fun getIdsNumInRange20to60(num: Int){

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

    private fun activationMinutes(ids: List<Int>){
        shutdownItem(activatedIdsMinutes)
        activatingItem(ids)
        replaceActivatedMinutes(ids)
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

    private fun replaceActivatedMinutes(ids: List<Int>){
        activatedIdsMinutes.clear()
        activatedIdsMinutes.addAll(ids)
    }

    private fun replaceActivatedStateHour(ids: List<Int>){
        activatedIdsStateHour.clear()
        activatedIdsStateHour.addAll(ids)
    }
}