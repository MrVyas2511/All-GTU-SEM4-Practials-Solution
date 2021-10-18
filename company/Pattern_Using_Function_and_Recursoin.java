package com.company;

import java.util.Scanner;

public class Pattern_Using_Function_and_Recursoin {

    static void pattern(int a)
    {
        for(int i = 1 ; i <= a ; i++)
        {
            for (int j = 0 ; j<= a-i ; j++)
                System.out.print(" * ");
            System.out.println("");
        }

    }

    static  void recursive_pattern(int a)
    {
        if (a > 0) {
            System.out.println();
            for (int i = 0; i < a; i++) {
                System.out.print(" * ");
            }
            recursive_pattern(a - 1);

        }
    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("-->Enter the vakue of n ");
        int n = sc.nextInt();
        System.out.println("->Pattern using for-loop function ");
        pattern(n);
        System.out.println("->Pattern using recursive function ");
        recursive_pattern(n);
    }
}
