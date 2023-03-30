package com.nastirlex.test

import androidx.lifecycle.MutableLiveData
import com.nastirlex.test.model.Model

class ViewModel(private var model: Model) : androidx.lifecycle.ViewModel() {
    val screenState = MutableLiveData<Boolean>()

    fun onLoginButtonClick() {
        model.login(screenState)
    }

    fun onRegisterButtonClick(email: String, name: String, password: String) {
        if (email.isEmpty() || name.isEmpty() || password.isEmpty()) {
            screenState.value = false
        } else {
            model.register(
                email,
                name,
                password,
                screenState
            )
        }
    }

    fun onBackButtonClick() {}
}