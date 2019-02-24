package com.example.smoochapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class skillActivity : AppCompatActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player=intent.getParcelableExtra("extra_league")
        submitBtn.setOnClickListener {
            var lastIntent = Intent(this,lastActivity::class.java)
            lastIntent.putExtra("skill_league",player)
            startActivity(lastIntent)
        }
    }
    fun begineerBtn_clicked(view:View){
        player.skill = "Begineer"
        ballerBtn.isChecked=false
    }
    fun ballerBtn_clicked(view: View){
        player.skill="Baller"
        begineerBtn.isChecked=false
    }
}
