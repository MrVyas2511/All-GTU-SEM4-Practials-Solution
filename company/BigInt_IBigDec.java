package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInt_IBigDec {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("100000000000");
        BigInteger j = new BigInteger("2345654345");
        System.out.println(i.multiply(j));
        System.out.println(i.divide(j));

        BigDecimal a = new BigDecimal("100000000000");
        BigDecimal b = new BigDecimal("2345654345");
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b,5,BigDecimal.ROUND_UP));
    }
}
