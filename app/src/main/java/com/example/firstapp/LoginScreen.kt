package com.example.firstapp

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun LoginScreen(navController: NavController){
    /*
    val fontFamily = FontFamily(
        Font(R.font.AlumniSans_Black),
        Font(R.font.AlumniSans_SemiBold),
        Font(R.font.AlumniSans_SemiBold),
        Font(R.font.AlumniSans_Bold),
        Font(R.font.AlumniSans_BlackItalic),
        Font(R.font.AlumniSans_BoldItalic),
        Font(R.font.AlumniSans_ExtraBold),
        Font(R.font.AlumniSans_ExtraBoldItalic),
        Font(R.font.AlumniSans_ExtraLight),
        Font(R.font.AlumniSans_ExtraLightItalic),
        Font(R.font.AlumniSans_Italic),
        Font(R.font.AlumniSans_Light),
        Font(R.font.AlumniSans_LightItalic),
        Font(R.font.AlumniSans_Medium),
        Font(R.font.AlumniSans_MediumItalic),
        Font(R.font.AlumniSans_Regular),
        Font(R.font.AlumniSans_SemiBoldItalic),
        Font(R.font.AlumniSans_Thin),
        Font(R.font.AlumniSans_ThinItalic)
    )

     */

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Login image",
             modifier = Modifier.size(200.dp))

        Text(
            text = "Rieccoti Sneakerhead",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold

        )
        
        Spacer(modifier = Modifier.height(15.dp))
        
        Text(text = "Effattua il login al tuo account")
        OutlinedTextField(value = email, onValueChange = { email = it
        }, label = { Text(text = "Indirizzo Email")})

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = password, onValueChange = {password = it
        }, label = { Text(text = "Password")}, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(15.dp))
        
        Button(onClick = {
            Log.i("Credentials", "Email : $email Password : $password")
            navController.navigate(Screen.HomeScreen.route)
        }) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(25.dp))


        Text(text = "Passworrd dimenticata?", modifier = Modifier.clickable {  })
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Registrati", modifier = Modifier.clickable { navController.navigate(Screen.RegisterScreen.route) })

    }


}