package com.componentes.recyclerviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.componentes.recyclerviewexample.AdapterRecycler.AnimalAdapter
import com.componentes.recyclerviewexample.Model.AnimalList
import com.componentes.recyclerviewexample.databinding.FragmentShowListAnimalsBinding


class ShowListAnimals : Fragment() {

    private var _binding: FragmentShowListAnimalsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentShowListAnimalsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }


    private fun initRecycler(){
        binding.rvAnimals.layoutManager= LinearLayoutManager(requireContext())
        binding.rvAnimals.adapter= AnimalAdapter(AnimalList.listAnimals)
    }


}