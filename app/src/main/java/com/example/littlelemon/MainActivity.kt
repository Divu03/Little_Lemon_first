package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }
}

@Composable
fun Navigation(){
    val navController = remberNavController()
    NavHost(navController = "navController", startDestination = Homepage.route){
        composable(Homepage.route){
            Homepage(navController)
        }
        composable(Sndpage.route){
            Sndpage(navController)
        }

    }
}
