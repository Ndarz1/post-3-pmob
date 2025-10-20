package com.ananda.post_3_pmob

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ananda.post_3_pmob.databinding.ActivityResultBinding

class ActivityResult : AppCompatActivity() {
  
  private  lateinit var binding: ActivityResultBinding
  
  @SuppressLint("SetTextI18n")
  override fun onCreate(savedInstanceState: Bundle?) {
    
    super.onCreate(savedInstanceState)
    
    binding = ActivityResultBinding.inflate(layoutInflater)
    
    setContentView(binding.root)
    
    val fullName = intent.getStringExtra("fullName")
    val userName = intent.getStringExtra("userName")
    val age = intent.getStringExtra("age")
    val email = intent.getStringExtra("email")
    val gender = intent.getStringExtra("gender")
    
    binding.fullNameResult.text = "Full Name: $fullName"
    binding.usernameResult.text = "Username: $userName"
    binding.ageResult.text = "Age: $age"
    binding.emailResult.text = "Email: $email"
    binding.genderResult.text = "Gender: $gender"
    
    
  }
}