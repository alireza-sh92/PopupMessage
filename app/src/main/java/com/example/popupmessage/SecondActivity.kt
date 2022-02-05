package com.example.popupmessage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.popupmessage.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    companion object {
        const val TAG = "SecondActivity"
    }

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val inputtedText = binding.textInput.editableText
        setContentView(binding.root)
        binding.buttonToastMaker.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            val recivedText = Intent()
            recivedText.putExtra("message", inputtedText.toString())
            setResult(RESULT_OK, recivedText)
            this.finish()
        }
    }
}