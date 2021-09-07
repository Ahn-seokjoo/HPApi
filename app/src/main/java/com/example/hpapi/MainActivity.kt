package com.example.hpapi

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModelStore
        val result = NetworkManager.HPApi.getHPList("harry potter")
        result.enqueue(object : Callback<List<CharacterItemsItem>> {
            override fun onResponse(call: Call<List<CharacterItemsItem>>, response: Response<List<CharacterItemsItem>>) {
                Log.d(TAG, "onResponse: ${response.body()}")
            }

            override fun onFailure(call: Call<List<CharacterItemsItem>>, t: Throwable) {
                Log.d(TAG, "onFailure: ${t.message}")
            }
        })
    }
}
// 장 데이터 받아서
