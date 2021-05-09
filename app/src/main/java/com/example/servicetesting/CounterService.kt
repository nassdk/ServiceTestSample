package com.example.servicetesting

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class CounterService : Service() {

    private val LOG_TAG = "LOG_TAG"

    override fun onCreate() {
        super.onCreate()
        Log.d(LOG_TAG, "onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(LOG_TAG, "onStartCommand")
        doSomeTask()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }


    override fun onBind(intent: Intent?): IBinder? {
        Log.d(LOG_TAG, "onBind")
        return null
    }

    private fun doSomeTask() {

        while (true) {
            Thread.sleep(3000L)
            Log.d(LOG_TAG, "LOOOOOOOOOOOOOOOOOOOOOOG")
        }
    }
}