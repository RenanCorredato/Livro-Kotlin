package com.masterclass.calculoaposentadoria

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.masterclass.calculoaposentadoria.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listSex = listOf("Masculino", "Feminino")

        binding.spnSex.adapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listSex)
//        val sex = binding.spnSex.selectedItem as String
//        val age = binding.tvEnterAge.text.toString().toInt()
//
//        var result = 0
//        if (sex == "Masculino"){
//            result = 65 - age
//        }else{
//            result = 60 - age
//        }

        binding.btCalc.setOnClickListener {
            Snackbar.make(binding.root, "Você que calcular alguam coisa ", Snackbar.LENGTH_SHORT).show()
        }
    }

}