package com.spikejava;
import java.math.BigDecimal;
public class Bigdecimal {
    public static void main(String[] args) {
       BigDecimal valorA = new  BigDecimal(3.14);
       BigDecimal valorB = new  BigDecimal(3.15);

       BigDecimal resultado = valorA.add(valorB);

       valorA.add(valorB);
        System.out.println(resultado.toString());
    }
}
