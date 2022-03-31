package com.example.customertest.ui.homechoice

import Tracking
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.customertest.R

class TrackingStatus: AppCompatActivity(){

    override fun onCreate(saveInstanceState: Bundle?){
        super.onCreate(saveInstanceState)
        setContentView(R.layout.trackingstatus)

        val map = findViewById<Button>(R.id.getmaplocation)
        val back = findViewById<Button>(R.id.back)

        map.setOnClickListener{
            Toast.makeText(applicationContext,"Get location on Map", Toast.LENGTH_SHORT
            ).show()
            return@setOnClickListener
        }

        back.setOnClickListener{
            val intent = Intent(this,Tracking::class.java)
            startActivity(intent)
            return@setOnClickListener
        }


    }
}