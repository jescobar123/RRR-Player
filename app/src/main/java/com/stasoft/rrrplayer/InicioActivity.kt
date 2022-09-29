package com.stasoft.rrrplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.stasoft.rrrplayer.PrincipalActivity

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        startTimer()
    }
    fun startTimer(){
        object: CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {


            }

            override fun onFinish() {
                val intent = Intent(applicationContext, PrincipalActivity::class.java).apply{}
                startActivity(intent)

            }

        }.start()
    }
}