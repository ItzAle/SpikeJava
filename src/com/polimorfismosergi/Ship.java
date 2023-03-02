package com.polimorfismosergi;

public class Ship extends Vehiculo {
    String type = "ship";
    @Override
    public void accelerate(Integer increase) {
        this.velocity += increase*8;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "type='" + type + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
