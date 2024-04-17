package com.example.firstapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun snkrScreen(navController: NavController){


    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(60.dp))

        Text(text = "Jordan1 High Electro Orange", fontSize = 25.sp, fontStyle = FontStyle.Italic)

        Row (modifier = Modifier
            .fillMaxWidth()
            .height(150.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(modifier = Modifier
                .height(80.dp)
                .width(150.dp)
                .border(2.dp, color = Color.Black, shape = RoundedCornerShape(bottomEnd = 60.dp, topStart = 40.dp)),
                shape = RoundedCornerShape(bottomEnd = 60.dp, topStart = 40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green,
                    contentColor = Color.White
                ),

                onClick = { /*TODO*/ }) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Compra", fontWeight = FontWeight.Bold, fontSize = 29.sp)
                    Text(text = "220€", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }

            }

            Button(modifier = Modifier
                .height(80.dp)
                .width(150.dp)
                .border(2.dp, color = Color.Black, shape = RoundedCornerShape(bottomEnd = 40.dp, topStart = 60.dp)),
                shape = RoundedCornerShape(topStart = 60.dp, bottomEnd = 40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White
                ),

                onClick = { /*TODO*/ }) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Vendi", fontWeight = FontWeight.Bold, fontSize = 30.sp)
                    Text(text = "200€", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
            }


            }
            Button(modifier = Modifier
                .height(60.dp)
                .width(87.dp)
                .border(2.dp, color = Color.Black, shape = RectangleShape),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White,
                ),

                onClick = { /*TODO*/ }) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly,
                ) {
                    Text(text = "Taglia", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    Text(text = "10,5", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(id = R.drawable.jone_ornage),
                    contentDescription = null, // Puoi impostare la descrizione dell'immagine qui se necessario
                    // modifier = Modifier
                    //.fillMaxSize()
                )
                Divider(Modifier.align(Alignment.BottomCenter), thickness = 1.dp, Color.DarkGray)
            }
        }
        Spacer(modifier = Modifier.height(100.dp))

    }



