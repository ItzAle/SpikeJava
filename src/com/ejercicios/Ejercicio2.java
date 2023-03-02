package com.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Nos permite escribir en la consola y recoger esos datos (System.in = input)
        System.out.println("Introduce un precio");
        int numero = scanner.nextInt(); // determinamos que numero es igual al input que hemos puesto (un numero)

        double iva = numero * 0.21; // aplicamos el iva a nuestro numero
        double suma = numero + iva; // y lo sumamos a este mismo


        System.out.println("El precio final con IVA  es: " + suma);
    }
}
