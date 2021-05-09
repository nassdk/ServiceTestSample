package com.example.servicetesting

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class CounterJobIntentService : JobIntentService() {

    private val LOG_TAG = "LOG_TAG"

    override fun onHandleWork(intent: Intent) {
        Log.d(LOG_TAG, "onHandleWork")
        doSomeTask()
    }

    private fun doSomeTask() {

        while (true) {
            Thread.sleep(3000L)
            Log.d(LOG_TAG, "LOOOOOOOOOOOOOOOOOOOOOOG")
        }
    }

    companion object {

        fun enqueueWork(context: Context, intent: Intent) {
            enqueueWork(context, CounterJobIntentService::class.java, 1, intent)
        }
    }
}