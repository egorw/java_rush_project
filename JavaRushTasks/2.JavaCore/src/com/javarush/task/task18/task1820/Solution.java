package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/



import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out = new FileOutputStream(f2);

        //создаем буфер, в который помещаем содержимое первого файла
        byte[] buffer = new byte[in.available()];
        in.read(buffer);

        out.write(calculate(buffer));

        in.close();
        out.close();

    }

    private static byte[] calculate(byte[] buff) {

        StringBuilder s = new StringBuilder();
        //создаем массив, заполняем его данными из буфера, используя в качестве разделителя пробелы
        String[] ar = new String(buff).split(" ");
        //создаем массив для результатов
        byte[] result;
        //создаем временный массив для вычислений,
        long[] temp = new long[ar.length];

        //округляем каждый элемент массива ar и записываем его во временный массив
        for (int i = 0; i < ar.length; i++) {
            temp[i] = Math.round(Double.valueOf(ar[i]));
        }

        //добавляем пробелы
        for(long i : temp) {
            s.append(i);
            s.append(" ");
        }

        result = s.toString().getBytes();


        return result;
    }
}
