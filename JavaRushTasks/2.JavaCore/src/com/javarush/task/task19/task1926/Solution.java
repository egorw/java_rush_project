package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader rd = new BufferedReader(new FileReader(reader.readLine()));

        while (rd.ready()){
            String str = rd.readLine();
            System.out.println(new StringBuffer(str).reverse().toString());
        }
        reader.close();
        rd.close();

    }
}
