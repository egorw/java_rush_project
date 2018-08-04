package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in;
        String files;

        while (true){
            files = reader.readLine();
            try
            {
                in = new FileInputStream(files);
                in.close();
            }

            catch (FileNotFoundException e)
            {
                System.out.println(files);
                reader.close();
                break;
            }
        }
    }
}
