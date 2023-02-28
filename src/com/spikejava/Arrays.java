package com.spikejava;

public class Arrays {
    public static void main(String[] args) {
        int[] notas = new int[10];
        int[] notas2 = {8,1,2,4,7,8,5,6,4};
        notas[0] = 8;
        notas[1] = 9;

//        notas.bynarySearch(notas, 9);
//        notas.sort(notas);
//        equals(notas, notas2);

        for(int i = 0; i < notas2.length; i++){
            System.out.println(notas[i]);
        }

        for(int item:notas2){
            System.out.println(item);
        }


        System.out.println(notas[0]); // 8
    }
}
