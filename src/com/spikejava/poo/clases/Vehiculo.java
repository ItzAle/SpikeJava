package com.spikejava.poo.clases;

public class Vehiculo {
    // 1. Atributos
    protected String fabricante;
    protected String modelo;
    protected Double cc;
    protected int year;
    protected String color;
    protected boolean sport;
    protected int speed;
    Motor motor;

    // 2. Constructores
    public Vehiculo(){

    }

    public Vehiculo(String fabricante, String modelo, Double cc, int year, String color, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.color = color;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo){

        this.fabricante = fabricante;
        this.modelo = modelo;

    }

    // 3. Metodos (comportamiento)
    public void acelerar(int quantity){
        this.speed += quantity;
    }
    // geter y setter

    // toString
}


