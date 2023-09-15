package com.test.howlook.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.test.howlook.R
import com.test.howlook.databinding.ActivityMainBinding
import com.test.howlook.ui.community.CommunityFragment
import com.test.howlook.ui.myinfo.MyInfoFragment
import com.test.howlook.ui.upload.UploadFragment

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        replaceFragment(UploadFragment())

        activityMainBinding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(UploadFragment())
                R.id.profile -> replaceFragment(MyInfoFragment())
                R.id.community -> replaceFragment(CommunityFragment())

                else -> {

                }
            }
            true
        }
    }

    fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainContainer,fragment)
        fragmentTransaction.commit()
    }
}