package com.xworkz.external;

import com.xworkz.internal.Vehical;

import java.util.Objects;

public class Train extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Train(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Train{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 3598;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof Train){
                System.out.println("is instance of Air jordan");
                Train train =this;
                Train train1=(Train) obj;
                if (Objects.equals(train.color, train1.color) && train1.price==train.price){
                    return true;
                }
            }
        }
        return false;
    }
}
