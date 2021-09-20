package com.example.proteintracker.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proteintracker.R
import com.example.proteintracker.model.Petani

class PetaniHolder(view: View) : RecyclerView.ViewHolder(view){
    lateinit var txtUser: TextView
    lateinit var txtNama: TextView
    lateinit var txtJumlahLahan: TextView
    lateinit var txtIdentifikasi: TextView
    lateinit var txtTambahLahan: TextView

    fun bindPetani(petani: Petani){
        itemView.apply {
            txtUser = findViewById(R.id.txtUser2)
            txtNama = findViewById(R.id.txtNama)
            txtJumlahLahan = findViewById(R.id.txtJumlahLahan)
            txtIdentifikasi = findViewById(R.id.txtIdentifikasi)
            txtTambahLahan = findViewById(R.id.txtTambahLahan)

            txtUser.text = petani.user
            txtNama.text = petani.nama
            txtJumlahLahan.text = petani.jumlahLahan
            txtIdentifikasi.text = petani.identifikasi
            txtTambahLahan.text = petani.tambahLahan
        }
    }
}

class PetaniAdapter: RecyclerView.Adapter<com.example.proteintracker.adapter.PetaniAdapter.PetaniHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetaniAdapter.PetaniHolder {
        return PetaniHolder(LayoutInflater.from(parent.context).inflate(R.layout.))
    }

    override fun onBindViewHolder(holder: PetaniAdapter.PetaniHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

