package com.example.projeto_android_06_04.data.room.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity
data class Review (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val rating: Float,
    val comment: String,

    val bookId: Int
)







