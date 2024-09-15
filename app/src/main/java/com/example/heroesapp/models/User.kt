package com.example.heroesapp.models

data class User(val name:String,val email:String,val password: String){
    val computedName :String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Leo","leo02@gmail.com","12345"),
            User("Juan","juan05@gmail.com","12345"),
            User("Luca","luca09@gmail.com","12345")
        )
    }
}
