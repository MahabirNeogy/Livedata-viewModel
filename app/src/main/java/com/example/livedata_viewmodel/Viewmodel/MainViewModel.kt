package com.example.livedata_viewmodel.Viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var _text1= MutableLiveData<String>()
    private var _text2= MutableLiveData<String>()

    val text1: LiveData<String>
        get()=_text1
    val text2: LiveData<String>
        get() = _text2
    init{
        _text1.value="jfduvd"
        _text2.value="fgdfhfhb"
    }

    fun updateText() {
        _text1.value="Hello"
        _text2.value="World"
    }
}