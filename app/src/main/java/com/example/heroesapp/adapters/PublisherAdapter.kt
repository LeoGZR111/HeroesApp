package com.example.heroesapp.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso
import java.util.Locale.Category

class PublisherAdapter(val categoryList: List<Publisher>, val onClick:(Publisher)->Unit) : RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryList.count()
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categoryList[position]
        holder.categoryNameTV.text = category.name
        Picasso.get().load(category.image).into(holder.categoryImage)
        holder.itemView.setOnClickListener{
            //Log.i("PublisherAdapter", "Presionaste la categoria: ${category.name}")
            onClick(category)
        }
    }

}

class CategoryViewHolder(view : View) : ViewHolder(view){
    val categoryNameTV : TextView = view.findViewById(R.id.category_name)
    val categoryImage : ImageView = view.findViewById(R.id.category_image)
}