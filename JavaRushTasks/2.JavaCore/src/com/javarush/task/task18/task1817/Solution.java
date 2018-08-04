package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream(args[0]);
         int countAll = 0;
         int countSpace = 0;

        while (in.available()>0) {
            int data = in.read();
            countAll++;
            if (data == 32)countSpace++;
        }

         in.close();

         float zp = (float)countSpace/countAll*100;
        System.out.println(String.format("%.2f", zp));



    }
}
