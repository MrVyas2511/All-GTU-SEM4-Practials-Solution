package com.company;

import java.util.Scanner;

public class Hex2Dec {

    static int hexChartodec(char x) {

        if(x >= 'A')
            return x-55;
        else
            return x-48;
    }
    static double Hex2dec(String x)
    {
        double dec = 0;

        for(int i=x.length()-1; i>=0 ;i--) {
            char hexchar =   (x.charAt(i));

            double pow = Math.pow(16, (x.length() - i-1));

            int hexdec = hexChartodec(hexchar);
            System.out.print(hexdec+"*"+pow + "+" );
            dec =  (hexdec * pow + dec);

        }
        System.out.println("A");
        return dec;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--> Enter the Hexadecimal String (0-9 + A-F only):");
        String Hex  =  sc.nextLine();
        System.out.println("--> Hexadecimal to Decimal conversion :");
        System.out.println(Hex2dec(Hex));
    }
}
