package com.example.hpapi

import androidx.recyclerview.widget.DiffUtil

object HPItemDiffCallback : DiffUtil.ItemCallback<CharacterItemsItem>() {
    override fun areItemsTheSame(oldItem: CharacterItemsItem, newItem: CharacterItemsItem): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: CharacterItemsItem, newItem: CharacterItemsItem): Boolean {
        return oldItem == newItem
    }

}
