package com.example.proteintracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleList : AppCompatActivity() {
    lateinit var btnShow : Button
    lateinit var btnCard : Button
    lateinit var btnRecycle : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnShow = findViewById(R.id.btnShowList)
        btnRecycle = findViewById(R.id.btnSampleRV)
        btnCard = findViewById(R.id.SampleCardView)

        btnShow.setOnClickListener( { view ->
            var intent = Intent(this@SampleList, SampleListView::class.java)
            startActivity(intent)
        })

        btnRecycle.setOnClickListener( { view ->
            var intent= Intent(this@SampleList, SampleRecyclerView::class.java)
            startActivity(intent)
        } )

        btnCard.setOnClickListener( { view ->
            var intent= Intent(this@SampleList, SampleCardView::class.java)
            startActivity(intent)
        } )
    }


}