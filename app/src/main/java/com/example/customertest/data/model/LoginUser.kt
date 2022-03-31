package com.example.customertest.data.model

data class LoginUser(
    var scope: String,
    var token_type: String,
    var access_token: String,
    var expires_in: String,
    var refresh_token: String
)
