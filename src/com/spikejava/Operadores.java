package com.spikejava;

public class Operadores {
    public static void main(String[] args) {


        // Operadores

        // aritmeticos

        // + - / * %
        int number1 = 10;
        int number2 = 20;

        int resultado = number1 + number2;
        int resultado2 = number1 - number2;
        int resultado3 = number1 * number2;
        int resultado4 = number1 / number2;


        // logicos, relacion, comparacionm, booleanos
        /*
        > mayor que
        >= mayor igual que
        < menor que
        <= menor igual que
        == igual que
        !=
        && and
        || or
        !
        */

        boolean resultadoBoolean1 = number1 > number2; // false
        boolean resultadoBoolean2 = number1 < number2; // true
        System.out.println(resultadoBoolean1);
        System.out.println(resultadoBoolean2);

        boolean resultadoBoolean3 = number1 > 5 && number1 <30;
        System.out.println(resultadoBoolean3);

        int edad = 19;
        boolean carnetJoven = edad > 15 && edad <= 26;
        System.out.println(carnetJoven);


        // asignacion
        /*
        =
        +=
        -=
        /=
        *=
        %=
         */

        // incremento
        // ++

        // decremento
        // --

        //concatenacion
        // +
    }

}
