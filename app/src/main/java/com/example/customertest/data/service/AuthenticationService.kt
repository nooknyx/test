package com.example.customertest.data.service

import com.example.customertest.data.model.authentication.AuthenticationResponse
import retrofit2.Call
import retrofit2.http.*

interface AuthenticationService {

    @FormUrlEncoded
    @POST("/SCVAuthen/token")
    fun getAuthenticationToken(@Field("username") username: String , @Field("password") password: String,@Field("grant_type") granType: String): Call<AuthenticationResponse>
}