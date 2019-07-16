package com.github.emilskadikis.androidcrashcourse.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.emilskadikis.androidcrashcourse.R
import com.github.emilskadikis.androidcrashcourse.activities.comic.ComicActivity
import com.github.emilskadikis.androidcrashcourse.activities.counter.CounterActivity
import com.github.emilskadikis.androidcrashcourse.activities.list.ListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOpenCounter.setOnClickListener {
            val intent = Intent(this, CounterActivity::class.java)
            intent.putExtra("CounterValue", 0)
            startActivity(intent)
        }

        buttonOpenList.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        buttonOpenComic.setOnClickListener {
            val intent = Intent(this, ComicActivity::class.java)
            startActivity(intent)
        }
    }
}
