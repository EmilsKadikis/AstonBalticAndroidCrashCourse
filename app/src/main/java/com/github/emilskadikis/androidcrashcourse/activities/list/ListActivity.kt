package com.github.emilskadikis.androidcrashcourse.activities.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.emilskadikis.androidcrashcourse.R
import com.github.emilskadikis.androidcrashcourse.repositories.FakeProductRepository
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        recyclerView.adapter = ListRecyclerViewAdapter(FakeProductRepository().getProducts())
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
