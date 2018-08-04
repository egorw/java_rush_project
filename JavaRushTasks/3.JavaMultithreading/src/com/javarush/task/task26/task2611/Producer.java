package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Egor on 01.10.2017.
 */
public class Producer implements Runnable{

    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map){
        this.map = map;
    }

    @Override
    public void run() {
        int count = 1;
        String str = "Some text for ";
        Thread currentThread = Thread.currentThread();
        try {
            while (!currentThread.isInterrupted()) {

                map.put(String.valueOf(count), str + count);
                Thread.sleep(500);
                count++;
            }

        }catch (InterruptedException e){
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}
