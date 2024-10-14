package com.coba.uts_app_makanan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpActivity : AppCompatActivity() {
    private lateinit var btnSignUp2 : Button
    private lateinit var txtSignIn : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        btnSignUp2 = findViewById(R.id.btnSignUp2)
        txtSignIn = findViewById(R.id.txtSignIn)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtSignIn.setOnClickListener(){
            val intentMenu2 = Intent(this@SignUpActivity, LogInActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}