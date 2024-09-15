package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroesAdapter
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Heroes
import com.example.heroesapp.models.Publisher

class HeroesActivity : AppCompatActivity() {
    lateinit var categoryTitle : TextView
    lateinit var heroesRecyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)

        categoryTitle = findViewById(R.id.category_title)
        heroesRecyclerView = findViewById(R.id.heroes_recyclerview)

        val categoryId = intent.getIntExtra("categoryId", 0)
        //Log.i("HeroesActivity", "El Id es: ${categoryId}")
        val category = Publisher.categories.firstOrNull{ category -> category.id == categoryId }
        Log.i("HeroesActivity",category.toString())
        categoryTitle.text = category?.name

        val heroes = Heroes.heroes.filter { heroes -> heroes.heroeId == categoryId}
        Log.i("HeroesActivity",heroes.toString())
        heroesRecyclerView.adapter = HeroesAdapter(heroes){ heroes ->
            val intetn = Intent(this@HeroesActivity,HeroeDetailActivty::class.java)
            intetn.putExtra("heroesId",heroes.id)
            startActivity(intetn)


        }
        heroesRecyclerView.layoutManager = GridLayoutManager(this,2)


    }
}
