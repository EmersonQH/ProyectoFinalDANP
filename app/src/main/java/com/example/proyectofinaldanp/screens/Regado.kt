package com.example.proyectofinaldanp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectofinaldanp.R
import com.example.proyectofinaldanp.navigation.AppScreens

@Composable

fun RegadoScreen(navController: NavController){
    Scaffold () {
        RegadoBodyContent(navController)
    }
}
@Composable
fun RegadoBodyContent(navController: NavController) {
    Box(
        modifier = Modifier.padding(18.dp, top = 10.dp),
        contentAlignment = Alignment.Center,){
        Column(
            //modifier = Modifier.padding(top = 10.dp),
            //verticalArrangement = Arrangement.Center,
            //horizontalAlignment = Alignment.CenterHorizontally

            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween

            ) {
            Text(
                text = "Regado",
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )

            InfPlanta()
            Spacer(modifier = Modifier.height(450.dp))

            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(320.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Green
                ),
                onClick = {
                navController.navigate(route = AppScreens.RegadoTerminadoScreen.route)
                }) {
                Text(text = "Comenzar",
                    color = Color.White)
                }
            }
    }
}
@Composable
fun InfPlanta(){
    Row() {
        Image(
            painter = painterResource(id = R.drawable.imagenpreview),
            contentDescription = "logo",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colors.primary)
        )
        Column(modifier = Modifier.padding(start = 16.dp)) {
            Text(
                text = "Descripcion",
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Temperatura / fecha",
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }

    }
}
/*
//@Preview(showBackground = true)
@Preview(showSystemUi = true)
@Composable
fun RegadoDefaultPreview(){
    RegadoScreen()
}*/