package javabegin.oop.car;

import javabegin.oop.Engine;
import javabegin.oop.Transport;

public class Car extends Transport {

    private int number;
    private Engine engine;

    public final int wheelCount = 4;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(Engine engine) {
        this.engine =engine;
    }

    public Car() {
    }

    public Car(String name, String model, String color, int number, Engine engine) {
        super(name, model, color);
        this.number = number;
        this.engine = engine;
    }

    public Car(String name, String model, String color) {
        super(name, model, color);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void signal() {
        System.out.println(this.getName() + " signal");
    }

    @Override
    public void drive() {
        super.drive(); // если нам нужно вызвать родительский функционал

        System.out.println(this.getName() + " Car drive");
    }

}
