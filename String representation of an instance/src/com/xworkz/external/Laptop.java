package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class Laptop extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public Laptop(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 12548;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Laptop){
                Laptop laptop=this;
                Laptop laptop1=(Laptop) obj;
                if (laptop1.name.equals(laptop.name) && laptop1.quantity==laptop.quantity && laptop1.price==laptop.price){
                    return true;
                }
            }
        }
        return false;
    }
}
