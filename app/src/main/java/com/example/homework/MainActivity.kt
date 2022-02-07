package com.example.homework

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private val buttonSubmit by lazy { findViewById<Button>(R.id.TupButton) }
    private val editTextName by lazy { findViewById<EditText>(R.id.InputName) }
    private val editTextSecondName by lazy { findViewById<EditText>(R.id.InputSecondName) }
    private val editTextAge by lazy { findViewById<EditText>(R.id.InputAge) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initView()
    }
    private fun createUser (name: String, secondName: String, age: Int) {
        val user = User(name, secondName, age)
    }

    private fun initView() {
        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val secondName = editTextSecondName.text.toString()
            var age: Int = 0

            try{
                age = editTextAge.text.toString().toInt()
                if ( name.isEmpty() || secondName.isEmpty()) showToast() else createUser(name, secondName, age)}
            catch (e: Exception){
                showToast()
            }

        }
    }



    private fun showToast() {
        TODO("Not yet implemented")
    }
}












