package com.ananda.post_3_pmob

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ananda.post_3_pmob.ActivityResult.Companion.DATA_ACC
import com.ananda.post_3_pmob.ActivityResult.Companion.DATA_KELAMIN
import com.ananda.post_3_pmob.ActivityResult.Companion.DATA_NAMA
import com.ananda.post_3_pmob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  
  private lateinit var binding: ActivityMainBinding
  private var jenisKelamin = ""
  private var accBtn = true
  
  override fun onCreate(savedInstanceState: Bundle?) {
    
    
    
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    
    setContentView(binding.root)
    
 
    
  }
}