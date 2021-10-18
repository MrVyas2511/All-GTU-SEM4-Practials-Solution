package com.company;


import java.util.Scanner;

public class Selection_SOrt {

    static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int minAt =i;
            for (int j = i+1; j < list.length; j++) {
                if (list[minAt] > list[j])
                    minAt = j;
            }
            if (minAt != i) {
                int temp = list[minAt];
                list[minAt] = list[i];
                list[i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 6, 87, 34, 6, 2, 77, 0, 122, 45, 56};

        System.out.println("-->Array before sorting ");

        for (int e : array)
            System.out.print(e + "  ");

        sort(array);

        System.out.println("\n-->Array After sorting ");

        for (int e : array)
            System.out.print(e + "  ");
    }


}
