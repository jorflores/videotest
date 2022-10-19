package com.example.pokerecycler

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// Objeto para modelar las palabras

@Parcelize
data class Palabras (
    val nombre: String,
    val local_video_url: Int?
        ) : Parcelable