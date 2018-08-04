package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new  FileInputStream(reader.readLine());

        reader.close();

        int min = in.read();

        while(in.available() > 0) {
            int data = in.read();
            if(data < min) {
                min = data;
            }
        }
        in.close();

        System.out.println(min);



    }
}
