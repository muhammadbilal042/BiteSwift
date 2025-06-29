package com.example.biteswift

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.biteswift.databinding.ActivitySignUpBinding
import com.example.biteswift.databinding.ActivityStartScreenBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding : ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.Alradyhavebtn.setOnClickListener {
           val intent = Intent(this, Login::class.java)
           startActivity(intent)
       }
        binding.creataccbtn.setOnClickListener {
            val intent = Intent(this, ChooseLocationActivity :: class.java)
            startActivity(intent)
        }
        }
    }
