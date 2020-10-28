package com.ronem.mylogger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ronem.myloggerlib.showMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("This is message", true)
    }
}
