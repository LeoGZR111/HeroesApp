package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroesAdapter
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Heroes
import com.example.heroesapp.models.Publisher
import com.example.heroesapp.models.User

class HomeActivity : AppCompatActivity() {
    lateinit var usernameTV : TextView
    lateinit var logoutBtn : ImageView
    lateinit var categoryRecyclerView : RecyclerView
    lateinit var heroeRecyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home2)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)
        categoryRecyclerView = findViewById(R.id.category_recycle)
        heroeRecyclerView = findViewById(R.id.heroes_recyclerview)

        categoryRecyclerView.adapter = PublisherAdapter(Publisher.categories) { category ->
            Log.i("Categoria desde Home", category.name)
            val intent = Intent(this@HomeActivity,HeroesActivity::class.java)
            intent.putExtra("categoryId", category.id)
            startActivity(intent)
        }
        heroeRecyclerView.adapter = HeroesAdapter(Heroes.heroes){ heroes: Heroes ->
            val intent = Intent(this@HomeActivity,HeroeDetailActivty::class.java)
            intent.putExtra("heroesId", heroes.id)
            startActivity(intent)
        }

        categoryRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        heroeRecyclerView.layoutManager = GridLayoutManager(this,2)

        val user = User.users[0]
        usernameTV.text = user.computedName
        logoutBtn.setOnClickListener{
            Log.i("LOGOUT", "Cerrando sesion")
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}