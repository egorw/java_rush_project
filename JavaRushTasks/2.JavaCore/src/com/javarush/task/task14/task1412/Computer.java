package com.javarush.task.task14.task1412;

/**
 * Created by Egor on 27.02.2017.
 */
public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;



    /*public Computer(Keyboard keyboard, Monitor monitor, Mouse mouse) {
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
        this.mouse = new Mouse();

    }*/

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;


    }

    /*public Computer(){
        this(new Keyboard(), new Monitor(), new Mouse());
    }*/

    public Keyboard getKeyboard() {
        return keyboard;
    }


    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }





}
