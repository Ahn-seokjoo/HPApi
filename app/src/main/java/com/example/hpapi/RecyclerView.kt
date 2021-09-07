package com.example.hpapi

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hpapi.databinding.ActivityMainBinding

class RecyclerView : ListAdapter<CharacterItemsItem, RecyclerView.ViewHolder>(HPItemDiffCallback) {
    class HPViewHolder(val binding: ActivityMainBinding) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
