package com.company;

import java.util.Scanner;

public class Fibonaci_using_Recursion {
    static int fib(int n)
    {
        if(n==0||n==1)
            return n;
        else
            return fib(n-2) + fib(n-1);

    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("-->Enter the number of position :");
        int x = s.nextInt();

        System.out.println("--> " + fib(x) + " Is at " + x + "th position in Fibonacci series" );

    }

}
