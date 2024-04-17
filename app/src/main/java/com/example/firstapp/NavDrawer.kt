package com.example.firstapp

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavDrawer(){

    val navigationController = rememberNavController()
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    val items = listOf(
        DrawerItem(Icons.Default.Person, "Profilo", 0 , false),
        DrawerItem(Icons.Default.Favorite, "Seguiti", 22 , true),
        DrawerItem(Icons.Default.ShoppingCart, "Negozi", 0 , false),
        DrawerItem(Icons.Default.Home, "Home", 0 , false),
        DrawerItem(Icons.Default.ArrowBack, "Logoff", 0 , false),
        DrawerItem(Icons.Default.Star, "SNKR", 0 , false)

    )

    var selectedItem by remember {
        mutableStateOf(items[0])
    }


    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {
                Column(
                    Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                )
                {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(Color(0xffffc107)),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            Modifier.wrapContentSize(),
                            verticalArrangement = Arrangement.SpaceAround,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.logo),
                                contentDescription = "logo pic",
                                modifier = Modifier
                                    .size(130.dp)
                                    .clip(CircleShape)
                            )

                            Text(
                                text = "yaboii",
                                Modifier
                                    .fillMaxWidth()
                                    .padding(top = 16.dp),
                                fontSize = 22.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                        Divider(
                            Modifier.align(Alignment.BottomCenter), thickness = 1.dp,
                            Color.DarkGray
                        )
                    }
                    items.forEach {

                        NavigationDrawerItem(label = { Text(text = it.option) },
                            selected = it == selectedItem,
                            onClick = {
                                selectedItem = it
                                scope.launch {
                                    drawerState.close()
                                }
                                var choice = it.option
                                Log.i("Credentials", choice)
                                navigationController.navigate(choice) {

                                }
                            },
                            modifier = Modifier.padding(horizontal = 16.dp),
                            icon = {
                                Icon(imageVector = it.icon, contentDescription = it.option)
                            },
                            badge = {
                                if (it.hasCount) {
                                    BadgedBox(badge = {
                                        Badge {
                                            Text(text = it.count.toString(), fontSize = 17.sp)
                                        }
                                    }){

                                    }

                                }
                            }
                        )
                    }
                }
            }
        }
    ){
        Scaffold(
            topBar = {
                val scope = rememberCoroutineScope()
                TopAppBar(


                    title = {
                        Text(text = "SDD")
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "Icon"
                            )
                        }
                    }
                )
            }){
            NavHost(navController = navigationController,
                startDestination = Screen.HomeScreen.route){
                composable(Screen.HomeScreen.route){ homepage(navigationController) }
                composable(Screen.LoginScreen.route){ LoginScreen(navigationController) }
                composable(Screen.ProfileScreen.route){ ProfileScreen(navigationController) }
                composable(Screen.SnkrScreen.route){ snkrScreen(navigationController) }
                composable(Screen.RegisterScreen.route){ RegisterScreen(navigationController) }

            }

        }
    }


}