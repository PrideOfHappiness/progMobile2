package com.example.proteintracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proteintracker.adapter.PetaniAdapter
import com.example.proteintracker.model.Petani

class SampleRecyclerView : AppCompatActivity() {
    private lateinit var rvSample: RecyclerView
    private var list: ArrayList<Petani> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_recycler_view)
        rvSample = findViewById(R.id.rvLatihan)
        rvSample.setHasFixedSize(true)
        list.addAll(dataRecycler.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvSample.layoutManager = LinearLayoutManager(this)
        val petaniAdapter = PetaniAdapter(list)
        rvSample.adapter = petaniAdapter
    }
}
