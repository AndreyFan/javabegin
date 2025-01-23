package javabegin.oop.motorbike;

import javabegin.oop.Transport;

public class Motorbike extends Transport {
    private Double volume;
    public final int wheelCount;


    public Motorbike(Double volume, int wheelCount) {
        this.volume = volume;
        this.wheelCount = wheelCount;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
