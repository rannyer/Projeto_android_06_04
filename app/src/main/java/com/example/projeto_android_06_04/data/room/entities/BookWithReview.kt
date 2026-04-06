package com.example.projeto_android_06_04.data.room.entities

import androidx.room.Embedded
import androidx.room.Relation

data class BookWithReview(
    @Embedded val book: Book,

    @Relation(
        parentColumn = "id",
        entityColumn = "bookId"
    )

    val reviews: List<Review>
)