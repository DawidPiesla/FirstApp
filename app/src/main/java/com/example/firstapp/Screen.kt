package com.example.firstapp

sealed class Screen(val route: String){
    object LoginScreen : Screen("Logoff")
    object RegisterScreen : Screen("register_screen")
    object HomeScreen : Screen("Home")
    object ProfileScreen : Screen("Profilo")
    object SnkrScreen : Screen("SNKR")



}