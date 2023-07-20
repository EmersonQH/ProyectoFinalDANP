package com.example.proyectofinaldanp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectofinaldanp.screens.FirstScreen
import com.example.proyectofinaldanp.screens.SecondScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =AppScreens.FirstSreen.route ){
        composable(route = AppScreens.FirstSreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondSreen.route){
            SecondScreen(navController)
        }
    }
}