package com.ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {


        // numeros enteros

        byte numero1 = 1; // 1 byte
        short numero2 = 20; // 2 bytes
        int numero3 = 50; // 4 bytes
        long numero4 = 100; // 8 bytes

        System.out.println("Todos los numeros enteros son: " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4);



        // decimales

        float decimal = 2.5f;
        double decimal1 = 8.34d;

        System.out.println("Lista de decimales: " + decimal + ", " + decimal1);

        // cadenas de texto
        String holamundo = "Hola mundo";

        System.out.println(holamundo);

        // boolean

        boolean verdadero = true;
        boolean falso = false;

        System.out.println("Verdadero es igual a : " + verdadero + " y falso es igual a: " + falso);
    }
}
