package com.example.biteswift

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.biteswift.databinding.ActivityLoginBinding
import com.example.biteswift.databinding.ActivitySignUpBinding

class Login : AppCompatActivity() {
    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Donthavebtn.setOnClickListener {
            val intent = Intent(this, SignUpActivity :: class.java)
            startActivity(intent)
        }
        binding.loginbtn.setOnClickListener {
            val intent = Intent(this, ChooseLocationActivity :: class.java)
            startActivity(intent)
        }
        }
    }
