package com.company;

import java.util.Scanner;

public class Linear_Search {

    static int[] search(int[] array, int n) {
        int[] count = new int[10];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count[j] = i;
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 4, 2, 46, 0, 7, 5, 33, 6, 7, 8, 9, 5};

        Scanner sc = new Scanner(System.in);

        System.out.println("--> Enter the value you want to search :-");
        int x = sc.nextInt();
        int[] position = search(list, x);
        System.out.println("--> the value x is at this position ");
        int i = 0;
        int count = 0;
        while (position[i] != '\0') {
            System.out.println(position[i]);
            i++;
            count++;
        }
        if (count == 0)
            System.out.println("!!Element not found");
        System.out.println("-->Total number of x in array is " + count);
    }
}
