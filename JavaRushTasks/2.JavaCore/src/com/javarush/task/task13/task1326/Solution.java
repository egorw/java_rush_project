package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
    /*    // напишите тут ваш код
        // "C:/Users/Egor/Desktop/Ch.txt"
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        BufferedReader is = new BufferedReader(new FileReader(name));
        ArrayList<Integer> chet = new ArrayList<Integer>();
        while (is.ready()) {
            String data = is.readLine();
            int n = Integer.parseInt(data);
            if (n%2==0) chet.add(n);
        }
        reader.close();
        is.close();


        sort(chet);

        for (int n : chet) {
            System.out.println(n);
        }
    }

        public static void sort(ArrayList<Integer> list) {
                for (int i = 0; i < list.size() - 1; i++) {
                    for (int j = 0; j < list.size() - 1 - i; j++) {
                        if (list.get(j) > list.get(j + 1)) {
                            int tmp = list.get(j);
                            list.set(j, list.get(j + 1));
                            list.set(j + 1, tmp);
                        }
                    }
                }*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt())
        {
            int data = scanner.nextInt();
            if (data % 2 == 0)
            {
                list.add(data);
            }
        }
        scanner.close();
        reader.close();

        Collections.sort(list);

        for (int as : list)
            if (as % 2 == 0)
                System.out.println(as);

            }


        }




