package com.company;

class circle
{
    private int r;
    private double  area;
    public void set_r(int x)
    {
        r = x;
    }
    public void get_r()
    {
        System.out.println("--> r =" + r);
    }
    public void set_area(double x)
    {
        area = 3.14*r*r;
        if(area!=x)
            System.out.println("-->Enter valid area ");
    }
    public void get_area()
    {
        System.out.println("--> Area = " + area);
    }

}
public class Classes {
    static void printAreaLine(circle C)
    {
        System.out.print("---> Area of the circle is " );
        C.get_area();
    }
    public static void main(String[] args) {

        circle c = new circle();
        c.set_r(7);
        c.get_r();
        c.set_area(153.86);
        c.get_area();
        printAreaLine(c);
    }


}
