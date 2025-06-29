package com.example.biteswift.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.biteswift.Adapter.CartAdapter
import com.example.biteswift.R
import com.example.biteswift.databinding.FragmentCartBinding
import com.example.biteswift.databinding.FragmentHomefragmentBinding
import kotlinx.serialization.Required

class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartfoodNames = listOf("Herbal Pancake", "Fruit Salad", "Green Noddle", "Spacy fresh crab",
            "Green Noddle", "Spacy fresh crab","Spacy fresh crab", "Green Noddle", "Spacy fresh crab")
        val cartprices = listOf("$5", "$6", "$7", "$8", "$7", "$8","$8", "$7", "$8")
        val cartimages = listOf(R.drawable.banner1, R.drawable.fruit_salad, R.drawable.green_noddle,
            R.drawable.spacy_fresh_crab, R.drawable.green_noddle, R.drawable.spacy_fresh_crab,
            R.drawable.spacy_fresh_crab, R.drawable.green_noddle, R.drawable.spacy_fresh_crab)


        val adapter = CartAdapter(ArrayList(cartfoodNames), ArrayList(cartprices), ArrayList(cartimages))
        binding.CartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.CartRecyclerView.adapter = adapter

        return binding.root

    }

    companion object {
    }
}
