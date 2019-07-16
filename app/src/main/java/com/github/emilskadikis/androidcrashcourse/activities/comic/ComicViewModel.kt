package com.github.emilskadikis.androidcrashcourse.activities.comic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.emilskadikis.androidcrashcourse.data.Comic
import com.github.emilskadikis.androidcrashcourse.repositories.FakeComicRepository
import com.github.emilskadikis.androidcrashcourse.repositories.IComicRepository

class ComicViewModel: ViewModel() {
    private val repository: IComicRepository = FakeComicRepository()

    private val _comic: MutableLiveData<Comic> = MutableLiveData()
    val comic: LiveData<Comic> = _comic

    fun loadComic() {
        if(_comic.value == null)
            _comic.value = repository.getLatestComic()
    }

}