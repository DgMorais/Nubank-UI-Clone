package com.nubank.nubankclone

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nubank.nubankclone.databinding.ActivityMainBinding
import com.bumptech.glide.Glide
import com.nubank.nubankclone.view.HomeActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        actionBar?.hide()

        /* Biblioteca Glide para animações com GIF
           Glide.with(applicationContext)
            .load("https://inthecheesefactory.com/uploads/source/glidepicasso/gifanimation2.gif")
            .into(binding.imageLogo); */

        Handler().postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }, 3000)

    }
}