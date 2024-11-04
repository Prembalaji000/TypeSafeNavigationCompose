package com.example.typesafecomposenavigation

import kotlinx.serialization.Serializable

sealed interface Screens {

    @Serializable
    data object ScreenA : Screens

    @Serializable
    data object ScreenB : Screens

    @Serializable
    data object ScreenC : Screens

}