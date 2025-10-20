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
    
    val name = intent.getStringExtra(DATA_NAMA)
    val jenisKelamin = intent.getStringExtra(DATA_KELAMIN)
    val resultAcc = intent.getBooleanExtra(DATA_ACC, false)
    
    binding.apply {
      tampilNama.text = name
      tampilJenisKelamin.text = jenisKelamin
      if (jenisKelamin == "Laki - laki"){
        tampilJenisKelamin.setBackgroundColor(Color.GRAY)
      }
      if (jenisKelamin == "Perempuan") {
        tampilJenisKelamin.setBackgroundColor(Color.MAGENTA)
      }
      if (resultAcc == true) {
        tampilSetuju.setText("Data yang diisikan benar")
        tampilSetuju.setBackgroundColor(Color.GREEN)
      } else {
        tampilSetuju.setText("Ada yang salah")
        tampilSetuju.setBackgroundColor(Color.RED)
      }
    }
    
  }
  
  companion object {
    const val DATA_NAMA = "data_nama"
    const val DATA_KELAMIN = "data_kelamin"
    const val DATA_ACC = "data_acc"
  }
}