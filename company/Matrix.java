package com.company;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Let's create a (m x n) matrix---");
        System.out.println("-----------------------------------");
        System.out.println("->Enter the size of column(m) :-");
        int m = sc.nextInt();

        System.out.println("->Enter the size of the row(n) :-");
        int n = sc.nextInt();

        int [][] matrix = new int[100][100];
        System.out.println("->Enter the value for matrix :");
        for(int i = 1 ; i <= n ; i++)
            for(int j = 1 ; j <= m ; j++)
            {
                System.out.println("->matrix["+i+"]["+j+"]");
                matrix[i][j] = sc.nextInt();
            }
        System.out.println("->Displaying matrix ");
        for(int i = 1 ; i <= n ; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("");
        }

    }
}
