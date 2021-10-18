package com.company;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_scissor_Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------Welcome to the game --------");
        System.out.println("---------Rock-Paper-Scissor---------");
        System.out.println("------------------------------------");
        System.out.println("#Game rules :-");
        System.out.println(" '1' is for rock \n '2' is for paper \n '3' is for scissor");
        System.out.println("------------------------------------\n");

        int i = 1;
        int count = 0;
        while(i<=5) {

            System.out.println("#" + i +"th try :- ");
            System.out.print("--> Your turn \n        -> select your :- ");
            int x = sc.nextInt();
            Random r = new Random();
            int y = r.nextInt(2)+1;
            System.out.println("--> computers turn \n        -> computer selected  :- " + y);

            System.out.println("-->Results :- ");
            if (x == 1 && y == 2 || x == 2 && y == 3 || x == 3 && y == 1) {
                System.out.println("Hurry!! You won");
                count++;
            }
                else if (x == 1 && y == 3 || x == 2 && y == 1 || x == 3 && y == 2)
                System.out.println("Opps!! You Loss");
            else
                System.out.println("Tied");

            i++;

        }
        System.out.println("------------------------------------\n");
        System.out.println("------------Final resutl--------------");
        System.out.println("------------------------------------\n");
        if(count>2)
            System.out.println("You won the game");
        else
            System.out.println("You loss the game");



    }
}
