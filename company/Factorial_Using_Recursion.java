package com.company;

import java.util.Scanner;

public class Factorial_Using_Recursion {

    static int fact(int n)
    {
        if(n==1)
            return n;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--> Enter the number : ");
        int x = sc.nextInt() ;

        System.out.println("-->Factorial of " + x + " Is " + fact(x));
    }
}
