package com.example.hpapi

import com.google.gson.annotations.SerializedName

data class CharacterItemsItem(
    @SerializedName("actor")
    val actor: String,
    @SerializedName("alive")
    val alive: Boolean,
    @SerializedName("ancestry")
    val ancestry: String,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String,
    @SerializedName("eyeColour")
    val eyeColour: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("hairColour")
    val hairColour: String,
    @SerializedName("hogwartsStaff")
    val hogwartsStaff: Boolean,
    @SerializedName("hogwartsStudent")
    val hogwartsStudent: Boolean,
    @SerializedName("house")
    val house: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("patronus")
    val patronus: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("wand")
    val wand: Wand,
    @SerializedName("yearOfBirth")
    val yearOfBirth: String,
) {
    data class Wand(
        @SerializedName("core")
        val core: String,
        @SerializedName("length")
        val length: String,
        @SerializedName("wood")
        val wood: String,
    )
}

