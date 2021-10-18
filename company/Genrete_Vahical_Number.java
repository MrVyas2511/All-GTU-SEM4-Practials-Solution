package com.company;

import java.util.Random;

public class Genrete_Vahical_Number {
    public static void main(String[] args) {

        Random r = new Random();

        char x1 =  (char)(r.nextInt( 26)+65);
        char x2 =  (char)(r.nextInt( 26)+65);
        char x3 =  (char)(r.nextInt( 26)+65);
        int y1 = r.nextInt(9);
        int y2 = r.nextInt(9);
        int y3 = r.nextInt(9);
        int y4 = r.nextInt(9);
        System.out.println("-->expected number of number plat");
        System.out.println(""+x1+x2+x3+y1+y2+y3+y3);
    }
}
