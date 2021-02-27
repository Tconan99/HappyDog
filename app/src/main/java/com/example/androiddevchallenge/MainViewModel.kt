/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.DogEntity

class MainViewModel : ViewModel() {
    val dogs by mutableStateOf(
        dogList
    )

    var current: DogEntity? by mutableStateOf(null)

    fun showDetail(dog: DogEntity) {
        current = dog
    }

    fun closeDetail() {
        current = null
    }

    companion object {
        val dogList = listOf(
            DogEntity(
                image = R.drawable.dog_border_collie,
                nickname = "Border Collie",
                brand = "Border Collie",
                age = "3.4",
                gender = "Male",
                hobby = "Play Ball",
                color = "Black",
                height = "56CM",
                weight = "12KG",
            ),
            DogEntity(
                image = R.drawable.dog_old_english_sheepdog,
                nickname = "Old English Sheepdog",
                brand = "Old English Sheepdog",
                age = "1",
                gender = "Female",
                hobby = "Adaptable",
                color = "Grizzle",
                height = "56CM",
                weight = "27KG",
            ),
            DogEntity(
                image = R.drawable.dog_bulldog,
                nickname = "Bulldog",
                brand = "Bulldog",
                age = "2",
                gender = "Male",
                hobby = "Play Ball",
                color = "Fawn",
                height = "31CM",
                weight = "18KG",
            ),
            DogEntity(
                image = R.drawable.dog_golden_retriever,
                nickname = "Golden Retriever",
                brand = "Golden Retriever",
                age = "2.2",
                gender = "Male",
                hobby = "Swim",
                color = "Fawn",
                height = "55CM",
                weight = "30KG",
            ),
            DogEntity(
                image = R.drawable.dog_yorkshire_terrier,
                nickname = "Yorkshire Terrier",
                brand = "Yorkshire Terrier",
                age = "2.1",
                gender = "Female",
                hobby = "sleep",
                color = "Gold & Black",
                height = "20CM",
                weight = "5KG",
            ),
            DogEntity(
                image = R.drawable.dog_beagle,
                nickname = "Beagle",
                brand = "Beagle",
                age = "2.4",
                gender = "Male",
                hobby = "Excitable",
                color = "Lemon & White",
                height = "36CM",
                weight = "10KG",
            ),
            DogEntity(
                image = R.drawable.dog_bull_terrier,
                nickname = "Bull Terrier",
                brand = "Bull Terrier",
                age = "2.1",
                gender = "Male",
                hobby = "Excitable",
                color = "Lemon & White",
                height = "48CM",
                weight = "25KG",
            )
        )
    }
}
