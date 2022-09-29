package com.alexandrohlopes.exerciseaboutfunctions

fun main() {
   println("${average(10.5f,2f)}")
}

fun average(x : Float, y : Float) : Float {
    return (x + y) / 2
}