package com.example.proyectofinaldanp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
fun BibliotecaScreen(navController: NavController) {
    Scaffold {
        BibliotecaBodyContent(navController)
    }
}

@Composable
fun BibliotecaBodyContent(navController: NavController){
    Box(
        modifier = Modifier.padding(18.dp, top = 10.dp),
        contentAlignment = Alignment.Center,
    ){
        Column(
            modifier = Modifier.padding(8.dp,top = 10.dp),
        ) {
            Text(
                text = "MI BIBLIOTECA DE PLANTAS",
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            buscardor()
            Spacer(modifier = Modifier.height(20.dp))
            InfList()
            IconosNav(navController)
        }
    }
}

@Composable
fun buscardor(){

    var state = remember { mutableStateOf("") }
    Row(
        verticalAlignment  = Alignment.CenterVertically,
    ) {
        OutlinedTextField(
            modifier = Modifier
                .size(width = 250.dp, height = 60.dp),
            value = state.value,
            onValueChange = {  state.value = it},
            label = { Text(" Shared")
            }
        )

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            modifier = Modifier.padding(start = 8.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Green
            ),
            onClick = {
                //implementAccion
            }) {
            Text(text = "Buscar",
                color = Color.White)

        }
    }
}
@Composable
fun InfList(){
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
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Temperatura / fecha",
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )
        }

    }
}


@Composable
fun IconosNav(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {

        FloatingActionButton(
            onClick = {
                navController.navigate(route = AppScreens.SensorRegadoScreen.route)
            },
        ) {
            Icon(Icons.Filled.Star, "")
        }

        Spacer(modifier = Modifier.height(16.dp))

        FloatingActionButton(
            onClick = {
               navController.navigate(route = AppScreens.SecondScreen.route)
            }
        ) {
            Icon(Icons.Filled.Add, "")
        }

    }
}
/*
//@Preview(showBackground = true)
@Preview(showSystemUi = true)
@Composable
fun BibliotecaDefaultPreview(){
    BibliotecaScreen()
}*/
