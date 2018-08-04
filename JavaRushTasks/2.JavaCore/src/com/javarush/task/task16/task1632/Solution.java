package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }

    public static class Thread1 extends Thread{

        @Override
        public void run() {

            while (true){
                try {
                    Thread.sleep(10000);
                    System.out.println("Boom");
                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }
            }


        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {
            boolean isTrue = false;
            int count = 0;
            while (!isTrue){
                try {
                    Thread.sleep(3000);
                    count ++;
                    if (count == 3) {
                        throw new  InterruptedException();
                    }
                }
                catch (InterruptedException e)
                {
                    System.out.println("InterruptedException");
                }

            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true){
                try {

                    System.out.println("Ура!");
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message{


        @Override
        public void showWarning() {

            this.interrupt();

            try {
                this.join();
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }

        @Override
        public void run() {

        }
    }
    public static class Thread5 extends Thread
    {
        public void run()
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            int result = 0;
            try
            {
                while (!(input = reader.readLine()).equals("N"))
                {
                    try
                    {
                        result += Integer.parseInt(input);
                    } catch (NumberFormatException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println(result);
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }




    public static void main(String[] args) {
        threads.get(0).start();
        threads.get(1).start();
        threads.get(2).start();
        threads.get(3).start();
        threads.get(4).start();

    }
}