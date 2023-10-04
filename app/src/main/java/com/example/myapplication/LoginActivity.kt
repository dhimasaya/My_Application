package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        //instance

        val btnLogin:Button = findViewById(R.id.button2)
        val txtUsername:EditText = findViewById(R.id.editTextTextEmailAddress2)
        val txtPassword:EditText = findViewById(R.id.editTextTextPassword)
        val logObj = Login()

        btnLogin.setOnClickListener {
            //input
            logObj.username = txtUsername.text.toString()
            logObj.password = txtUsername.text.toString()

            //membuat validasi
            if(logObj.loginCheck() == true) {
                val intentLogin = Intent(this,HomeActivity::class.java)
                startActivity(intentLogin)
            } else {
                Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show()
            }
       }









    }
}