package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class String_Methods {

    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string");
        String a  = sc.nextLine();
        System.out.println(a);

        System.out.println("-->String into lower case");
        System.out.println(a.toLowerCase(Locale.ROOT));

        System.out.println("-->String into Upper case");
        System.out.println(a.toUpperCase(Locale.ROOT));

        System.out.println("-->Replace space with Underscore");
        System.out.println(a.replace(" ","_"));

        System.out.println("-->Find the double space in string");
        System.out.println(a.indexOf("  "));

        System.out.println("-->Length of string");
        System.out.println(a.length());

        System.out.println("-->replace word");
        System.out.println(a.replace("Divyesh","vyas"));

        System.out.println("-->print substring");
        System.out.println(a.substring(8));

        System.out.println("-->print substring");
        System.out.println(a.substring(4,8));

        System.out.println("-->testing starting and ending latters");
        System.out.println(a.startsWith("D"));
        System.out.println(a.endsWith("D"));

     }
}