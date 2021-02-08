package com.example.motionlayoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.motionlayoutpractice.data.Binding2ViewModel
import com.example.motionlayoutpractice.databinding.ActivityBinding2Binding

class Binding2Activity : AppCompatActivity() {

    lateinit var mBinding : ActivityBinding2Binding
    private val model : Binding2ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_binding2)

        mBinding.lifecycleOwner = this
        mBinding.viewModel = model

    }

    fun nextActivity(){
        Toast.makeText(this, "Testing", Toast.LENGTH_SHORT).show()
    }
}