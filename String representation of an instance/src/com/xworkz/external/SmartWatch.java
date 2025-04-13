package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class SmartWatch extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public SmartWatch(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 54545785;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof SmartWatch){
                SmartWatch smartWatch=this;
                SmartWatch smartWatch1=(SmartWatch) obj;
                if (smartWatch1.name.equals(smartWatch.name) && smartWatch1.quantity==smartWatch.quantity && smartWatch1.price==smartWatch.price){
                    return true;
                }
            }
        }
        return false;
    }
}
