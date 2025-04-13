package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Bike extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Bike(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 997;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Bike){
                System.out.println("is instance of Air jordan");
                Bike bike =this;
                Bike bike1=(Bike) obj;
                if (Objects.equals(bike.color, bike1.color) && bike1.price==bike.price){
                    return true;
                }
            }
        }
        return false;
    }
}
