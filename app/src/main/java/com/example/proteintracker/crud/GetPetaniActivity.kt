package com.example.proteintracker.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proteintracker.R
import com.example.proteintracker.adapter.ResponsePetaniAdapter
import com.example.proteintracker.model.DataItem
import com.example.proteintracker.model.ResponsePetani
import com.example.proteintracker.network.NetworkConfig
import com.google.android.material.floatingactionbutton.FloatingActionButton
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetPetaniActivity : AppCompatActivity() {
        lateinit var rvPetani : RecyclerView
        lateinit var fabAddPetani : FloatingActionButton

    override fun onRestart() {
        super.onRestart()

        rvPetani = findViewById(R.id.rvPetani)
        fabAddPetani = findViewById(R.id.fabAddPetani)

        NetworkConfig().getService()
            .getPetaniAll()
            .enqueue(object : Callback<ResponsePetani>{
                override fun onFailure(call: Call<ResponsePetani>, t: Throwable) {
                    Toast.makeText(this@GetPetaniActivity, t.localizedMessage, Toast.LENGTH_SHORT)
                }

                override fun onResponse(
                    call: Call<ResponsePetani>,
                    response: Response<ResponsePetani>
                ) {
                    rvPetani.apply{
                        layoutManager = LinearLayoutManager ( this@GetPetaniActivity)
                        adapter = ResponsePetaniAdapter(response.body()?.data as List<DataItem>?)
                    }
                }
            })

        fabAddPetani.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@GetPetaniActivity, AddPetaniActivity::class.java)
            startActivity(intent)
        })
        }
    }
