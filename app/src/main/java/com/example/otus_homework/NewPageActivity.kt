package com.example.otus_homework

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
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
        val builder = AlertDialog.Builder(this@NewPageActivity)
        builder.setMessage("Хотите выйти из описания?")
        builder.setCancelable(true)
        builder.setNegativeButton("Нет") { dialog, which -> dialog.cancel() }

        builder.setPositiveButton("Да") { dialog, which ->
            val checkBox = findViewById<CheckBox>(R.id.checkBoxFilm)
            if (checkBox.isChecked) {
                Log.i("CHECK_FILM", "Checked film - " + Storage.filmId)
            } else {
                Log.i("CHECK_FILM", "Don,t checked film - " + Storage.filmId)
            }
            val comment = findViewById<EditText>(R.id.commentFilm)
            if (comment.text.toString() == "") {
                Log.i("COMMENT_FILM", "User not commented")
            } else {
                Log.i("COMMENT_FILM", "User commented - " + comment.text.toString())
            }
            finish() }

            builder.create().show()
    }
}