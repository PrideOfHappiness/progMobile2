package com.example.proteintracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleList : AppCompatActivity() {
    lateinit var btnShow : Button
    lateinit var btnLahan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnShow = findViewById(R.id.btnShowList)
        btnLahan = findViewById(R.id.btnLahan)

        btnShow.setOnClickListener( { view ->
            var intent = Intent(this@SampleList, SampleListView::class.java)
            startActivity(intent)
        })

        btnLahan.setOnClickListener( { view ->
            var intent = Intent(this@SampleList, LahanDutaTani::class.java)
            startActivity(intent)
        } )
    }


}