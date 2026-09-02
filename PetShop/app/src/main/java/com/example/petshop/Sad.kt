package com.example.petshop

class Sad(name: String): Mood(name) {
    override fun speak(): String {
        return "Sad"
    }

}