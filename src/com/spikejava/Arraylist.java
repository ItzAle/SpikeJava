package com.spikejava;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

//        lista.remove("Elemento B");
//        for (String nombre : lista){
//            System.out.println(nombre);
//        }
//        for (int i = 0; i< lista.size(); i++){
//            System.out.println(lista.get(i));
//        }

        String array[] = new String[lista.size()];
        for (int i = 0; i< lista.size(); i++){
            array[i] = lista.get(i);
        }
        for (String elemento : array){
            System.out.println("Elemento es: " +elemento);
        }
    }
}
