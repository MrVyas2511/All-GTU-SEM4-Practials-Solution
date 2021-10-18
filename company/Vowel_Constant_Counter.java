package com.company;

import java.util.Scanner;

public class Vowel_Constant_Counter {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("-->Enter the string");
        String sr = s.nextLine();
        int j = 0;
        int vowel =0;
        int constant = 0;
        int Upper = 0;
        while(j!=sr.length()-1)
        {
            if((int)(sr.charAt(j)) > 65 && (int)(sr.charAt(j))<90)
                    Upper++;


            if (sr.charAt(j) == 'a'||sr.charAt(j) == 'e'||sr.charAt(j) == 'i'||sr.charAt(j) == 'o'||sr.charAt(j) == 'u')
            {
                vowel++;
            }
            else
                 constant ++;

            j++;
        }
        System.out.println("Number of vowel is "+ vowel +"  and constant is  "+ constant);
        System.out.println("Upper case latter in string is" + Upper);
    }
}
