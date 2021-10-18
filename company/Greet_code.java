package com.company;

import java.util.Scanner;

public class Greet_code {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name ");
        String name = sc.nextLine();
        System.out.println("Hello," + name + ". Welcome to the our coding world");
    }
}
