package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun HomeScreen(selectPuppy: (Int) -> Unit) {
    MyTheme {
        HomeRoot(selectPuppy)
    }
}

@Composable
fun HomeRoot(selectPuppy: (Int) -> Unit) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        topBar = { TopAppBar(title = { Text(text = "Puppies🐶") }) },
        content = { HomeContent(selectPuppy) }
    )
}


@Composable
fun HomeContent(selectPuppy: (Int) -> Unit) {
    PuppiesList(selectPuppy)
}

@Composable
fun PuppiesList(selectPuppy: (Int) -> Unit) {
    LazyColumn() {
        items(getPuppies()) { item ->
            PuppyCard(puppy = item, selectPuppy = selectPuppy)
        }
    }
}

@Composable
fun PuppyCard(puppy: Puppy, selectPuppy: (Int) -> Unit) {
    Card(
        content = {
            Text(
                text = "Ready... Set... GO! ${puppy.name}",
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                style = MaterialTheme.typography.body1,
            )
        },
        modifier = Modifier.clickable(onClick = {
            selectPuppy(puppy.age)
        })

    )
}

private fun getPuppies(): List<Puppy> {
    return (0 until 10).map { Puppy(it, "name: ${it}", "description: ${it}", it, "kind: ${it}") }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        HomeRoot(selectPuppy = {})
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        HomeRoot(selectPuppy = {})
    }
}

