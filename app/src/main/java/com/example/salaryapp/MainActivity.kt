package com.example.salaryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.salaryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textView2.visibility = View.VISIBLE
            var enterText = binding.editTextTextPersonName.text.toString()

            when(enterText) {
                Constance.director ->  {
                    val sergeyText = "your salary is ${Constance.directorSalary}"
                    binding.textView2.text = sergeyText
                }

                Constance.someone -> {
                    val someoneText = "your salary is ${Constance.someoneSalary}"
                    binding.textView2.text = someoneText
                }

                else -> {

                    binding.textView2.text = "hello"
                }
            }
        }
    }
}