package com.company;

abstract class Calculator1
{
    public int a;
    public int b;
    Calculator1()
    {
        a=1;
        b=1;
    }
    Calculator1(int x,int y)
    {
        a=x;
        b=y;
    }
    int add()
    {
        return a+b;
    }

    abstract int multiply();
   abstract int divide();
}

class Supercalc extends Calculator1
{
    Supercalc(int x,int y)
    {
        super(x,y);
    }
    int multiply()
    {
        return a*b;
    }
    int divide() {
        return a / b;
    }
}
public class Abstract_Class {
    public static void main(String[] args) {

        Supercalc c = new Supercalc(9,6);
        System.out.println(c.add());
    }
}
