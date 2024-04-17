package com.example.firstapp


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Navigation(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route ){
        composable(route = Screen.LoginScreen.route){
            LoginScreen(navController = navController)
        }

        composable(route = Screen.RegisterScreen.route){
            RegisterScreen(navController = navController)
        }

        composable(route = Screen.HomeScreen.route){
            homepage(navController = navController)
        }

        composable(route = Screen.ProfileScreen.route){
            ProfileScreen(navController = navController)
        }

        composable(route = Screen.SnkrScreen.route){
            snkrScreen(navController = navController)
        }



    }
}

