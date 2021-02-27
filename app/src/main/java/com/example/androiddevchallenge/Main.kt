package com.example.androiddevchallenge

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.ui.DetailView
import com.example.androiddevchallenge.ui.ListView
import kotlinx.coroutines.launch

@Composable
fun Main() {
    val snackbarHostState = SnackbarHostState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(topBar = {
        TopAppBar(title = {
            Text("Happy Dog")
        })
    }, snackbarHost = {
        SnackbarHost(hostState = snackbarHostState)
    }) {
        val viewModel: MainViewModel = viewModel()
        ListView(dogs = viewModel.dogs) {
            viewModel.showDetail(dog = it)
        }
        val dog = viewModel.current
        dog?.apply {
            DetailView(dog = this) {
                coroutineScope.launch {
                    snackbarHostState.showSnackbar(dog.nickname)
                }
            }
        }
    }
}