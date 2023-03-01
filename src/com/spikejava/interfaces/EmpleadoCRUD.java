package com.spikejava.interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    // estructura de datos

    private  List<Empleado> empleados = new ArrayList<>();

    // operaciones crud
    // guardar un empleado
    public void guardar(Empleado empleado){


        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }


}
