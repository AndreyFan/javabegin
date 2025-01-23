package javabegin.oop;
import javabegin.oop.car.BMV;
import javabegin.oop.car.Car;
import javabegin.oop.car.Toyota;
import javabegin.oop.motorbike.Kawasaki;


public class Main {
    public static void main(String[] args) {

        Toyota toyota= new Toyota();

        BMV bmv= new BMV();
        System.out.println("bmv.wheelCount = " + bmv.wheelCount);

        System.out.println(toyota.formatText("toyota"));
        System.out.println("----------------------------");
        System.out.println(Car.formatText("car "));

        Kawasaki kawasaki= new Kawasaki(1400.00, 2);
        System.out.println(kawasaki.wheelCount);
    }
}