package com.spikejava.interfaces;

import com.spikejava.Coche;

public class InterfaceMain {
    public static void main(String[] args) {

        CocheService service1 = new CocheServiceSporImpl();
        CocheService service2 = new CocheServiceClassicImpl();

        Coche coche1 = service1.crearCocheDemo();

        Coche coche2 = service2.crearCocheDemo();
    }
}
