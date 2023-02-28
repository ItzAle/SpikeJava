package com.spikejava;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";
        Coche cocheObj = new CocheHibrido();

        Coche cocheObj2 = new CocheElectrico("Amarillo", "Toyota", "AE86", 1430.45, 3.2, "motor");

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

        CocheElectrico cocheElectrico2 = new CocheElectrico("verde","Toyota", "Supra", 1500d, 4.99, "2JZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);

    }
}
