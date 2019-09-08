package com.example.smack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class CreateUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar(view: View){
        Log.d("view", "view tag is ${view.tag}") // don't actually care and never set it
        //but this makes the warnings about not using 'view' stop

    }

    fun generateColorClicked(view: View) {
        Log.d("view", "view tag is ${view.tag}") // don't actually care and never set it
        //but this makes the warnings about not using 'view' stop
    }

    fun createUserClicked(view: View) {
        Log.d("view", "view tag is ${view.tag}") // don't actually care and never set it
        //but this makes the warnings about not using 'view' stop
    }
}
