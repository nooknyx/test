package com.example.customertest.data.model.authentication

data class AuthenticationResponse(
    var scope: String,
    var token_type: String,
    var access_token: String,
    var expires_in: Int,
    var refresh_token: String
)