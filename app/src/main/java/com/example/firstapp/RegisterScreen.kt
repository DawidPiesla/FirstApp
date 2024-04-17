package com.example.firstapp

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
import androidx.navigation.NavController

@Composable
fun RegisterScreen(navController: NavController){

    var username by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var checkpassword by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Login image",
            modifier = Modifier.size(200.dp))
        Text(text = "Registrazione utente", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Compila i campi richiesti per registrarti")
        OutlinedTextField(value = username, onValueChange = { username = it},
            label = { Text(text = "Username")})
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = email, onValueChange = { email = it},
            label = { Text(text = "Indirizzo Email")})
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = password, onValueChange = { password = it},
            label = { Text(text = "Password")})
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = checkpassword, onValueChange = {checkpassword = it},
            label = { Text(text = "Conferma Password")})
        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {
            Log.i("Credentials", "Username : $username Email : $email Password : $password CheckPsw : $checkpassword")
        }) {
            Text(text = "Registrati")
        }
        Spacer(modifier = Modifier.height(25.dp))



        Text(text = "Login", modifier = Modifier.clickable { navController.navigate(Screen.LoginScreen.route) })

    }


}