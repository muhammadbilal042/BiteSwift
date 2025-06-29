package com.example.biteswift

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.biteswift.databinding.ActivityChooseLocationBinding
import java.util.zip.Inflater

class ChooseLocationActivity : AppCompatActivity() {
    lateinit var binding: ActivityChooseLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityChooseLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val locationlist = arrayOf("Faisalabad", "Karachi", "Lahore", "Multan")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationlist)
        val autoCompleteTextView = binding.Locationlist
        autoCompleteTextView.setAdapter(adapter)
        }
    }
