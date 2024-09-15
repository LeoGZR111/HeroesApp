package com.example.heroesapp.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroes
import com.squareup.picasso.Picasso

class HeroeDetailActivty : AppCompatActivity() {
    lateinit var heroesTextView: TextView
    lateinit var heroesDescription : TextView
    lateinit var heroesImageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroe_detail_activty)
        heroesTextView = findViewById(R.id.heroe_title)
        heroesImageView = findViewById(R.id.heroes_image)
        heroesDescription = findViewById(R.id.heroe_description)
        val heroesId = intent.getIntExtra("heroesId", 0)

        val  heroes = Heroes.heroes.firstOrNull{ heroes: Heroes ->
            heroes.id == heroesId
        }

        heroesTextView.text = heroes?.name
        Picasso.get().load(heroes?.image).into(heroesImageView)
        heroesDescription.text = heroes?.description
    }
}
