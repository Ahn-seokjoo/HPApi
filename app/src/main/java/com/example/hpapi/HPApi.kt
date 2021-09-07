package com.example.hpapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface HPApi {
    @GET(".")
    fun getHPList(@Query("query") query: String): Call<List<CharacterItemsItem>>
}
