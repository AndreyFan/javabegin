package javabegin.oop.motorbike;

import javabegin.oop.motorbike.Motorbike;

public class Ural extends Motorbike {
    private boolean firstAidKit;

    public Ural(Double volume, int wheelCount, boolean firstAidKit) {
        super(volume, wheelCount);
        this.firstAidKit = firstAidKit;
    }

    public boolean isFirstAidKit() {
        return firstAidKit;
    }

    public void setFirstAidKit(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public void showInfo(){
        System.out.println("name: " + this.getName()+ "  isFirstAidKit: "+ this.isFirstAidKit());
    }
}
