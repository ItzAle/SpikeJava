package com.spikejava.interfaces;

public class Empleado {

    // 1. Atributos
    String nombre;
    int age;
    double salario;
    boolean alta;

    // 2. Constructores

    public Empleado() {
    }

    public Empleado(String nombre, int age, double salario, boolean alta) {
        this.nombre = nombre;
        this.age = age;
        this.salario = salario;
        this.alta = alta;
    }


    //metodos


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", age=" + age +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
