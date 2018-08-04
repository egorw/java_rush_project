package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        BufferedReader br = new BufferedReader(new FileReader(f1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
        while (br.ready()){
            String str = br.readLine();
            str = str.replaceAll("\\p{Punct}", "");
            str = str.replaceAll("\n", "") + " ";
            bw.write(str);

        }
        reader.close();
        br.close();
        bw.close();

    }
}
