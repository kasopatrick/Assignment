package com.example.assignment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class Contacts : AppCompatActivity() {
    lateinit var mContacts: ListView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContacts = findViewById(R.id.mContacts)
        mContacts.setOnItemClickListener { adapterView, view, i, l ->
            val name = adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        }



    }
}