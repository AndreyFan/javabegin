package javabegin.oop;

public class Transport {
    private String name;
    private String model;
    private String color;
    public final static int year= 2_000;


    public Transport() {
    }

    public Transport(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive() {
        System.out.println(name + " drive transport ");
    }

    public void stop() {
        System.out.println(name + " stop transport");
    }

    public static String formatText(String text){
        return text  + " !!! " + year;
    }


}
