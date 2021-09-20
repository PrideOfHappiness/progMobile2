package com.example.proteintracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proteintracker.adapter.PetaniAdapter
import com.example.proteintracker.adapter.PetaniCVAdapter
import com.example.proteintracker.model.Petani

class SampleCardView : AppCompatActivity() {
    private lateinit var rvCardView: RecyclerView
    private var list: ArrayList<Petani> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)
        rvCardView = findViewById(R.id.rvCardView)
        rvCardView.setHasFixedSize(true)
        list.addAll(dataRecycler.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCardView.layoutManager = LinearLayoutManager(this)
        val petaniCVAdapter = PetaniCVAdapter(list)
        rvCardView.adapter = petaniCVAdapter
    }
}