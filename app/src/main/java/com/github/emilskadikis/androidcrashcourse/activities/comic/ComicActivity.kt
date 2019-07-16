package com.github.emilskadikis.androidcrashcourse.activities.comic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.github.emilskadikis.androidcrashcourse.R
import com.github.emilskadikis.androidcrashcourse.data.Comic
import com.github.emilskadikis.androidcrashcourse.repositories.FakeComicRepository
import kotlinx.android.synthetic.main.activity_comic.*

class ComicActivity : AppCompatActivity() {

    lateinit var viewModel: ComicViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic)
        viewModel = ViewModelProviders.of(this).get(ComicViewModel::class.java)

        viewModel.comic.observe(this, object: Observer<Comic> {
            override fun onChanged(comic: Comic?) {
                if(comic != null) {
                    textViewComicTitle.text = comic.title
                }
            }
        })

        viewModel.loadComic()
        //TODO 8 (Advanced): load comic image and display it. Suggestion for two approaches: WebView or third part library Picasso.
    }
}
