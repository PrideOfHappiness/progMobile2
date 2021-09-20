package com.example.proteintracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class LahanDutaTani : AppCompatActivity() {

    lateinit var lvLahan : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lahan_duta_tani)
    }
}