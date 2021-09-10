package com.example.hpapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = NetworkManager.HPApi.getHPList()
        val recycler = findViewById<RecyclerView>(R.id.recyclerViewID)
        val recyclerViewAdapter = RecyclerViewAdapter()
        recycler.adapter = recyclerViewAdapter

        lifecycleScope.launch {
            val response = getResult(result)
            recyclerViewAdapter.submitList(response)
        }

    }

    private suspend fun getResult(result: Call<List<CharacterItemsItem>>): List<CharacterItemsItem> {
        var listHp: List<CharacterItemsItem> = emptyList()
        CoroutineScope(Dispatchers.IO).launch {
            listHp = result.execute().body()!!
        }.join()
        return listHp
    }
}

