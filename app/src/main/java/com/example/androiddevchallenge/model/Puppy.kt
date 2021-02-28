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
        name = "breynard0",
        description = "Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.",
        age = 9,
        kind = "Ram 3500",
        imageUrl = "https://placedog.net/235/245"
    ),
    Puppy(
        id = 2,
        name = "jleynagh1",
        description = "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\n\nEtiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.\n\nPraesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.",
        age = 2,
        kind = "SL-Class",
        imageUrl = "https://placedog.net/161/247"
    ),
    Puppy(
        id = 3,
        name = "akenderdine2",
        description = "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.\n\nEtiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.",
        age = 7,
        kind = "GTI",
        imageUrl = "https://placedog.net/236/218"
    ),
    Puppy(
        id = 4,
        name = "trisman3",
        description = "Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.\n\nInteger tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.\n\nPraesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.",
        age = 5,
        kind = "Thunderbird",
        imageUrl = "https://placedog.net/326/235"
    ),
    Puppy(
        id = 5,
        name = "gcartman4",
        description = "Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.",
        age = 10,
        kind = "MX 5",
        imageUrl = "https://placedog.net/241/221"
    ),
    Puppy(
        id = 6,
        name = "amackimm5",
        description = "Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.",
        age = 4,
        kind = "E150",
        imageUrl = "https://placedog.net/159/250"
    ),
    Puppy(
        id = 7,
        name = "ocrebo6",
        description = "Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.\n\nFusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.\n\nSed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.",
        age = 8,
        kind = "Chariot",
        imageUrl = "https://placedog.net/134/157"
    ),
    Puppy(
        id = 8,
        name = "lironmonger7",
        description = "Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.",
        age = 4,
        kind = "Golf",
        imageUrl = "https://placedog.net/150/250"
    ),
    Puppy(
        id = 9,
        name = "bcrotty8",
        description = "Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.",
        age = 6,
        kind = "Liberty",
        imageUrl = "https://placedog.net/226/235"
    )
)
