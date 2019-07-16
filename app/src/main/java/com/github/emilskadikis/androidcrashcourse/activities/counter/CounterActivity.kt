package com.github.emilskadikis.androidcrashcourse.activities.counter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import com.github.emilskadikis.androidcrashcourse.R

import kotlinx.android.synthetic.main.activity_counter.*

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        buttonPlus.setOnClickListener { view ->
            //TODO 1: Make the button increment the counter
        }

        //TODO 3: Create viewmodel and store the counter value there
    }
}
