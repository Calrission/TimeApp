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
                time.text = "${if (hours >= 10) hours else "0" + hours}:${if (minutes >= 10) minutes else "0" + minutes}"
            }
        })

//        var count = 0
//        time.setOnClickListener {
//            timeViewController.updateTime(count, 0)
//            if (count == 23)
//                count = 0
//            else
//                count += 1
//        }
    }

    override fun onStop() {
        super.onStop()
        timeViewController.unregisterReceiver()
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