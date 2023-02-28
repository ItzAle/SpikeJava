package com.spikejava;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre =  scanner.nextLine();
        System.out.println("Introduce tu edad");
        int numero = scanner.nextInt();
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + numero);


        System.out.println("Hola mundo");
    }
}
