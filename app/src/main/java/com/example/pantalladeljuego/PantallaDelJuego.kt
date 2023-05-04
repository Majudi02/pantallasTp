package com.example.pantalladeljuego

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
@Preview(showBackground = true)
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 7.dp, start = 5.dp, end = 7.dp)
                .clip(CircleShape)
                .background(colorResource(id = R.color.perfil))
        )
        {
            Image(
                painter = painterResource(id = R.drawable.foto_de_perfil),
                contentDescription = "Foto de perfil del usuario",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(start = 14.dp, top = 5.dp, bottom = 5.dp)
                    .size(65.dp)
                    .clip(CircleShape)
            )
            //-------------------------------------------------------------------------------------------------------------------------------------------
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding(start = 20.dp, top = 7.dp)
            ) {
                Text(text = "Nombre", color = Color.White, fontSize = 18.sp)
                Text("Nacionalidad", color = Color.White, fontSize = 18.sp)
            }
            //----------------------------------------------------------------------------------------------------------------------------------------------
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding(start = 80.dp, top = 7.dp)
            ) {
                Text(text = "Puntos : 0", color = Color.White, fontSize = 18.sp)
                Text("Vidas : 5", color = Color.White, fontSize = 18.sp)
            }
            //----------------------------------------------------------------------------------------------------------------------------------------------
        }
//-------------------------------------------------------------------------------------------------------------------------------------------------------
        AsyncImage(
            model = "https://flagcdn.com/w320/ws.png",
            contentDescription = "Bandera",
            modifier = Modifier
                .size(300.dp, 170.dp)
                .padding(start = 17.dp, end = 17.dp, top = 10.dp)
                .fillMaxWidth()
        )
        Divider(
            color = Color.DarkGray,
            thickness = 2.dp,
            modifier = Modifier.padding(vertical = 2.dp)
        )

        Text(
            text = "Capital", fontSize = 14.sp,
            color = Color.White
        )
        Divider(
            color = Color.DarkGray,
            thickness = 2.dp,
            modifier = Modifier.padding(vertical = 2.dp)
        )
//-----------------------------------------------------------------------------------------------------------------------------------------------------
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp)
        ) {
            Text(
                text = "Opcion 1", style = MaterialTheme.typography.h5,
                color = Color.White
            )

            Divider(
                Modifier
                    .width(170.dp)
                    .size(height = 50.dp, width = 2.dp)
                    .rotate(90f)
                    .padding(horizontal = 8.dp)
                    .clip(RoundedCornerShape(4.dp)),
                color = Color.Gray,
                thickness = 2.dp,
            )

            Text(
                text = "Opcion 2", style = MaterialTheme.typography.h5,
                color = Color.White
            )

        }
        //--------------------------------------------------------------------------------------------------------------------------------------------------
        Button(
            onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 150.dp/*, start = 260.dp*/),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.azul_botones))
        ) {
            Text(text = "Ayuda", style = MaterialTheme.typography.button)
        }
        Button(
            onClick = {/*TODO*/ },
            modifier = Modifier.padding(top = 70.dp, end = 220.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.azul_botones))
        ) {
            Text(text = "Volver", style = MaterialTheme.typography.button)
        }
    }
}







