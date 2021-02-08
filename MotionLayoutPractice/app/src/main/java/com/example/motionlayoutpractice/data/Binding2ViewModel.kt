package com.example.motionlayoutpractice.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by ymKwon on 2021-02-08 오후 1:27.
 * ViewModel 연습
 */

class Binding2ViewModel() : ViewModel() {
    // ViewModel()을 상속받을 경우
    // class MainViewModel():ViewModel(){}

    // LiveData
    // 값이 변경되는 경우 MutableLiveData 로 선언
    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun increase(){
        count.value = count.value?.plus(1)
    }

    fun decrease(){
        count.value = count.value?.minus(1)
    }

}