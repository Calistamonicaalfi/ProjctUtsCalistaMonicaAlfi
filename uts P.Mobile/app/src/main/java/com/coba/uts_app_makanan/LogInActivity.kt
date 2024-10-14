package com.coba.uts_app_makanan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogInActivity : AppCompatActivity() {
    private lateinit var btnLogin2 : Button
    private lateinit var txtSignUp : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_in)

        btnLogin2 = findViewById(R.id.btnLogIn2)
        txtSignUp = findViewById(R.id.txtSignUp)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLogin2.setOnClickListener(){
            val intentMenu2 = Intent(this@LogInActivity, RecycleMakanan::class.java)
            startActivity(intentMenu2)
        }

        txtSignUp.setOnClickListener(){
            val intentMenu2 = Intent(this@LogInActivity, SignUpActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}