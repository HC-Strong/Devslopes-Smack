package com.example.smack.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.smack.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked(view: View) {
        Log.d("view", "view tag is ${view.tag}") // don't actually care and never set it
        //but this makes the warnings about not using 'view' stop
    }

    fun loginCreateUserBtnClicked(view: View) {
        Log.d("view", "view tag is ${view.tag}") // don't actually care and never set it
        //but this makes the warnings about not using 'view' stop
        val createUserIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(createUserIntent)
    }
}
