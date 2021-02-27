package com.example.androiddevchallenge.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.MainViewModel
import com.example.androiddevchallenge.data.DogEntity
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun ListView(dogs: List<DogEntity>, onDogClick: (DogEntity) -> Unit = {}) {
    LazyColumn(
        modifier = Modifier.background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.spacedBy(0.5.dp)
    ) {
        items(dogs) { dog ->
            ItemView(dog = dog,
                modifier = Modifier
                    .clickable { onDogClick(dog) }
                    .fillMaxWidth())
        }
    }
}

@Preview
@Composable
fun ListViewPreview() {
    MyTheme {
        ListView(MainViewModel.dogList.subList(0, 3))
    }
}

@Preview
@Composable
fun ListViewPreviewDark() {
    MyTheme(darkTheme = true) {
        ListView(MainViewModel.dogList.subList(0, 3))
    }
}