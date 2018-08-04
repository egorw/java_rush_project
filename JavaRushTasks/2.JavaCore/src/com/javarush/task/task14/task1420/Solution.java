package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n1 = Integer.parseInt(reader.readLine());
        if (n1 <= 0) {
            throw new NumberFormatException();
        }
        long n2 = Integer.parseInt(reader.readLine());
        if (n2 <= 0) {
            throw new NumberFormatException();
        }
        System.out.println(BigInteger.valueOf(n1).gcd(BigInteger.valueOf(n2)));
    }
}

