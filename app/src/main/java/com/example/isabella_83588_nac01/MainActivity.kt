package com.example.isabella_83588_nac01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.example.isabella_83588_nac01.databinding.ActivityImcBinding
import com.example.isabella_83588_nac01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {


            var preencher = R.string.preencher

            Calcular.setOnClickListener(){

                var entradaPeso = EntradaPeso.text.toString()
                var entradaAltura = EntradaAltura.text.toString()

                if (entradaPeso.isEmpty() || entradaAltura.isEmpty()) {
                        if(entradaPeso.isEmpty()){

                            EntradaPeso.setHint(preencher)
                        }

                        if(entradaAltura.isEmpty()){
                            EntradaAltura.setHint(preencher)
                        }

                } else {

                    var saidaPeso = entradaPeso.toDouble()
                    var saidaAltura = entradaAltura.toDouble()

                    var imcE = saidaPeso / (saidaAltura*saidaAltura)
                    var imc = String.format("%.1f", imcE)

                val intent = Intent(
                    this@MainActivity,
                    ActivityImc::class.java
                )

                    intent.putExtra("imc", imc)


                startActivity(
                    intent
                )
            }
            }

            SobreMim.setOnClickListener(){
                val intent = Intent(
                    this@MainActivity,
                    ActivitySobre::class.java
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
