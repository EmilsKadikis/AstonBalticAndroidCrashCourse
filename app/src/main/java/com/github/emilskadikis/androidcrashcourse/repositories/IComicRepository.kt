package com.github.emilskadikis.androidcrashcourse.repositories

import com.github.emilskadikis.androidcrashcourse.data.Comic

interface IComicRepository {
    fun getLatestComic(): Comic
}