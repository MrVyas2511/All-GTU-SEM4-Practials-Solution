package com.company;

public class VarArg_in_Array {

    static int vararg(int ...array)
    {
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++)
            sum = sum +array[i];

        return sum;
    }
    public static void main(String[] args) {


        int a,b,c,d;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        System.out.println(vararg(a));
        System.out.println(vararg(a,b));
        System.out.println(vararg(a,b,c));
        System.out.println(vararg(a,b,c,d));

    }

}

