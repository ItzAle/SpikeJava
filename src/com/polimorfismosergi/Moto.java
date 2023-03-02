package com.polimorfismosergi;

public class Moto extends Vehiculo {

    String type = "moto";

    public void accelerate(Integer increase){
        System.out.println("acelero");

        this.velocity += increase*2;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "type='" + type + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
