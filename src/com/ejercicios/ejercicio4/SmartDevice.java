package com.ejercicios.ejercicio4;

public class SmartDevice {

    String marca;
    String modelo;
    String color;

    public  SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("iPhone", "14", "rojo", "IOS", 128);
        SmartWatch smartWatch = new SmartWatch("Apple", "Watch SE", "negro", 36.5, true);

        System.out.println("El Smartphone es  " + smartphone + "y el reloj es  " + smartWatch );
    }
}
