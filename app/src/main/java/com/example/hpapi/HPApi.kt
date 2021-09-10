package com.example.hpapi

import retrofit2.Call
import retrofit2.http.GET

interface HPApi {
    @GET("api/characters/students/")
    fun getHPList(): Call<List<CharacterItemsItem>>
}
