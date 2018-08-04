package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out = new FileOutputStream(f2);

        byte[] buffer = new byte[in.available()];

        for(int i = in.read(buffer); i > 0; i--)
            out.write(buffer[i-1]);
        in.close();
        out.close();
    }
}
