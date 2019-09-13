package com.example.smack.controller

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.smack.R
import com.example.smack.services.AuthService
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profileDefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar(view: View){
        Log.d("view", "view tag is ${view.tag}") // don't actually care and never set it
        //but this makes the warnings about not using 'view' stop

        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        if (color == 0){
            userAvatar = "light$avatar"
        } else {
            userAvatar = "dark$avatar"
        }

        val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceId)

    }

    fun generateColorClicked(view: View) {
        Log.d("view", "view tag is ${view.tag}") // don't actually care and never set it
        //but this makes the warnings about not using 'view' stop

        val random = Random()
        val r = random.nextInt(256)
        val g = random.nextInt(256)
        val b = random.nextInt(256)

        createAvatarImageView.setBackgroundColor(Color.rgb(r, g, b))

        // In this case, we have to change the RGB 0-255 values to the 0-1 color encoding
        // This is cause they decided to save the avatarColor as 0-1 color for, I think because of iOS

        val savedR = r.toDouble() / 255
        val savedG = g.toDouble() /255
        val savedB = b.toDouble() /255

        avatarColor = "[$savedR, $savedG, $savedB]"

    }

    fun createUserClicked(view: View) {
        Log.d("view", "view tag is ${view.tag}") // don't actually care and never set it
        //but this makes the warnings about not using 'view' stop
        AuthService.registerUser(this,"hcs@me.com", "123456"){}
        // those curly braces at the end are the lambda function and you could actually add something in there like {complete ->
        //   if (complete) { [put code here])    but that's not required
    }
}
