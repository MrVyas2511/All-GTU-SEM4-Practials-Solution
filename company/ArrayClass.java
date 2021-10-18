package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

    public static void main(String[] args) {
        int[] array = {1, 6, 87, 34, 6, 2, 77, 0, 122, 45, 56};

        System.out.println("-->Array before sorting ");

        for (int e : array)
            System.out.print(e + "  ");

        // you can use array class as  different method to like for that u need to import java.util.Array class
        // Arrays.sort(array);
        java.util.Arrays.sort(array);

        System.out.println("\n-->Array After sorting ");
        for (int e : array)
            System.out.print(e + "  ");

        int x = java.util.Arrays.binarySearch(array,45);
        System.out.println("\n-->Binary search position of x = 45 is " + x);

     }
}
