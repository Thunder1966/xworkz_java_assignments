package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Tractor extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Tractor(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 125648;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Tractor){
                System.out.println("is instance of Air jordan");
                Tractor tractor =this;
                Tractor tractor1=(Tractor) obj;
                if (Objects.equals(tractor.color, tractor1.color) && tractor1.price==tractor.price){
                    return true;
                }
            }
        }
        return false;
    }
}
