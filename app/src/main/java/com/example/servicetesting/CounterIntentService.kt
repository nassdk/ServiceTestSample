package com.example.servicetesting

import android.app.IntentService
import android.content.Intent
import android.content.Context
import android.util.Log

class CounterIntentService : IntentService("CounterIntentService") {

    private val LOG_TAG = "LOG_TAG"

    override fun onHandleIntent(intent: Intent?) {
        Log.d(LOG_TAG, "onHandleIntent")
        doSomeTask()
    }

    private fun doSomeTask() {

        while (true) {
            Thread.sleep(3000L)
            Log.d(LOG_TAG, "LOOOOOOOOOOOOOOOOOOOOOOG")
        }
    }
}