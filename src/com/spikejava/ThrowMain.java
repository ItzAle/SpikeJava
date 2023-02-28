package com.spikejava;

import javax.naming.NameNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class ThrowMain {
    public static void main(String[] args) {

        try{
            leernombres();
        }catch (NameFormatException e){
            e.printStackTrace();
        }
    }


    /**
     * Metodo que lee nombres de consola y verifica que tengan longitud igual o mayor que 8 caracteres
     *
     * @throws NameFormatException
     */

    private static void leernombres() throws NameFormatException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce nombre");
        while (teclado.hasNext()) {
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if (nombre.length() < 8) {
                teclado.close();
                throw new NameFormatException("El Nombre debe contener minimo 8 caracteres");
            }
            teclado.close();
        }

    }
}




