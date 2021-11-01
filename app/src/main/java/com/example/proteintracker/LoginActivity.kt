package com.example.proteintracker

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.proteintracker.crud.GetPetaniActivity

class LoginActivity : AppCompatActivity() {
    lateinit var edUsername : EditText
    lateinit var edPassword : EditText
    lateinit var btnLogin : Button
    lateinit var shredRef : SharedPreferences
    val prefs_name  = "session_login"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edUsername = findViewById(R.id.edUsername)
        edPassword = findViewById(R.id.edPassword)
        btnLogin = findViewById(R.id.btnLogin)

        shredRef = getSharedPreferences(prefs_name, Context.MODE_PRIVATE)

        //Membaca data ke GetPetaniActivity
        var tmpEmail = shredRef.getString("email", null)
        var tmpPassword = shredRef.getString("password", null)

        if(!tmpEmail.isNullOrEmpty() && !tmpPassword.isNullOrBlank()){
            finish()
            var intent = Intent(this@LoginActivity, GetPetaniActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener(View.OnClickListener { view ->
            val sharedEditor : SharedPreferences.Editor = shredRef.edit()
            sharedEditor.putString("email", edUsername.text.toString())
            sharedEditor.putString("password", edPassword.text.toString())
            sharedEditor.apply()
            finish()
            var intent = Intent(this@LoginActivity, GetPetaniActivity::class.java)
            startActivity(intent)
        })
    }
}