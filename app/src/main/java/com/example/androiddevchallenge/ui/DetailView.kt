package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.MainViewModel
import com.example.androiddevchallenge.data.DogEntity
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DetailView(dog: DogEntity, onAdoptClick: (DogEntity) -> Unit = {}) {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .clickable {  }
    ) {
        Box {
            Image(
                painter = painterResource(id = dog.image),
                contentDescription = "Dog of ${dog.nickname}",
                Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentScale = ContentScale.Crop,
            )
            Button(
                onClick = { onAdoptClick(dog) },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(end = 16.dp, bottom = 16.dp)
            ) {
                Text(text = "Adopt")
            }
        }
        Column(Modifier.padding(16.dp)) {
            Text(text = "Name: ${dog.nickname}", style = MaterialTheme.typography.h5)
            ProvideTextStyle(MaterialTheme.typography.h6) {
                Text(text = "Brand: ${dog.brand}")
                Text(text = "Age: ${dog.age}")
                Text(text = "Color: ${dog.color}")
                Text(text = "Gender: ${dog.gender}")
                Text(text = "Height: ${dog.height}")
                Text(text = "Hobby: ${dog.hobby}")
                Text(text = "Weight: ${dog.weight}")
            }
        }
    }
}

@Preview
@Composable
fun DetailViewPreview() {
    MyTheme {
        DetailView(dog = MainViewModel.dogList[0])
    }
}

@Preview
@Composable
fun DetailViewPreviewDark() {
    MyTheme(darkTheme = true) {
        DetailView(dog = MainViewModel.dogList[0])
    }
}