package com.company;

import java.util.Scanner;

public class Equation_Soln_ {

    public static void main(String[] args) {

        System.out.println("--------Equation calculator-------");

        Scanner sc = new Scanner(System.in);
        float a,b,c,d,e,f;
        float d1,d2,D;

        System.out.println("-->Enter the value of equation variable :");

        System.out.print("->Value a = ");
        a = sc.nextInt();
        System.out.print("->Value b = ");
        b = sc.nextInt();
        System.out.print("->Value c = ");
        c = sc.nextInt();
        System.out.print("->Value d = ");
        d = sc.nextInt();
        System.out.print("->Value e = ");
        e = sc.nextInt();
        System.out.print("->Value f = ");
        f = sc.nextInt();

        d1 = d*e-f*b;
        d2 = a*f-c*e;
        D  = a*d-b*c;

        System.out.println("--->Ans :    ");
        if(D==0)
        {
            System.out.println("Solution are not available");
        }
        else {
            System.out.println("Value of x is = " + (d1 / D));
            System.out.println("Value of y is = " + (d2 / D));
        }


    }
}
