package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroes
import com.squareup.picasso.Picasso

class HeroesAdapter(val heroesList : List<Heroes>, val onClick:(Heroes)->Unit) : RecyclerView.Adapter<HeroesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroe_item, parent, false)
        return HeroesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroesList.count()
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        val heroes = heroesList[position]
        holder.heroesName.text = heroes.name
        Picasso.get().load(heroes.image).into(holder.heroesImage)
        holder.itemView.setOnClickListener{
            onClick(heroes)
        }
    }

}

class HeroesViewHolder(view: View) : ViewHolder(view) {
    val heroesImage: ImageView = view.findViewById(R.id.heroes_image)
    val heroesName: TextView = view.findViewById(R.id.heroes_name)
}
