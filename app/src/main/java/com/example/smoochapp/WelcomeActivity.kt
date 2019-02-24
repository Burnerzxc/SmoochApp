package com.example.smoochapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getStarted_btn.setOnClickListener {
            val leagueIntent = Intent(this,leagueActivity::class.java)
            startActivity(leagueIntent)
        }


    }
}
