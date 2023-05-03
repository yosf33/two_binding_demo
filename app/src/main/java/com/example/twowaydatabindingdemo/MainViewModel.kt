package com.example.twowaydatabindingdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val username= MutableLiveData<String>()

    fun changeData() {
        username.postValue("this is changes")
    }
}