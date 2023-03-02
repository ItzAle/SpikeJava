package com.spikejava;

import java.util.Vector;

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

        String cadena = "Mensaje de texto";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLen);

        for (int i = 0; i < cadena.length();i++){
            System.out.println("Caracter actual:" + cadena.charAt(i));
        }

        Vector<Integer> vector = new Vector(50, 15);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        for (int i = 0; i < vector.size(); i++){
            if(i % 2 == 0 ){
                vector.remove(i);
                continue;
            }
        }

        System.out.println("Capacidad:  " +vector.capacity() + "Tamaño :" + vector.size());

        vector.remove(2);

    }


}



