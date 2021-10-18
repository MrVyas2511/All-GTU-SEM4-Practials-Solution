package com.company;

import java.util.Scanner;

public class Mark_Calc {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks of each subject");
        int total= sc.nextInt();
        System.out.println("Enter the marks of sub_1");
        int a = sc.nextInt();
        System.out.println("Enter the marks of sub_2");
        int b = sc.nextInt();
        System.out.println("Enter the marks of sub_3");
        int c = sc.nextInt();

        float x ;
        x= a+b+c;

        System.out.println("total percentage is :-");
        System.out.println(x/(total*3)*100);

    }
}
