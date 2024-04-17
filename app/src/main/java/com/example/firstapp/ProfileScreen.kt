package com.example.firstapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ContentAlpha

@Composable
fun ProfileScreen(navController: NavController) {

    Column(
        Modifier
            .padding(top = 60.dp)
            .fillMaxSize(),


    )
    {
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.profileback),
                contentDescription = null, // Puoi impostare la descrizione dell'immagine qui se necessario
                modifier = Modifier
                    .fillMaxSize()
                    .alpha(0.8f), // Opacità dell'immagine di sfondo
                contentScale = ContentScale.FillBounds
            )

            Column(
                Modifier.wrapContentSize(),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.baseline_face_24),
                    contentDescription = "logo pic",
                    modifier = Modifier
                        .size(130.dp)
                        .clip(CircleShape)
                )

            }
            Divider(
                Modifier.align(Alignment.BottomCenter), thickness = 1.dp,
                Color.DarkGray
            )
            

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(15.dp)){
            Column() {
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Username", fontSize = 20.sp, textAlign = TextAlign.Center)
                Text(text = "user123", fontSize = 16.sp, textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Email", fontSize = 20.sp, textAlign = TextAlign.Center)
                Text(text = "user@example.com", fontSize = 16.sp, textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Taglia", fontSize = 20.sp, textAlign = TextAlign.Center)
                Text(text = "M", fontSize = 16.sp, textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(30.dp))

            }

        }

        Button(
            modifier =Modifier
                .align(Alignment.CenterHorizontally)
                .width(200.dp)
            ,
            shape = RoundedCornerShape(20.dp),

            onClick = { /*TODO*/ }) {
            Text(text = "Modifica taglia")
        }

    }

}



