package com.example.littlelemon

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Sndpage(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFEFEFFD5))
    )
    {
        Text(
            text = "Second Page",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14)
        )
        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = 32.sp,
            color = Color(0xFFF4CE14)
        )
        Row{
            Button(
                onClick = {
                          navController.navigate(Homepage.route)
                },
                border = BorderStroke(1.dp, Color.Red),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            )
            {
                Text(text = stringResource(id = R.string.order))
            }
        }
        Row(Modifier.padding(40.dp,0.dp)) {
            Image(
                painter = painterResource(id = R.drawable.dk), contentDescription = "",
                Modifier.blur(1.dp,1.dp, BlurredEdgeTreatment.Rectangle)

            )
            Text(text = "Hay there how are you",
                Modifier.padding(10.dp)
            )
        }
    }
}