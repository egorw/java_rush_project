package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

  /*     String fileName = args[1];
        String fileOutputName = args[2];
        try {
            crypt(fileName, fileOutputName);
        } catch (Exception e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }


    public static void crypt(String f1, String f2) throws IOException {
        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out = new FileOutputStream(f2);
        while (in.available() > 0) {
            int data = in.read();
            out.write(data^5);
        }
        in.close();
        out.close();
    }
} */


        String key = args[0];
        String inFileName = args[1];
        String outFileName = args[2];

        FileInputStream fin = new FileInputStream(inFileName);
        byte[] inFileBytes = new byte[fin.available()];
        fin.read(inFileBytes);
        fin.close();

        if ("-e".equals(key)) {
            for (int i = 0; i < inFileBytes.length; i++) {
                inFileBytes[i] = (byte) (inFileBytes[i] + 1);
            }
        } else if ("-d".equals(key)) {
            for (int i = 0; i < inFileBytes.length; i++) {
                inFileBytes[i] = (byte) (inFileBytes[i] - 1);
            }
        }

        FileOutputStream fout = new FileOutputStream(outFileName);
        fout.write(inFileBytes);
        fout.close();
    }
}

