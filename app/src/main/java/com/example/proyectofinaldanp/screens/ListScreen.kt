package com.example.proyectofinaldanp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectofinaldanp.navigation.AppScreens

@Composable
fun ListScreen(navController: NavController){
    Scaffold {
        ListBodyContent(navController)
    }
}

@Composable
fun ListBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Listas de todas las Plantas Agregadas",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .width(300.dp)
                .height(50.dp))


        Spacer(modifier = Modifier.height(20.dp))
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Green
            )
            ,onClick = {
                navController.navigate(route = AppScreens.InforScreen.route)
            }) {

            Text(text = "Siguiente",
                color = Color.White)
        }

    }
}

/*
//@Preview(showBackground = true)
@Preview(showSystemUi = true)
@Composable
fun ListDefaultPreview(){
    ListScreen()
}*/