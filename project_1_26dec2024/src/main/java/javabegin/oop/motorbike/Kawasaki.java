package javabegin.oop.motorbike;

public class Kawasaki extends Motorbike {

    public Kawasaki(Double volume, int wheelCount) {
        super(volume, wheelCount);
    }

    public void jump() {
        System.out.println("Kawasaki jump");
    }
}
