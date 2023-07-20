package com.example.proyectofinaldanp.navigation

sealed class AppScreens(val route: String){
    object FirstSreen: AppScreens(route ="first_screen")
    object SecondSreen: AppScreens(route ="second_screen")

}
