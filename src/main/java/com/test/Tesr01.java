package com.test;

public class Tesr01 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};

        int num = 0 ;
        for (int i = 0; i <array.length ; i++) {
                if (i<5){
                    num = array[i];
                    array[i] = array[9-i];
                    array[9-i] = num;
                }
        }

        for (int i = 0; i <array.length ; i++) {
            System.err.print(array[i]);
            System.err.print("    ");
        }

    }
}
