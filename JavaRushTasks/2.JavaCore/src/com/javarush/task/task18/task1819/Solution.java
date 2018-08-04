package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream in1 = new FileInputStream(file1);
        FileInputStream in2 = new FileInputStream(file2);


        byte[] buffer1 = new byte[in1.available()];
        in1.read(buffer1);
        //in1.close();

        byte[] buffer2 = new byte[in2.available()];
        in2.read(buffer2);
        //in2.close();

        FileOutputStream out1 = new FileOutputStream(file1);
        out1.write(buffer2);
        //out1.close();

        out1.write(buffer1);

        out1.close();
        in1.close();
        in2.close();







    }
}
