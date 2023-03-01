package com.spikejava.poo.clases;

public class Vehiculo {
    // 1. Atributos
    String fabricante;
    String modelo;
    Double cc;
    int year;
    String color;
    boolean sport;

    // 2. Constructores
    public Vehiculo(){

    }
    public Vehiculo(String fabricante, String modelo, Double cc, int year, String color, boolean sport){

        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.color = color;
        this.sport = sport;

    }
    public Vehiculo(String fabricante, String modelo){

        this.fabricante = fabricante;
        this.modelo = modelo;

    }




    // 3. Metodos (comportamiento)
}
