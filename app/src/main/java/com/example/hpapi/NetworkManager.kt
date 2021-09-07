package com.example.hpapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object NetworkManager {
    private const val BASE_URL = "https://hp-api.herokuapp.com/api/characters/"
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val HPApi: HPApi = retrofit.create()
}
