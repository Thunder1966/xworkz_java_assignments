package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Airplane extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Airplane(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 99;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Airplane){
                System.out.println("is instance of Air jordan");
                Airplane airplane =this;
                Airplane airplane1=(Airplane) obj;
                if (Objects.equals(airplane.color, airplane1.color) && airplane1.price==airplane.price){
                    return true;
                }
            }
        }
        return false;
    }
}
