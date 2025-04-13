package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Ship extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Ship(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 47545;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Ship){
                System.out.println("is instance of Air jordan");
                Ship ship =this;
                Ship ship1=(Ship) obj;
                if (Objects.equals(ship1.color, ship.color) && ship1.price==ship.price){
                    return true;
                }
            }
        }
        return false;
    }
}
