package com.example.proteintracker.model

import com.google.gson.annotations.SerializedName

data class ResponseAddPetani(
    @field:SerializedName("data")
    val data: List<DataItem?>? = null,

    @field:SerializedName("status")
    val status: String? = null
)