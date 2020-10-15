package com.lordru.androidtemplate.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lordru.androidtemplate.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}