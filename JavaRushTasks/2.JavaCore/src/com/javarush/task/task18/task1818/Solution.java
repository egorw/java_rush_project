package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream in2 = new FileInputStream(file2);
        FileInputStream in3 = new FileInputStream(file3);

        byte[] buffer2 = new byte[in2.available()];
        in2.read(buffer2);
        byte[] buffer3 = new byte[in3.available()];
        in3.read(buffer3);

        FileOutputStream out1 = new FileOutputStream(file1);
        out1.write(buffer2);
        out1.write(buffer3);

        reader.close();

        out1.close();
        in2.close();
        in3.close();
    }
}
