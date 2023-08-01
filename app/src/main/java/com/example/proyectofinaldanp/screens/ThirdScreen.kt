package com.example.proyectofinaldanp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
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
fun ThirdScreen(navController: NavController){
    Scaffold {
        ThirdBodyContent(navController)
    }
}

@Composable
fun ThirdBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Medicion de Humedad",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            modifier = Modifier
                .width(300.dp)
                .height(50.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Conecte el sensor de humedad y " +
                "espere a que termine la medicion",fontSize = 20.sp,
            modifier = Modifier
                .width(300.dp)
                .height(180.dp))
        Spacer(modifier = Modifier.height(10.dp))

        //Crear icono para la grafica
        Text(text = "Humedad",
            textAlign = TextAlign.Left,
            fontSize = 20.sp,
            modifier = Modifier
                .width(300.dp)
                .height(30.dp))
        Spacer(modifier = Modifier.height(10.dp))

        var valorHumedad = "%"
        TextField(value = "",
            onValueChange = {  },
            label = { Text(valorHumedad)},readOnly = true)

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Fecha",
            textAlign = TextAlign.Left,
            fontSize = 20.sp,
            modifier = Modifier
                .width(300.dp)
                .height(30.dp))
        Spacer(modifier = Modifier.height(10.dp))


        var datoFecha= "31/07/2023"
        TextField(value = "",
            onValueChange = {  },
            label = { Text(datoFecha) }, readOnly = true)


        Spacer(modifier = Modifier.height(20.dp))
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Green
            )
            ,onClick = {
                navController.navigate(route = AppScreens.ListScreen.route)
            }) {

            Text(text = "Agregar Planta",
                color = Color.White)
        }

    }
}

/*
//@Preview(showBackground = true)
@Preview(showSystemUi = true)
@Composable
fun TrirdDefaultPreview(){
    ThirdScreen()
}*/