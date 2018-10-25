package com.morrisware.android.learnprofiler

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openUs.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        callLoginTimeTask.setOnClickListener {
            callLoginTimeTask()
        }
    }

    private fun callLoginTimeTask() {
        for (i in 0..100L) {
            Log.d("TAG", "$i")
        }
    }

}
