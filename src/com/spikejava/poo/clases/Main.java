package com.spikejava.poo.clases;

public class Main {
    public static void main(String[] args) {

        // Clase identificador = new Clase ();


        // Crear un objeto utilizando el constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        // crear un objeto utilizando el constructor con parametros
        Motor motorGTI = new Motor("GTI", 190, 439.3, 6);
        Vehiculo toyotaYaris = new Vehiculo("Toyota", "Yaris", 2.5,2019, "azul", true,0, motorGTI);
        System.out.println(toyotaYaris.fabricante);
        System.out.println(toyotaYaris.year);
        System.out.println(toyotaYaris.speed);
        toyotaYaris.acelerar(50);
        System.out.println(toyotaYaris.speed);


    }
}
