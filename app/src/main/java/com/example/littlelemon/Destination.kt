package com.example.littlelemon

interface Destination{
    val route:String
}
object Homepage:Destination{
    override val route = "Homepage"
}
object Sndpage:Destination{
    override val route = "Sndpage"
}