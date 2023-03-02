package com.ejercicios.ejercicio4;

public class SmartWatch extends SmartDevice {

    double peso;
    boolean pulsometro;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, String color, double peso, boolean pulsometro) {
        super(marca, modelo, color);
        this.peso = peso;
        this.pulsometro = pulsometro;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "peso=" + peso +
                ", pulsometro=" + pulsometro +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
