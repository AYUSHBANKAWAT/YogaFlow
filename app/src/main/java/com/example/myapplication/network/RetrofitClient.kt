package com.example.myapplication.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.lang.reflect.GenericSignatureFormatError

object RetrofitClient {
private val okHttpClient=OkHttpClient.Builder().build()
    private val retrofit=Retrofit.Builder()
        .baseUrl(ApiPoint.MainUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
    val api= retrofit.create(ApiServices::class.java)

}