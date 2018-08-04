package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        /*
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        String goodID = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        boolean isFind = false;
        String goodString = reader.readLine();

        while ( (goodString != null && goodString.length() > 0) && !isFind ) {
            String[] values = goodString.split(" ");
            if (values.length > 0) {
                String id = values[0];
                if ( id.equals(goodID) ) {
                    isFind = true;
                    System.out.println(goodString);
                }
            }
            goodString = reader.readLine();
        }
        console.close();
        reader.close();
    }
}
         */

        //Программа запускается с одним параметром: id (int).
        int id = Integer.parseInt(args[0]);
        //Считать с консоли имя файла.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        reader.close();
        //Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
        BufferedReader br = new BufferedReader(new FileReader(path));
        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
            if (id == Integer.parseInt(s.split(" ")[0])) {
                System.out.println(s);
                br.close();
                break;
            }
        }
    }
}


