package com.company;

import java.util.Random;
import java.util.Scanner;

class Game {
    private int  C_Number;
    private int U_number;
    private int NoOFGuesses;
    Game()
    {
        Random r = new Random();
        C_Number  =  r.nextInt(100);
    }

    public void user_input()
    {
        NoOFGuesses++;
        Scanner sc = new Scanner(System.in);
        System.out.println("--> Guesse the Number = ");
        U_number =  sc.nextInt();
    }
    public boolean IsCorrectNumber()
    {
        if(U_number>C_Number) {
            System.out.println("!!Greater than computer's Number");
        return false;
        }
            else if(U_number < C_Number) {
            System.out.println("!!Less than Computer's Number");
        return false;
        }
            else {
            System.out.println("Yeah!! You guess True !! It's " + U_number );
            return true;
        }
    }

    public int getNoOFGuesses() {
        return NoOFGuesses;
    }
}
public class OOP_Game_GuesseNumber {
    public static void main(String[] args) {

        Game G = new Game();
        G.user_input();
        while(!G.IsCorrectNumber())
        {
            G.user_input();
        }
        System.out.print("--->Number of guesses you take : -  ");
        System.out.println(G.getNoOFGuesses());

    }
}
