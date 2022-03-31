package com.example.customertest

import Home
import Notification
import Tracking
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.firestore.FirebaseFirestore
import user



class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var homefragment : Home
    lateinit var trackfragment : Tracking
    lateinit var notifragment : Notification
    lateinit var userfragment : user

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homefragment  = Home()
        trackfragment = Tracking()
        notifragment  = Notification()
        userfragment = user()

        setCurrentFragment(homefragment)

        bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.menu_home->setCurrentFragment(homefragment)
                R.id.menu_track->setCurrentFragment(trackfragment)
                R.id.menu_noti->setCurrentFragment(notifragment)
                R.id.menu_user->setCurrentFragment(userfragment)
            }
            true
         }

    }

        // setting fragment that will be show in the main view
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFragment,fragment)
            commit()
        }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }




}
