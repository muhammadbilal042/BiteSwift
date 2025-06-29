package com.example.biteswift.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.biteswift.Adapter.cart_list_adapter
import com.example.biteswift.R
import com.example.biteswift.databinding.FragmentCartBinding
import com.example.biteswift.databinding.FragmentHomefragmentBinding

class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartfoodNames = listOf("Herbal Pancake", "Fruit Salad", "Green Noddle", "Spacy fresh crab", "Green Noddle", "Spacy fresh crab")
        val cartprices = listOf("$5", "$6", "$7", "$8", "$7", "$8")
        val cartimages = listOf(R.drawable.banner1, R.drawable.fruit_salad, R.drawable.green_noddle, R.drawable.spacy_fresh_crab, R.drawable.green_noddle, R.drawable.spacy_fresh_crab)

        val adapter = cart_list_adapter(requireContext(), cartfoodNames, cartprices, cartimages)
        binding.CartListView.adapter = adapter

        return binding.root

    }

    companion object {
    }
}
