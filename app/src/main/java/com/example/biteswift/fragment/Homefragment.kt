package com.example.biteswift.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.biteswift.Adapter.Popular_Adapter
import com.example.biteswift.R
import com.example.biteswift.databinding.ActivitySignUpBinding
import com.example.biteswift.databinding.FragmentHomefragmentBinding


class Homefragment : Fragment() {

    private lateinit var binding : FragmentHomefragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomefragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imagelist = ArrayList<SlideModel>()
        imagelist.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imagelist.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
        imagelist.add(SlideModel(R.drawable.banner3, ScaleTypes.FIT))
        val imageslider=binding.imageSlider
        imageslider.setImageList(imagelist)
        imageslider.setImageList(imagelist, ScaleTypes.FIT)


        val foodNames = listOf("Herbal Pancake", "Fruit Salad", "Green Noddle", "Spacy fresh crab", "Green Noddle", "Spacy fresh crab")
        val prices = listOf("$5", "$6", "$7", "$8", "$7", "$8")
        val images = listOf(R.drawable.banner1, R.drawable.fruit_salad, R.drawable.green_noddle, R.drawable.spacy_fresh_crab, R.drawable.green_noddle, R.drawable.spacy_fresh_crab)

        val adapter = Popular_Adapter(requireContext(), foodNames, prices, images)
        binding.PopularRecyclerview.adapter = adapter


    }
    companion object {

    }
}