package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reader.readLine())));
        while (true){
            String name = reader.readLine();
            writer.write(name);
            if (name.equals("exit")) break;
            writer.newLine();
        }
        writer.close();
        reader.close();
    }
}
