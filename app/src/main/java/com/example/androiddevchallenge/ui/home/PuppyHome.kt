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
package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.transform.RoundedCornersTransformation
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.PuppyRepo
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

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
        topBar = { TopAppBar(title = { Text(text = "\uD83D\uDC36Puppies") }) },
        content = { HomeContent(selectPuppy) }
    )
}

@Composable
fun HomeContent(selectPuppy: (Int) -> Unit) {
    PuppiesList(selectPuppy)
}

@Composable
fun PuppiesList(selectPuppy: (Int) -> Unit) {
    val puppies = PuppyRepo.getAllPuppy()
    LazyColumn() {
        items(puppies) { item ->
            PuppyCard(puppy = item, selectPuppy = selectPuppy)
        }
    }
}

@Composable
fun PuppyCard(puppy: Puppy, selectPuppy: (Int) -> Unit) {
    Card(
        content = {
            Row(modifier = Modifier.fillMaxWidth()) {
                CoilImage(
                    data = puppy.imageUrl,
                    contentDescription = "",
                    requestBuilder = {
                        transformations(RoundedCornersTransformation(topRight = 8.dp.value, bottomRight = 8.dp.value))
                    },
                    fadeIn = true,
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    contentScale = ContentScale.Crop

                ) {
                }
                Column() {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "🏷: ${puppy.name}",
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp).wrapContentWidth(),
                            style = MaterialTheme.typography.body1,
                        )
                        Text(
                            text = "🗓: ${puppy.age}years",
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp).width(100.dp),
                            style = MaterialTheme.typography.body1,
                            textAlign = TextAlign.Start
                        )
                    }
                    Text(
                        text = puppy.description,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                        style = MaterialTheme.typography.body2,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1
                    )
                }
            }
        },
        elevation = 1.dp,
        modifier = Modifier
            .clickable(
                onClick = {
                    selectPuppy(puppy.id)
                }
            )
            .padding(8.dp)

    )
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
