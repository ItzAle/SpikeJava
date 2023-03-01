package com.spikejava.interfaces2;

import com.spikejava.interfaces.Empleado;

public class Main {
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();

//    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());

    }
}
