package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear_Checking {

    public static void main(String args[]){

        System.out.println("---------Verifying year----------");
        Scanner sc = new Scanner(System.in);

        System.out.print("--> Enter the year :-   ");
        int year = sc.nextInt();

        if((year%4 == 0 && year%100 != 0)||year%400 == 0)
            System.out.println("-->Ans : Yes, Entered year is leap year");
        else
            System.out.println("-->Ans : No, Entered year is not leap year ");

    }
}
