package com.ananda.post_3_pmob

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import  android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.ananda.post_3_pmob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  
  private lateinit var binding: ActivityMainBinding
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    
    binding.btnSubmit.setOnClickListener {
      val fullName = binding.fullName.text.toString().trim()
      val userName = binding.username.text.toString().trim()
      val age = binding.age.text.toString().trim()
      val email = binding.email.text.toString().trim()
      val password = binding.password.text.toString()
      val confirmPassword = binding.confirmPassword.text.toString()
      
      val selectedId = binding.gender.checkedRadioButtonId
      val gender = if (selectedId != -1){
        findViewById<RadioButton>(selectedId).text.toString()
      } else {
        ""
      }
      
      if(fullName.isEmpty() || userName.isEmpty() || age.isEmpty()||email.isEmpty()||password.isEmpty()||confirmPassword.isEmpty()|| gender
          .isEmpty()) {
        Toast.makeText(this, "Semua kolom harus diisi", Toast.LENGTH_SHORT).show()
        return@setOnClickListener
      }
      
      if(password != confirmPassword){
        Toast.makeText(this, "Password tidak sama", Toast.LENGTH_SHORT).show()
        return@setOnClickListener
      }
      
      val intent = Intent(this, ActivityResult::class.java).apply {
        putExtra("fullName", fullName)
        putExtra("userName", userName)
        putExtra("age", age)
        putExtra("email", email)
        putExtra("gender", gender)
      }
      
      startActivity(intent)
    }
    
    
  }
}