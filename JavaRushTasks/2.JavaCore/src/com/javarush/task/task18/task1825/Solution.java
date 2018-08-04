package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        //File file;
        String files;

        while (!(files = reader.readLine()).equals("end")){
            //files =reader.readLine();
            //file = new File(files);
            list.add(files);
        }

        reader.close();
        Collections.sort(list);

        String[] str  = list.get(0).split(".txt");
        String result = str[0];

        FileInputStream in;
        FileOutputStream out = new FileOutputStream(result,true);

        for (String s : list){
            in = new FileInputStream(s);
            byte[] buff = new byte[in.available()];
            in.read(buff);
            out.write(buff);
            in.close();
        }


        out.close();

    }
}
