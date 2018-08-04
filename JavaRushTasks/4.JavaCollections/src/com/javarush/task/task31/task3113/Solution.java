package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;

/* 
Что внутри папки?
*/
public class Solution {
    public static long countFile = 0;
    public static long countDirectory = 0;
    public static long countSize = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        Path path = Paths.get(fileName);
        if (!Files.isDirectory(path)){
            System.out.printf(path.toAbsolutePath().toString() + " - не папка");
            return;
        }
        Files.walkFileTree(path, new Visitior());

        System.out.println("Всего папок - " + (countDirectory-1));
        System.out.println("Всего файлов - " + countFile);
        System.out.println("Общий размер - " + countSize);

    }

    private static class Visitior extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            countDirectory += 1;
            return CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            countFile += 1;
            countSize = countSize + attrs.size();
            return CONTINUE;
        }
    }
}
