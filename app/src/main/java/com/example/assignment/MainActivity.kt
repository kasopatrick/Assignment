package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Website
import android.provider.ContactsContract.Contacts
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mBtnCalclutor:Button
    lateinit var mBtnContacts: Button
    lateinit var mBtnWebsite: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnCalclutor.setOnClickListener {
            val leta = Intent(this,Calculator::class.java)
            startActivity(leta)


        }
        mBtnContacts.setOnClickListener {
            val bring = Intent(this,Calculator::class.java)
            startActivity(bring)


        }
        mBtnWebsite.setOnClickListener {
            val tembea = Intent(this,com.example.assignment.Website::class.java)
            startActivity(tembea)

        }
    }
}