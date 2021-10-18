package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static BigInteger factorial1(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-->Enter the number :");
         long x = sc.nextLong();


        System.out.println("-->Factorial of "+ x + " is " + factorial1(x));
    }
}
