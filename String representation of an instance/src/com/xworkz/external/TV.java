package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class TV extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public TV(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 145785;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof TV){
                TV tv=this;
                TV tv1=(TV) obj;
                if (tv1.name.equals(tv.name) && tv1.quantity==tv.quantity && tv1.price==tv.price){
                    return true;
                }
            }
        }
        return false;
    }
}
