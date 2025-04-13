package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Bus extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Bus(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 5184;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Bus){
                System.out.println("is instance of Air jordan");
                Bus bus =this;
                Bus bus1=(Bus) obj;
                if (Objects.equals(bus.color, bus.color) && bus1.price==bus.price){
                    return true;
                }
            }
        }
        return false;
    }
}
