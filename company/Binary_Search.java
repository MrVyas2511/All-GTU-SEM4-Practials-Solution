package com.company;

import java.util.Scanner;

public class Binary_Search {

    static int BinarySearch(int[] list,int x) {
        int first = 0;
        int end;
        end = list.length - 1;

        while (end > first) {
            int mid = (first + end) / 2;
            if (list[mid] == x)
                return mid;
            else if (x > list[mid])
                first = mid + 1;
            else
                end = mid - 1;
        }
        return 1;
    }
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);

        System.out.println("--> Enter the value wanna search ");
        int a = sc.nextInt();

        System.out.println("GIVEN VALUE IS AT "+ BinarySearch(array,a)+"th position in array");
    }
}
