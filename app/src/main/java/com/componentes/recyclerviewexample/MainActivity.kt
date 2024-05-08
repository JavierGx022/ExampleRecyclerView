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
        val fragment= ShowListAnimals()

        binding.btnFragment.setOnClickListener {
            if (!fragment.isAdded) {
                supportFragmentManager.beginTransaction()
                    .add(R.id.main, fragment)
                    .commit()
            }
        }

        binding.btnHide.setOnClickListener {
            if (fragment.isAdded) {
                supportFragmentManager.beginTransaction()
                    .remove(fragment)
                    .commit()
            }
        }



    }


}