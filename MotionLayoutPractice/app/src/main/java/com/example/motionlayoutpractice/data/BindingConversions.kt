package com.example.motionlayoutpractice.data

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.motionlayoutpractice.R

/**
 * Created by ymKwon on 2021-02-08 오전 10:35.
 * 바인딩 어뎁터
 *  - 주로 data binding 할 때, 이미지를 넣어주기 위해 사용
 */

object BindingConversions {

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadImage(imageView : ImageView, url : String){

        Glide.with(imageView.context).load(url)
            .error(R.drawable.pg)
            .into(imageView)
    }

}