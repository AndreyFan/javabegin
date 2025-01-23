package javabegin.oop.car;

public class BMV extends Car{

    public BMV() {
    }

    public BMV(String name, String model, String color) {
        super(name, model, color);
    }

    @Override
    public void drive(){
        System.out.println("----drive BMV-----");
        super.signal();
        super.drive();
        System.out.println("drive BMV");
    }
}
