package com.example.customertest.ui

import com.example.customertest.data.model.authentication.AuthenticationResponse

interface EventListner {
    fun onAuthenticationToken(authenticationResponse: AuthenticationResponse){}
}