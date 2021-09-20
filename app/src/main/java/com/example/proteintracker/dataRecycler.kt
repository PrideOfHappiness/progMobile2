package com.example.proteintracker

import com.example.proteintracker.model.Petani

object dataRecycler {
    private var user = arrayOf(
        "F1",
        "F2",
        "F3",
        "F4"
    )
    private var nama = arrayOf(
        "Renaldi Soeryadi",
        "Renaldi Soeryadi",
        "Renaldi Soeryadi",
        "Renaldi Soeryadi"
    )

    private var jumlahLahan = arrayOf(
        "4",
        "3",
        "2",
        "1"
    )

    private var identifikasi = arrayOf(
        "2",
        "2",
        "1",
        "0"
    )

    private var tambahLahan = arrayOf(
        "2",
        "1",
        "1",
        "1"
    )

    val listData: ArrayList<Petani>
        get() {
            val list = arrayListOf<Petani>()
            for (position in dataRecycler.user.indices) {
                val petani = Petani()
                petani.user = dataRecycler.user[position]
                petani.nama = dataRecycler.nama[position]
                petani.jumlahLahan = dataRecycler.jumlahLahan[position]
                petani.identifikasi = dataRecycler.identifikasi[position]
                petani.tambahLahan = dataRecycler.tambahLahan[position]
                list.add(petani)
            }
            return list
        }
}
