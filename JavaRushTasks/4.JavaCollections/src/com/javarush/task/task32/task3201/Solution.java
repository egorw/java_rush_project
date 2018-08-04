package com.javarush.task.task32.task3201;


import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];

        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            if (raf.length() < number) {
                raf.seek(raf.length());
                raf.write(text.getBytes());
            }else{
                raf.seek(number);
                raf.write(text.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
