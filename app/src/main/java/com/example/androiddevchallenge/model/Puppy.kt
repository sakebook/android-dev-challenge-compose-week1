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
package com.example.androiddevchallenge.model

data class Puppy(val id: Int, val name: String, val description: String, val age: Int, val kind: String, val imageUrl: String)

object PuppyRepo {
    fun getAllPuppy(): List<Puppy> {
        return puppies
    }

    fun getPuppyFromId(id: Int): Puppy? {
        return puppies.find { it.id == id }
    }
}

val puppies = listOf(
    Puppy(
        id = 1,
        name = "Max",
        description = "Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.",
        age = 9,
        kind = "Akita",
        imageUrl = "https://placedog.net/235/245"
    ),
    Puppy(
        id = 2,
        name = "Buddy",
        description = "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\n\nEtiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.\n\nPraesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.",
        age = 2,
        kind = "Collie",
        imageUrl = "https://placedog.net/161/247"
    ),
    Puppy(
        id = 3,
        name = "Jake",
        description = "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\n\nEtiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.",
        age = 7,
        kind = "Corgi",
        imageUrl = "https://placedog.net/236/218"
    ),
    Puppy(
        id = 4,
        name = "Bailey",
        description = "Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.\n\nInteger tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.\n\nPraesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.",
        age = 5,
        kind = "Golden Retriever",
        imageUrl = "https://placedog.net/326/235"
    ),
    Puppy(
        id = 5,
        name = "Rocky",
        description = "Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.",
        age = 10,
        kind = "Shepherd",
        imageUrl = "https://placedog.net/241/221"
    ),
    Puppy(
        id = 6,
        name = "Charlie",
        description = "Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.",
        age = 4,
        kind = "Shiba",
        imageUrl = "https://placedog.net/159/250"
    ),
    Puppy(
        id = 7,
        name = "Jack",
        description = "Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.\n\nFusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.\n\nSed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.",
        age = 8,
        kind = "Chariot",
        imageUrl = "https://placedog.net/134/157"
    ),
    Puppy(
        id = 8,
        name = "Toby",
        description = "Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.",
        age = 4,
        kind = "Siberian Husky",
        imageUrl = "https://placedog.net/150/250"
    ),
    Puppy(
        id = 9,
        name = "Cody",
        description = "Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.",
        age = 6,
        kind = "Schnauzer",
        imageUrl = "https://placedog.net/226/235"
    )
)
