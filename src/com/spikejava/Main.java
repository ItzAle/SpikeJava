package com.spikejava;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
        InputStream fichero = new FileInputStream("C:/Users/alexc/Desktop/test.txt");
        BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

        try {
            int datos = ficheroBuffer.read();
            while (datos != -1){
                // "EOF (End Of File)"
                System.out.print((char)datos);
                datos = ficheroBuffer.read();
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
