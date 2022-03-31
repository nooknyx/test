package com.example.customertest.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.customertest.data.model.authentication.AuthenticationRequest
import com.example.customertest.data.model.authentication.AuthenticationResponse
import com.example.customertest.data.repo.AuthenticationUsecase

class LoginViewModel : ViewModel() {
    var authenticationUsecase: AuthenticationUsecase? = null

    var authenticationResponse: LiveData<AuthenticationResponse> = MutableLiveData()

    init {
        authenticationUsecase = AuthenticationUsecase()
    }

    fun getToken() {
        authenticationUsecase?.let {
            authenticationResponse = it.getToken(AuthenticationRequest(username = "chatbotuser" , password="s=0zO&@]" , grant_type = "password"))
        }

    }
}