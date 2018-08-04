package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {

        StringWriter sw = new StringWriter();
        if (is == null) return new StringWriter();
        while (is.available() > 0){
            byte[] buf = new byte[1024];
            int lengh = is.read(buf);
            String str = new String(buf, 0, lengh);
            sw.append(str);
            sw.flush();
        }
        return sw;
    }
}