package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Ambulance extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Ambulance(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 97;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Ambulance){
                System.out.println("is instance of Air jordan");
                Ambulance ambulance =this;
                Ambulance ambulance1=(Ambulance) obj;
                if (Objects.equals(ambulance1.color, ambulance.color) && ambulance1.price==ambulance.price){
                    return true;
                }
            }
        }
        return false;
    }
}
