package com.example.androiddevchallenge.ui.detail

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PuppyDetail(puppyId: Int) {
    val puppy = Puppy(puppyId, "", "", 0, "")
    MyTheme {
        DetailRoot(puppy = puppy)
    }
}

@Composable
fun DetailRoot(puppy: Puppy) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        topBar = { TopAppBar(title = { Text(text = "Puppies🐶") }) },
        content = { DetailContent(puppy) }
    )
}


@Composable
fun DetailContent(puppy: Puppy) {
    Text(text = "puppy id is ${puppy.id}")
}

@Preview("Detail Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        DetailRoot(puppy = Puppy(0, "", "", 0, ""))
    }
}
