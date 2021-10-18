package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


         Scanner sc = new Scanner(System.in);
        System.out.println("-->Enter the number :");
        int x = sc.nextInt();
        int fac = 1;
        for (int i=x;i>0;i--)
            fac = fac *i;
        System.out.println("-->Factorial of "+ x + " is " + fac);
    }
}
