package com.example.homework

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private var listUser: MutableList<User> = mutableListOf()

    private val buttonSubmit by lazy {findViewById<Button>(R.id.TapButton)}
    private val editTextName by lazy {findViewById<EditText>(R.id.InputName)}
    private val editTextSecondName by lazy {findViewById<EditText>(R.id.InputSecondName)}
    private val editTextAge by lazy {findViewById<EditText>(R.id.InputAge)}
    private val textViewUser by lazy {findViewById<TextView>(R.id.textViewUser)}
    private val textViewList by lazy {findViewById<TextView>(R.id.showList)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initView()
    }

    private fun initView (){ buttonSubmit.setOnClickListener{
        val name = editTextName.text.toString()
        val secondName = editTextSecondName.text.toString()
        var age = Int
    } }

    private fun createUser(name: String, secondName: String, age: Int){
        val user = User(name, secondName, age)
        textViewUser.text = addUser(user)
    }
    private fun clearField() {
        editTextName.text.clear()
        editTextSecondName.text.clear()
        editTextAge.text.clear()
        fun showToast() {
            TODO("Not yet implemented")
        }

        fun initView()
        {
            buttonSubmit.setOnClickListener {
                val name = editTextName.text.toString()
                val secondName = editTextSecondName.text.toString()
                var age: Int

                try {
                    editTextAge.text.toString().toInt().also { age = it }
                    if (name.isEmpty() || secondName.isEmpty()) showToast() else createUser(name, secondName, age)
                    clearField()
                }catch (e: Exception) {
                    showToast()
                }
            }
        }
    }
    private  fun addUser(user: User): String {

        val resultText: String

        if(listUser.contains(user)){
            resultText = getString(R.string.already_been)
        } else {
            resultText = "${user.name} ${user.secondName} ${user.age}"
            listUser.add(user)
        }
        textViewList.text = listUser.toString()

        return resultText
    }
}