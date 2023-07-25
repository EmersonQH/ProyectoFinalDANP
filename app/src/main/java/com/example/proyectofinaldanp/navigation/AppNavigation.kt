package com.example.proyectofinaldanp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectofinaldanp.screens.*


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =AppScreens.FirstScreen.route ){
        composable(route = AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreens.ThirdScreen.route){
            ThirdScreen(navController)
        }
        composable(route = AppScreens.ListScreen.route){
            ListScreen(navController)
        }
        composable(route = AppScreens.InforScreen.route){
            InforScreen(navController)
        }
    }
}