package com.example.motionlayoutpractice


import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.motionlayoutpractice.databinding.ActivityCardBinding
import android.util.Pair
import android.view.View

class CardActivity : AppCompatActivity() {

    lateinit var binding : ActivityCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_card)

        binding.mainCard.setOnClickListener{
            val intent = Intent(this, ScrollingActivity::class.java)

            val boxAnim = Pair.create<View,String>(binding.mainCard, "cardTransition")
            val imgAnim = Pair.create<View,String>(binding.profileImg, "imgTransition")
            val txtAnim = Pair.create<View,String>(binding.nameTxt, "textTransition")


            var options = ActivityOptions.makeSceneTransitionAnimation(
                this,
                boxAnim,
                imgAnim,
                txtAnim
            )
            startActivity(intent,options.toBundle())
        }
    }
}