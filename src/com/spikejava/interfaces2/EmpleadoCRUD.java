package com.spikejava.interfaces2;

import com.spikejava.interfaces.Empleado;

import java.util.List;

/**
 * Se declaran los metodos, no se implementan
 *
 * Actua como un contrato, dice lo que hay que hacer pero no lo hace
 */


public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete (Empleado empleado);

}
