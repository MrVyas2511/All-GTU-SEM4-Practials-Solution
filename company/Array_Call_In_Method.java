package com.company;

public class Array_Call_In_Method {

    static void swap1(int a,int b)
    {
        int temp ;

        temp = a;
        a=b;
        b=temp;
    }
    static  void swap2(int a[])
    {
        int temp;

        temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }


    public static void main(String[] args) {

        int [] array =  {1,2};
        System.out.println("--> Array before using function");
        System.out.println(array[0] + " " + array[1]);
        System.out.println("--> Array after calling function (call by value) :");
        swap1(array[0],array[1]);
        System.out.println(array[0] + " " + array[1]);
        System.out.println("--> Array after calling function (call by refrence) :");
        swap2(array);
        System.out.println(array[0] + " " + array[1]);


    }
}
