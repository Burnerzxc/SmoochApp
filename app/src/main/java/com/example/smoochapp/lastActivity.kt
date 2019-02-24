package com.example.smoochapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_last.*

class lastActivity : AppCompatActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
         player = intent.getParcelableExtra("skill_league")
        lastText.text= "Looking for a player belongs to ${player.league} league with a skill level of ${player.skill}"

    }
}
