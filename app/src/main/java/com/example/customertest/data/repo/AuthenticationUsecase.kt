package com.example.customertest.data.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.customertest.data.model.authentication.AuthenticationRequest
import com.example.customertest.data.model.authentication.AuthenticationResponse
import com.example.customertest.data.service.ApiService
import com.example.customertest.data.service.AuthenticationService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class AuthenticationUsecase {

    private var authenticationService: AuthenticationService? = null

    init {
        authenticationService = ApiService.getApiClient().create(AuthenticationService::class.java)
    }

    fun getToken(
        authenticationRequest: AuthenticationRequest
    ): LiveData<AuthenticationResponse> {

        val data = MutableLiveData<AuthenticationResponse>()
        authenticationService?.let {
            it.getAuthenticationToken(
                username = authenticationRequest.username,
                password = authenticationRequest.password,
                granType = authenticationRequest.grant_type
            )
                .enqueue(object : Callback<AuthenticationResponse> {
                    override fun onResponse(
                        call: Call<AuthenticationResponse>,
                        response: Response<AuthenticationResponse>
                    ) {
                        response.body()?.let { data.value = it }
                    }

                    override fun onFailure(call: Call<AuthenticationResponse>, t: Throwable) {
                        val s = ""
                    }

                })
        }
        return data
    }
}

