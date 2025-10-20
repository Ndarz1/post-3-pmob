package com.ananda.post_3_pmob

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ananda.post_3_pmob.databinding.ActivityResultBinding

class ActivityResult : AppCompatActivity() {
  
  private  lateinit var binding: ActivityResultBinding
  
  override fun onCreate(savedInstanceState: Bundle?) {
    
    super.onCreate(savedInstanceState)
    
    binding = ActivityResultBinding.inflate(layoutInflater)
    
    setContentView(binding.root)
    
  }
}