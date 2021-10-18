package com.company;

import org.jetbrains.annotations.NotNull;

class myclass implements Comparable<myclass>
{
    int x;
    myclass(int y)
    {
        x = y;
    }
    @Override
    public int compareTo(@NotNull myclass o) {
        if(this.x>o.x)
            return 1;
        else
            return 0;
    }

    public String compareTo()
    {
    return "invalid statement";
    }

}
public class CompareMethod {

    public static void main(String[] args) {
        myclass m  = new myclass(6);
        myclass n = new myclass(10);
        System.out.println(m.compareTo(n));



    }
}
