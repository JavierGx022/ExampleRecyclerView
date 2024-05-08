package com.componentes.recyclerviewexample.AdapterRecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.componentes.recyclerviewexample.Model.Animal
import com.componentes.recyclerviewexample.R

class AnimalAdapter(private val animalsList:List<Animal>): RecyclerView.Adapter<AnimalViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        return AnimalViewHolder(layoutInflater.inflate(R.layout.item_row, parent, false))
    }

    override fun getItemCount(): Int {
        return animalsList.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
         val item= animalsList[position]
        holder.render(item)
    }

}