package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            while (true){
                String s = reader.readLine();
                if (s == null) break;
                lines.add(s);
            }
            } catch (IOException e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
