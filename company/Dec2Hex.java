package com.company;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.print("-->Enter the Decimal value :- ");
        int dec  = sc.nextInt();

        String hex = "";
        while(dec!=0)
        {
            int hexdigit  = dec%16;

            dec = dec/16;

            if(hexdigit>9)
            {
                hexdigit = (char)(hexdigit-10+'A');
            }
            else
                hexdigit = (char)(hexdigit +'0');
            hex = (char)hexdigit + hex;
        }

        System.out.println("-->Hexadecimal  value is "+ hex);
    }
}
