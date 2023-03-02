package com.spikejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try{
        InputStream fichero = new FileInputStream("C:/Users/alexc/Desktop/test.txt");

        try {
            int datos = fichero.read();
            while (datos != -1){
                // "EOF (End Of File)"
                System.out.print((char)datos);
                datos = fichero.read();
            }
//            for(byte dato: datos){
//                System.out.println((char)dato);
//            }
        } catch (IOException e){
            System.out.println("No puedo leer el fichero:" + e.getMessage());
        }
        }catch (FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
