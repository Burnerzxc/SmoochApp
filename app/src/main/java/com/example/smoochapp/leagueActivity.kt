package com.example.smoochapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class leagueActivity : AppCompatActivity() {
    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        nextBtn.setOnClickListener {
          val  skillIntent = Intent(this, skillActivity::class.java)
            skillIntent.putExtra("extra_league",player)
            startActivity(skillIntent)
        }
    }
    fun mens_clicked(view: View){
        womens_Btn.isChecked = false
        coed_Btn.isChecked=false
        player.league = "men"
    }
    fun womens_clicked(view:View){
        mens_Btn.isChecked=false
        coed_Btn.isChecked=false
        player.league = "womens"
    }
    fun coed_clicked(view: View){
        mens_Btn.isChecked =false
        womens_Btn.isChecked=false
        player.league="coed"
    }
}
