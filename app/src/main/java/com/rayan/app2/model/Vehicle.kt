package com.rayan.app2.model

class Vehicle(model: String, brand: String, year: Int) {

    private var velocity:Long;
    private var acceleration:Long;
    private var model:String;
    private var brand:String;
    private val year:Int;

    init {
        this.velocity = 0L;
        this.acceleration = 10L;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    fun increaseSpeed() : Unit {
        this.velocity += acceleration;
    }

    fun decreaseSpeed() : Unit {

        if (velocity < 0L) {
            this.velocity = 0L;
        }

        this.velocity -= acceleration;
    }

    fun getVelocity() : Long {
        return velocity;
    }

    override fun toString(): String {
        return "Vehicle(velocity=$velocity, acceleration=$acceleration, model='$model', brand='$brand', year=$year)"
    }


}