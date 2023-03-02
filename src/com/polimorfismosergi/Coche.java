package com.polimorfismosergi;

public class Coche extends Vehiculo{
    String type = "coche";
    @Override
    public void accelerate(Integer increase) {
        this.velocity += increase;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "type='" + type + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
