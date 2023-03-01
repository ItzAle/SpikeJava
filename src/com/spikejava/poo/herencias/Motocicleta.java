package com.spikejava.poo.herencias;

import com.spikejava.poo.clases.Motor;
import com.spikejava.poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;

    public Motocicleta(){
    }

    public Motocicleta(String fabricante, String modelo, Double cc, int year, String color, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, color, sport, speed, motor);
        this.baul = baul;
    }
}
