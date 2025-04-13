package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Car extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Car(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 651951;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Bike){
                System.out.println("is instance of Air jordan");
                Car car =this;
                Car car1=(Car) obj;
                if (Objects.equals(car1.color, car.color) && car1.price==car.price){
                    return true;
                }
            }
        }
        return false;
    }
}
