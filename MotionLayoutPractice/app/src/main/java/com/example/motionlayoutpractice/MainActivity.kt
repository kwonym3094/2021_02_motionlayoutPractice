package com.example.motionlayoutpractice

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.motionlayoutpractice.databinding.ActivityMainBinding
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        Timer().schedule(1000) {
            mainBinding.imageView.callOnClick()
        }

        Timer().schedule(3000) {
            val intent1 = intent
            intent1.setClass(this@MainActivity, DataBindingActivity::class.java)
            startActivity(intent1)
        }
    }

}