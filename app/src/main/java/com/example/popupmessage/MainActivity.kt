package com.example.popupmessage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.popupmessage.databinding.ActivityMainBinding
import com.example.popupmessage.databinding.ActivitySecondBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, 2000)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val result: String? = data?.getStringExtra("message")
        Toast.makeText(this, result, Toast.LENGTH_LONG).show()

    }
}