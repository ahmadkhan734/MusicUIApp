package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon : Int, val name:String)

val libraries = listOf<Lib>(
    Lib(R.drawable.ic_music_player_green, "Playlist"),
    Lib(R.drawable.ic_subscribe, "Artists"),
    Lib(R.drawable.baseline_mic_24, "Album"),
    Lib(R.drawable.baseline_library_music_24, "Songs"),
    Lib(R.drawable.ic_music_player_green, "Genre")
)
