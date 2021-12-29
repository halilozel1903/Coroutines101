package com.halil.ozel.coroutines101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@DelicateCoroutinesApi
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Light Weightness

        GlobalScope.launch {
            repeat(10000){
                println("Android App")
            }
        }
    }
}