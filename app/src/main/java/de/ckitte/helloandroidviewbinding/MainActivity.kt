package de.ckitte.helloandroidviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import de.ckitte.helloandroidviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cmdbutton.setOnClickListener {
            //Toast.makeText(it.context,"Buh",Toast.LENGTH_LONG).show()
            binding.tvAusgabe.text=binding.etEingabe.editableText
        }
    }
}