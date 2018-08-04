package com.javarush.task.task14.task1408;

/**
 * Created by Egor on 27.02.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 100500;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
