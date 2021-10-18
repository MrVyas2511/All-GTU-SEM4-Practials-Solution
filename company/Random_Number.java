package com.company;

public class Random_Number {

    public static void main(String args[])
    {
        //generating random number between 0 to 100
        int a = (int) (Math.random()*100);
        System.out.println("-->First number is "+a);

        int b = (int)(Math.random()*100);
        System.out.println("-->Second number is "+ b);

        System.out.println("-->SUM of both number is "+ (a+b));

    }
}
