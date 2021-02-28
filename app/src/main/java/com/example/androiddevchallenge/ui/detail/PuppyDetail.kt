package com.example.androiddevchallenge.ui.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.PuppyRepo
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppyDetail(puppyId: Int, upPress: () -> Unit) {
    val puppy = PuppyRepo.getPuppyFromId(puppyId)
    MyTheme {
        DetailRoot(puppy = puppy, upPress)
    }
}

@Composable
fun DetailRoot(puppy: Puppy?, onClick: () -> (Unit)) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        topBar = {
            TopAppBar(
                title = { Text(text = "\uD83D\uDD0DDetail") },
                navigationIcon = {
                    IconButton(onClick = onClick) {
                        Icon(Icons.Outlined.ArrowBack, "")
                    }
                }
            )
        },
        content = {
            if (puppy == null) {
                DetailErrorContent()
            } else {
                DetailContent(puppy)
            }
        }
    )
}

@Composable
fun DetailContent(puppy: Puppy) {
    val modifier = Modifier.padding(horizontal = 16.dp)
    LazyColumn(content = {
        item {
            CoilImage(
                data = puppy.imageUrl,
                contentDescription = "",
                fadeIn = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(320.dp),
                contentScale = ContentScale.Crop
            )
        }
        item {
            Text(
                text = "About",
                style = MaterialTheme.typography.h3,
                modifier = modifier
                    .padding(top = 8.dp),
            )
        }
        item {
            Text(
                text = puppy.name,
                style = MaterialTheme.typography.body1,
                modifier = modifier
                    .padding(top = 4.dp),
            )
        }
        item {
            Text(
                text = "${puppy.age} years",
                style = MaterialTheme.typography.body1,
                modifier = modifier
                    .padding(top = 4.dp),
            )
        }
        item {
            Text(
                text = puppy.kind,
                style = MaterialTheme.typography.body1,
                modifier = modifier
                    .padding(top = 4.dp),
            )
        }
        item {
            Text(
                text = "Story",
                style = MaterialTheme.typography.h3,
                modifier = modifier
                    .padding(top = 8.dp),
            )
        }
        item {
            Text(
                text = puppy.description,
                style = MaterialTheme.typography.body1,
                modifier = modifier
                    .padding(top = 4.dp),
            )
        }
    })
}

@Composable
fun DetailErrorContent() {
    Column() {
        Text(text = "Puppy is lost😢")
        Text(
            text = "Please back to content.",
            style = MaterialTheme.typography.subtitle2,
        )
    }
}

@Preview("Detail", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        DetailRoot(puppy = Puppy(0, "ジョン", "Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.", 0, "some", "https://placedog.net/326/235"), {})
    }
}

//@Preview("Detail Error", widthDp = 360, heightDp = 640)
//@Composable
//fun ErrorPreview() {
//    MyTheme {
//        DetailRoot(puppy = null, {})
//    }
//}
