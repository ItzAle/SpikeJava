package com.spikejava;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("12345678A", "Nombre Apellido 1");
        personas.put("12345678B", "Nombre Apellido 2");
        personas.put("12345678C", "Nombre Apellido 3");
        personas.put("12345678D", "Nombre Apellido 4");

        System.out.println(personas);
        for(String key: personas.keySet()){
            System.out.println(key);
        }
        for(String value: personas.values()){
            System.out.println(value);
        }


        for (Map.Entry<String, String> pair :personas.entrySet()){
            System.out.println(pair.getValue() + " / " + pair.getKey());
        }
    }
}
