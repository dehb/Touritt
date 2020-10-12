package com.dehb.tourit

import android.media.Image

data class Site (
    val data: List<Places>
)
data class Places(
    val Name : String,
    val Location : String,
    val Image: Image,
    val Description: String
)