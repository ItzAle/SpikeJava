package com.spikejava.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juan = new Empleado("Juan", 25, 40000, true);
        Empleado manuel = new Empleado("Manuel", 24, 45000, true);
        Empleado angel = new Empleado("Angel", 19, 20000, false);
        // guardar empleados
        empleadoCRUD.guardar(juan);
        empleadoCRUD.guardar(manuel);
        empleadoCRUD.guardar(angel);
    // consultar empleados
        List <Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }

}
