package com.example.proyectofinaldanp.navigation

sealed class AppScreens(val route: String){
    object FirstScreen: AppScreens(route ="first_screen")
    object SecondScreen: AppScreens(route ="second_screen")
    object ThirdScreen: AppScreens(route ="Third_screen")
    object ListScreen: AppScreens(route ="List_screen")
    object InforScreen: AppScreens(route ="Infor_screen")
    object BibliotecaScreen: AppScreens(route ="Biblioteca_screen")
    object RegadoScreen: AppScreens(route ="Regado_screen")
    object RegadoTerminadoScreen: AppScreens(route ="RegadoTerminado_screen")
    object SensorRegadoScreen: AppScreens(route ="SensorRegado_screen")

}
