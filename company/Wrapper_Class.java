package com.company;

public class Wrapper_Class {
    public static void main(String[] args) {


        //Integer is nothing but the object which wrap the int value
        //Integer is object and int is instance
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.min(4,10));
        System.out.println(Integer.getInteger("ABC"));
        Integer i = 100;
        System.out.println(i.floatValue());

        int a  =1;
        int b = 0;
        System.out.println(Integer.parseInt("111",2));
        System.out.println(Integer.compare(1,0));
    }
}
