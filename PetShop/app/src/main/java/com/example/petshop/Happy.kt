package com.example.petshop

class Happy(name: String): Mood(name) {
    override fun speak(): String {
        return "Happy"
    }

}