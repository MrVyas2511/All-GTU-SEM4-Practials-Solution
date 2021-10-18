package com.company;

import java.util.Date;
import java.util.Random;

public class OOP_ClassFromJavaLibrary
{
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("time : " + d);
        System.out.println("Time in milisecond " + d.getTime());
        System.out.println(Math.random());
        Random r = new Random();
        System.out.println(r.nextInt());
    }
}
