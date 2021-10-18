package com.company;

public class Array_Basic {

    public static void main(String[] args) {

        int []  array = new int[10];
        array[0]  = 10;
        array[1]  = 20;
        array[2]  = 30;
        array[3]  = 40;

        System.out.println("Using normal declaration");
        System.out.println(array[0]);
        System.out.println(array[1]);

        int array1[] = new int[10];

        array1[0]  = 10;
        array1[1]  = 20;
        array1[2]  = 30;
        array1[3]  = 40;

        System.out.println("Using  second(c++)  type declaration");
        System.out.println(array1[0]);
        System.out.println(array1[1]);


        System.out.println("Using for each loop ");

        for (int x : array1)
            System.out.println(x);
    }
}
