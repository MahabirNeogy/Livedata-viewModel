package com.example.livedata_viewmodel.Viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var text1= MutableLiveData<String>()
    var text2= MutableLiveData<String>()
    init{
        text1.value="jfduvd"
        text2.value="fgdfhfhb"
    }

    fun updateText() {
        text1.value="Hello"
        text2.value="World"
    }
}