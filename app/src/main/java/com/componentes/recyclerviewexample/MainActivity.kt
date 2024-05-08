package com.componentes.recyclerviewexample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.componentes.recyclerviewexample.AdapterRecycler.AnimalAdapter
import com.componentes.recyclerviewexample.Model.AnimalList
import com.componentes.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFragment.setOnClickListener {
            val fragment= ShowListAnimals()

            supportFragmentManager.beginTransaction()
                .add(R.id.main, fragment)
                .commit()
        }



    }


}