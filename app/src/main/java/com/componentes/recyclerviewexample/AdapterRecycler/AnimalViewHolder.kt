package com.componentes.recyclerviewexample.AdapterRecycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.componentes.recyclerviewexample.Model.Animal
import com.componentes.recyclerviewexample.R
import android.content.res.Resources

class AnimalViewHolder(view:View): RecyclerView.ViewHolder(view) {
    val name= view.findViewById<TextView>(R.id.tvNombre)
    val image= view.findViewById<ImageView>(R.id.ivAnimal)

    fun render(animal:Animal){
        name.text= animal.name
        image.setImageResource(animal.img)
    }
}