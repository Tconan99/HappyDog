package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class DogEntity(
    @DrawableRes val image: Int,
    val nickname: String,
    val brand: String,
    val age: String,
    val gender: String,
    val hobby: String,
    val color: String,
    val height: String,
    val weight: String,
)