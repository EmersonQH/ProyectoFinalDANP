package com.example.proyectofinaldanp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectofinaldanp.R
import com.example.proyectofinaldanp.navigation.AppScreens

@Composable
fun FirstScreen(navController: NavController){
    Scaffold{
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.imagen),
            contentDescription = "logo")

        Text(text = "AGENDA VERDE",
            color = Color.Green,
            textAlign = TextAlign.Center,
            fontSize = 40.sp
            )
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Bienvenido a la aplicacion para" +
                " registar y listar sus plantas para regarlos" +
                " de una manera mas saludable",
            modifier = Modifier
                .width(300.dp)
                .height(80.dp),
            textAlign = TextAlign.Center
        )

        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Green
            )
            ,onClick = {
            navController.navigate(route = AppScreens.SecondSreen.route)
        }) {

            Text(text = "Continuar",
            color = Color.White)
        }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    FirstScreen()
}*/