package com.spikejava;

public class StringMain {
    public static void main(String[] args) {
    // La clase String

    /*
    length()
    startsWith(")
    endsWith("")
    indexOf("")
    subString(1,5)
    trim()
    equals()
    compareTo()
     */

    String mensaje = "  Hola mundo  ";
        System.out.println(mensaje.length());
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim());
        mensajeMAY = mensajeMAY.trim();

        String otro = "HOLA MUNDO";

        if(mensajeMAY.equalsIgnoreCase(otro)){
            System.out.println("Verdadero");

        }else {
            System.out.println("Falso");
        }


    }


}



