package com.example.myapplication

class Card(
    var rank: String,
    var suit: String,
    var flip: Boolean = true
) {
    fun flip() {
        flip = !flip
    }

    fun printDetails() {
        if (flip) {
            println("$rank of $suit")
        } else {
            println("----")
        }
    }
}
