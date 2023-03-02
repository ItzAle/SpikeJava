package com.polimorfismosergi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coche car1 = new Coche();
        Coche car2 = new Coche();
        Moto moto1 = new Moto();
        Ship ship1 = new Ship();

        List<Vehiculo> vehiculoList = new ArrayList<>(List.of(car1,moto1,car2,ship1));
//        vehiculoList.add(car1);

        for(Vehiculo item : vehiculoList){
            item.accelerate(2);
            System.out.println(item);
        }

        car1.accelerate(1);
        car2.accelerate(2);
        moto1.accelerate(2);

        System.out.println(car1);
    }
    // OPEN CLOSE

}
