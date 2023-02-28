package com.spikejava;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add(new CocheElectrico("rojo", "Honda", "Civic", 1500d, 4.19,"Combustion"));
        coches.add(new CocheElectrico("verde", "Nissan", "GTR", 1300d, 4.30,"Combustion"));
        coches.add(new CocheElectrico("blanco", "Tesla", "Model X", 1200d, 3.20,"Electrico"));

        System.out.println(coches);

        for(Coche coche: coches){
            System.out.println(coche);
        }


    }
}
