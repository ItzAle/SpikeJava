package com.spikejava;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";
        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("Amarillo", "Toyota", "AE86", 1430.45, 3.2);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1349.3;

        System.out.println(cocheObj2);

       CocheElectrico cocheElectrico = new CocheElectrico();
       cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Tesla";
        cocheElectrico.modelo = "Model S";

        System.out.println(cocheElectrico);
    }
}
