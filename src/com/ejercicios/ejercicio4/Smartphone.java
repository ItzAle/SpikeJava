package com.ejercicios.ejercicio4;

public class Smartphone extends SmartDevice {
    String sistema;
    int almacenamiento;

    public Smartphone(){

    }

    public Smartphone(String marca, String modelo, String color, String sistema, int almacenamiento) {
        super(marca, modelo, color);
        this.sistema = sistema;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "sistema='" + sistema + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
