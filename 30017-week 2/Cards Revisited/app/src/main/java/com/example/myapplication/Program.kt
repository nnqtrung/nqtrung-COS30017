package com.example.myapplication

fun main() {
    val card = Card("ACE", "HEARTS")
    card.printDetails()
    card.flip()
    card.printDetails()
}
