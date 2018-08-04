package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.io.IOException;

public class Restaurant {


    public static void main(String[] args) throws IOException {
        Tablet tablet = new Tablet(5);
        Cook firstCook = new Cook("Amigo");
        Waiter waiter = new Waiter();

        firstCook.addObserver(waiter);
        tablet.addObserver(firstCook);
        tablet.createOrder();

        DirectorTablet dt = new DirectorTablet();
        dt.printActiveVideoSet();
        dt.printAdvertisementProfit();
        dt.printCookWorkloading();
        dt.printArchivedVideoSet();

    }
}
