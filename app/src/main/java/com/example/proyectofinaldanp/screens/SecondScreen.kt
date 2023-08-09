package com.example.proyectofinaldanp.screens

import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectofinaldanp.navigation.AppScreens

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


        var state = remember { mutableStateOf("")}
        OutlinedTextField(
            value = state.value,
            onValueChange = {  state.value = it},
            label = { Text("Nombre de la planta") }
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Ingrese una breve Descripcion de la planta",
            modifier = Modifier
                .width(275.dp))
        Spacer(modifier = Modifier.height(10.dp))


        var stater = remember { mutableStateOf("")}
        OutlinedTextField(
            value = stater.value,
            onValueChange = {  stater.value = it},
            label = { Text("Descripcion de la planta") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Ingrese una imagen para identificar su planta",
            modifier = Modifier
                .width(275.dp))
        Spacer(modifier = Modifier.height(10.dp))

        var imageUri by remember { mutableStateOf<Uri?>(null) }
        val context = LocalContext.current
        val bitmap = remember { mutableStateOf<Bitmap?>(null) }

        val launcher =
            rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) { uri: Uri? ->
                imageUri = uri
            }
        /*
        imageUri?.let {
            if (Build.VERSION.SDK_INT < 28) {
                bitmap.value = MediaStore.Images
                    .Media.getBitmap(context.contentResolver, it)
            } else {
                val source = ImageDecoder.createSource(context.contentResolver, it)
                bitmap.value = ImageDecoder.decodeBitmap(source)
            }

            bitmap.value?.let { btm ->
                Image(
                    bitmap = btm.asImageBitmap(),
                    contentDescription = null,
                    modifier = Modifier
                        .size(400.dp)
                        .padding(20.dp)
                )
            }
        }*/

        Spacer(modifier = Modifier.height(12.dp))
        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Gray
            ),
            onClick = { launcher.launch("image/*") }) {
            Text(text = "Pick Image",
            color = Color.White)
        }

        Spacer(modifier = Modifier.height(160.dp))

        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Green
            ),
            onClick = {
            //navController.navigate(route = AppScreens.ThirdScreen.route)
            navController.popBackStack()
        }) {
            Text(text = "Guardar",
            color = Color.White)
            
        }


    }
}
/*@Preview(showBackground = true)
@Composable
fun SecondDefaultPreview(){
    SecondScreen()
}*/