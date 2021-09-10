package com.example.hpapi

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hpapi.databinding.RecyclerItemBinding

class RecyclerViewAdapter : ListAdapter<CharacterItemsItem, RecyclerView.ViewHolder>(HPItemDiffCallback) {
    class HPViewHolder(private var binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(characters: CharacterItemsItem) {
            binding.characterName.text = characters.name
            Glide.with(binding.characterImage)
                .load(characters.image.replace("http:", "https:"))
                .override(400, 400)
                .centerCrop()
                .error(R.drawable.ic_launcher_background)
                .into(binding.characterImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: RecyclerItemBinding = RecyclerItemBinding.inflate(inflater, parent, false)
        binding.root.setOnClickListener {
            Toast.makeText(parent.context, "${binding.characterName.text} 클릭됨", Toast.LENGTH_SHORT).show()
        }
        return HPViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as HPViewHolder).bind(getItem(position))
    }
}
