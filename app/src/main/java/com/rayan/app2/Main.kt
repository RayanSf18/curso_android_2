package com.rayan.app2

import com.rayan.app2.model.Vehicle

class Main {

}

fun main() {

    val uno = Vehicle("Uno X1", "Fiat", 1990);

    println(uno);

    uno.increaseSpeed();
    uno.increaseSpeed();

    println(uno);

    uno.decreaseSpeed();

    println(uno);

    println("Velocity: " + uno.getVelocity());

}