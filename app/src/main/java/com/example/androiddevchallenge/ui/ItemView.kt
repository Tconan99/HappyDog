package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.MainViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.DogEntity
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun ItemView(dog: DogEntity, modifier: Modifier = Modifier) {
    Card(modifier) {
        Row {
            Image(
                painter = painterResource(dog.image),
                contentDescription = "Picture of ${dog.nickname}",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(16.dp)) {
                Text(dog.nickname, style = MaterialTheme.typography.h5)
                Text(dog.brand)
                Text(dog.hobby)
            }
        }
    }
}

@Preview
@Composable
fun ItemViewPreview() {
    MyTheme {
        ItemView(MainViewModel.dogList[0])
    }
}

@Preview
@Composable
fun ItemViewPreviewDark() {
    MyTheme(darkTheme = true) {
        ItemView(MainViewModel.dogList[0])
    }
}