package com.company;
import java.lang.String;

class geometric
{
     private String color = "White";
      private boolean filled = false;
    private  java.util.Date createddate;
    geometric()
    {

        createddate = new java.util.Date();
    }
    geometric(String s,boolean a)
    {
        color = s;
        filled = a;
        createddate = new java.util.Date();
    }
    public String getColor()
    {
        return color;
    }
    public boolean Isfilled()
    {
        return  filled;
    }
    public String  Date()
    {
        //System.out.println(createddate);
        return  ""+createddate;
    }

}
class circle1 extends geometric
{
    private double radius ;


    circle1()
    {
        radius = 1.0;
    }
    circle1(int x)
    {
        radius = x;
    }
    circle1(int x,String color, boolean filled)
    {
        radius = x;
        color = color;
        filled  = filled;
    }
    public void setRadius(double x)
    {
        radius = x;
    }
    public double GetRadius()
    {
        return radius;
    }
    public double GetArea()
    {
        return 3.14*radius*radius;
    }
}

class rectangle extends geometric
{
    private double l;
    private double b;

    rectangle() {
        l = b = 1;
    }
    rectangle(double a,double b)
    {
        l = a;
        this.b = b;
    }
    rectangle(double a,double b,String color, boolean filled)
    {
         l = a;
         this.b = b;
         color = color;
         filled = filled;
    }
    public void setL(int x)
    {
        l = x;
    }
    public void setB(int x)
    {
        b = x;
    }
    public double GetArea()
    {
        return l*b;
    }
    public double GetL()
    {
        return l;
    }
    public double GetB()
    {
        return b;
    }
}
public class OOP_GeometricCLass_Inheritance {
    public static void main(String[] args) {

        // GEOMETRIC OBJECT AND METHOD CALL
/*
          geometric g = new geometric();
          System.out.println(g.getColor());
          System.out.println(g.Isfilled());
          System.out.println(g.Date());
          g.Date();
*/
        // CIRCLE OBJECT AND METHOD CALL INHERIT BY GEOMETRIC
/*
        circle1 c = new circle1();
        System.out.println(c.getColor());
        System.out.println(c.GetArea());
        c.setRadius(7);
        System.out.println(c.GetArea());
        System.out.println(c.Isfilled());
*/

        // RECTANGLE OBJECT AND METHOD CALL INHERIT BY GEOMETRIC
/*
        rectangle r = new rectangle();
        System.out.println(r.getColor());
        System.out.println(r.Isfilled());
        System.out.println(r.GetB());
        System.out.println(r.GetL());
        r.setB(5);
        r.setL(10);
        System.out.println(r.GetArea());
*/

        // POLYMORPHISM
        // POLYMORPHISM IS THE TO CREATE VARIABLE OF CHILD CLASS TYPE WHICH REFERENCING PARENT CLASS
        geometric x = new circle1(4);

        // System.out.println( x.GetArea());  WE CAN'T CIRCLES METHOD
        // x.setRadius(10);
        System.out.println(x.Date());
        System.out.println(x.getColor());
        System.out.println(x.getClass());
        System.out.println(x.Isfilled());

     }

}
