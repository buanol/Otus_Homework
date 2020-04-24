package com.example.otus_homework

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.colorFilm()
    }

    fun film1click(view: View) {
        val intent = Intent(this@MainActivity, NewPageActivity::class.java)
        intent.putExtra("name", 1)
        Storage.filmId = 1
        startActivity(intent)
        colorFilm()
    }

    fun film2click(view: View) {
        val intent = Intent(this@MainActivity, NewPageActivity::class.java)
        intent.putExtra("name", 2)
        Storage.filmId = 2
        startActivity(intent)
        colorFilm()
    }

    fun film3click(view: View) {
        val intent = Intent(this@MainActivity, NewPageActivity::class.java)
        intent.putExtra("name", 3)
        Storage.filmId = 3
        startActivity(intent)
        colorFilm()
    }

    fun inviteFriend(view: View) {
        val textMessage = "Hello, friend!"
        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_TEXT, textMessage)
        sendIntent.type = "text/plain"
        val title = resources.getString(R.string.app_name)
        val chooser = Intent.createChooser(sendIntent, title)
        startActivity(chooser)

    }

    fun colorFilm() {
        this.textFilm1.setTextColor(Color.BLACK)
        this.textFilm2.setTextColor(Color.BLACK)
        this.textFilm3.setTextColor(Color.BLACK)
        when (Storage.filmId) {
            1 -> this.textFilm1.setTextColor(Color.RED)
            2 -> this.textFilm2.setTextColor(Color.RED)
            3 -> this.textFilm3.setTextColor(Color.RED)
        }
    }

}
