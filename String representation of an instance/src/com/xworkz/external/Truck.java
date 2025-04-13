package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Truck extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Truck(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 325698;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Truck){
                System.out.println("is instance of Air jordan");
                Truck truck =this;
                Truck truck1=(Truck) obj;
                if (Objects.equals(truck.color, truck1.color) && truck1.price==truck.price){
                    return true;
                }
            }
        }
        return false;
    }
}
