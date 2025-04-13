package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Scooter extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Scooter(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 115851;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Scooter){
                System.out.println("is instance of Air jordan");
                Scooter scooter =this;
                Scooter scooter1=(Scooter) obj;
                if (Objects.equals(scooter1.color, scooter.color) && scooter1.price==scooter.price){
                    return true;
                }
            }
        }
        return false;
    }
}
