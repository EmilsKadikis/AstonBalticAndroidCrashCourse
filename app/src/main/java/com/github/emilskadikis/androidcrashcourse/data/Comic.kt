package com.github.emilskadikis.androidcrashcourse.data

import kotlinx.serialization.Serializable

@Serializable
data class Comic(
    val year: Int,
    val month: Int,
    val day: Int,
    val num: Int,
    val img: String,
    val title: String,
    val alt: String
)
