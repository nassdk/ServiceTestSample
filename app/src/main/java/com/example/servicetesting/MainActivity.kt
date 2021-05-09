package com.example.servicetesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private val LOG_TAG = "LOG_TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<AppCompatButton>(R.id.startServiceBtn)
        val stop = findViewById<AppCompatButton>(R.id.stopServiceBtn)

        start.setOnClickListener {
//            startService(Intent(this@MainActivity, CounterService::class.java))
//            startService(Intent(this@MainActivity, CounterIntentService::class.java))
            CounterJobIntentService.enqueueWork(
                this@MainActivity,
                Intent(this, CounterJobIntentService::class.java)
            )
        }

        stop.setOnClickListener {
            stopService(Intent(this@MainActivity, CounterIntentService::class.java))
        }

//        while (true) {
//            Thread.sleep(3000L)
//            Log.d(LOG_TAG, "LOOOOOOOOOOOOOOOOOOOOOOG")
//        }
    }
}