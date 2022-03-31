package com.example.customertest.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.customertest.databinding.ActivityLoginBinding
import com.example.customertest.ui.EventListner

class LoginActivity : AppCompatActivity(), EventListner {

    private lateinit var binding: ActivityLoginBinding
    private val viewmodel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton6.setOnClickListener {
            viewmodel.getToken()
        }
    }
}