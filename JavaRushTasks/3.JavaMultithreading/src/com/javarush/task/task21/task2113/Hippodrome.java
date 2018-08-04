package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Egor on 10.06.2017.
 */
public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses){
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move(){
        for (int i = 0; i < horses.size(); i++){
            horses.get(i).move();
        }
    }

    void print(){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        for (int i = 0; i < 10; i++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse winner = null;
        double max = 0;
        for (Horse horse : horses){
            if (horse.getDistance() > max){
                max = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }
    public void printWinner(){
        Horse winner = getWinner();
        System.out.println("Winner is " + winner.getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {

        game = new Hippodrome(new ArrayList<>());
        Horse horse1 = new Horse("Troyan", 3, 0);
        Horse horse2 = new Horse("Tristan", 3, 0);
        Horse horse3 = new Horse("Fantom", 3, 0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();

        game.printWinner();



    }
}
