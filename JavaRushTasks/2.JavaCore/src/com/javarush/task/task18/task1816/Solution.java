package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        int countAl = 0;
        FileInputStream in = new FileInputStream(args[0]);

        int a = 0;
        char[] angl = new char[52];
        for (int i = 0;i<26;i++){
            angl[i]= (char) (i+97);
        }
        for (int i = 26;i<52;i++){
            angl[i]= (char) (i+65-26);
        }
        while (in.available()>0){
            int data = in.read();
            for (int i = 0;i<angl.length;i++){
                if (data==angl[i])
                    a++;
            }
        }
        in.close();
        System.out.println(a);
    }
}
