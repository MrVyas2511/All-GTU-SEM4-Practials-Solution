package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Sum_Of_Digites {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("-->Enter the number between 1 to 1000 :-");
        int x = sc.nextInt();

        int a1 = x%10;   //last digit derived

        int temp = x/10;  //first 2 digit derived

        int a2 = temp%10;   //last digit from temp

        int a3  = temp/10;  //first digit from temp

        System.out.println("-->Sum of digit of "+ x+"  Is");
        System.out.println(a1+a2+a3);

    }
}
