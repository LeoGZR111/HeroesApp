package com.example.heroesapp.models

import java.util.Locale.Category

data class Publisher(val id : Int, val name: String, val image: String){
    companion object{
        val categories = mutableListOf<Publisher>(
            Publisher(1, "Marvel", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjmHn7hDycWvYvGnj50dxygz2EUz8MBKKCqg&s"),
            Publisher(2, "DC", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/DC_Comics_logo.png/768px-DC_Comics_logo.png")
        )
    }
}
