package com.example.otus_homework

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_new_page.*

class NewPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_page)

        when (this.intent.getIntExtra("name", 0)) {
            1 -> {
                this.filmViev.setImageResource(R.drawable.shindler_4)
                this.filmDescription.setText(R.string.film1description)
            }
            2 -> {
                this.filmViev.setImageResource(R.drawable.godfather_1)
                this.filmDescription.setText(R.string.film2description)
            }
            3 -> {
                this.filmViev.setImageResource(R.drawable.darkknight_3)
                this.filmDescription.setText(R.string.film3description)
            }
        }
    }
    override fun onBackPressed() {
        if (checkBoxFilm.isChecked) {
            Log.i("CHECK_FILM", "Checked film - " + Storage.filmId)
        } else {
            Log.i("CHECK_FILM", "Don,t checked film - " + Storage.filmId)
        }
        if (commentFilm.text.toString() == "") {
            Log.i("COMMENT_FILM", "User not commented")
        } else {
            Log.i("COMMENT_FILM", "User commented - " + commentFilm.text.toString())
        }
        finish()
    }

}