package com.example.proyectofinaldanp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController){
    Scaffold{
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Ingreso de Datos",
            textAlign = TextAlign.Left,
            fontSize = 30.sp)

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Ingrese el nombre de su planta",
            modifier = Modifier
            .width(275.dp))
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = "",
            onValueChange = {  },
            label = { Text("Nombre de la planta") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Ingrese una imagen para identificar su planta")

        Spacer(modifier = Modifier.height(180.dp))

        Button(onClick = {
            //navController.popBackStack()
        }) {
            Text(text = "Siguiente")
            
        }


    }
}
/*@Preview(showBackground = true)
@Composable
fun SecondDefaultPreview(){
    SecondScreen()
}*/