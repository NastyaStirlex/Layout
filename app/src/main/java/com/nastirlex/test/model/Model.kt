package com.nastirlex.test.model

import androidx.lifecycle.MutableLiveData
import com.nastirlex.test.R

//работа с бд / api
class Model() {

    fun register(
        email: String,
        name: String,
        password: String,
        screenState: MutableLiveData<Boolean>
    ) {}

    fun login(screenState: MutableLiveData<Boolean>) {}
}