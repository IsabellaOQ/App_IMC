package com.example.isabella_83588_nac01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.isabella_83588_nac01.databinding.ActivityImcBinding

class ActivityImc : AppCompatActivity() {

    private lateinit var binding: ActivityImcBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImcBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val imc = intent.getStringExtra("imc")

        with(binding){

                imcCalculado.text = "$imc"

            btSobremim2.setOnClickListener(){
                val intent = Intent(
                    this@ActivityImc ,
                    ActivitySobre::class.java
                )
                startActivity(
                    intent
                )

            }
            btVoltar.setOnClickListener(){
                val intent = Intent(
                    this@ActivityImc ,
                    MainActivity::class.java
                )

                startActivity(
                    intent
                )

            }

        }


    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart - Register")
    }

    override fun onResume() {
        super.onResume()
        Log.i("lifecycle", "onResume - Register")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle", "onPause - Register")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle", "onStop - Register")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle", "onDestroy - Register")
    }

    companion object {
        const val KEY_INTENT_USER = "user"
    }
}