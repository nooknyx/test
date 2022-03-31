package com.example.customertest.data.model.authentication

data class AuthenticationRequest(
    val username : String ,
    val password :String ,
    val grant_type : String
)