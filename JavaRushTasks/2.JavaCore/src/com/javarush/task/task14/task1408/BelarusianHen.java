package com.javarush.task.task14.task1408;

/**
 * Created by Egor on 27.02.2017.
 */
public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 40;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - "+ Country.BELARUS+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
