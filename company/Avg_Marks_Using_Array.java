package com.company;

import java.util.Scanner;

public class Avg_Marks_Using_Array {
    public static void main(String[] args) {

        int [] marks = new int[50];

        Scanner sc  = new Scanner(System.in);

        System.out.println("-->Enter the number of student");
        int a = sc.nextInt();
        System.out.println("--->Enter marks of students :");
        for(int i=1;i<=a;i++)
        {
            System.out.println("->Student "+ i);
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("-->displaying marks of the students");
        for(int i=1;i<=a;i++)
        {
            System.out.println("->Student "+ marks[i]);
           sum  = sum+marks[i];
        }

        float avg;
        avg = (float)sum/(float)a;
        System.out.println("-->Average marks of the class is "+ avg);
    }
}
