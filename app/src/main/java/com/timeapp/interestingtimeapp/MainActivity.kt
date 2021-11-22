package com.timeapp.interestingtimeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var timeViewController: TimeViewController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timeViewController = TimeViewController(this, object: OnTimeChanged{
            override fun onTimeChanged(hours: Int, minutes: Int) {
                time.text = "${hours}:${minutes}"
            }
        })
    }

    override fun onPause() {
        super.onPause()
        timeViewController.unregisterReceiver()
    }

    override fun onResume() {
        super.onResume()
        timeViewController.registerReceiver()
    }
}