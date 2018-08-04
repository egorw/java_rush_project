package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
В метод main приходит список аргументов.
Первый аргумент — имя результирующего файла resultFileName, остальные аргументы — имена файлов fileNamePart.
Каждый файл (fileNamePart) — это кусочек zip архива. Нужно разархивировать целый файл, собрав его из кусочков.
Записать разархивированный файл в resultFileName.
Архив внутри может содержать файл большой длины, например, 50Mb.
Внутри архива может содержаться файл с любым именем.

Пример входных данных. Внутри архива находится один файл с именем abc.mp3:
C:/result.mp3
C:/pathToTest/test.zip.003
C:/pathToTest/test.zip.001
C:/pathToTest/test.zip.004
C:/pathToTest/test.zip.002
*/
public class Solution {
    public static void main(String[] args) {
        String resultFileName = args[0];
        String[] fileNameParts = new String[args.length - 1];
        System.arraycopy(args, 1, fileNameParts, 0, args.length - 1);

        Arrays.sort(fileNameParts);

        ArrayList<FileInputStream> streams = new ArrayList<>();
        for (String zip : fileNameParts) {
            try {
                streams.add(new FileInputStream(zip));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        try {
            ZipInputStream zipInput = new ZipInputStream(
                    new SequenceInputStream(Collections.enumeration(streams)));
            FileOutputStream fos = new FileOutputStream(new File(resultFileName));
            byte[] buff = new byte[1024 * 1024];
            ZipEntry zipEntry;
            while ((zipEntry = zipInput.getNextEntry()) != null) {
                int x;
                while ((x = zipInput.read(buff)) != -1) {
                    fos.write(buff, 0, x);
                    fos.flush();
                }
            }
            zipInput.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
