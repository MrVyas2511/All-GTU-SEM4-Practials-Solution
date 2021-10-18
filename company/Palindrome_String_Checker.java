package com.company;

import java.util.Scanner;

class Palindrome_String_Checker{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--->Enter the string : ");
        String  s = sc.next();

        int i = 0;
        int j = s.length() - 1;

        int flag = 0;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println("!!!String "+ s + " is NOT Palindrome");
                flag = 1;
                break;
            }
            i++;
            j--;
        }
        if(flag == 0)
            System.out.println("String " + s + " is Palindrome");



    }
}
