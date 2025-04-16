package com.xworkz.internal;

public class FanImpl implements Fan {
    public void turnOn() {
        System.out.println("overriding");
    }
    public void turnOff() {}
    public void changeSpeed() {}
}
