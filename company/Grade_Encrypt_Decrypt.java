package com.company;

import java.util.Scanner;

public class Grade_Encrypt_Decrypt {

    public static void main(String[] args)
    {
        System.out.println("-->Enter the grade :");
        char a = 'l';
        System.out.println(a+"\t"+(int)a);
        System.out.println("After adding 8 in variable 'a'");
        System.out.println( (char)(a+8)+"\t"+(a+8));
        System.out.println("After substract by 8 ");
        System.out.println((char)(a-8)+"\t"+ (a-8));

    }
}
