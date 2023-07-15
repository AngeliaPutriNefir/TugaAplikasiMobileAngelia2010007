package com.example.tugasmobile2010007.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini Fragment Pengaturan"
    }
    val text: LiveData<String> = _text
}