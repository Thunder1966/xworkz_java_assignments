package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class Router extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public Router(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Router{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 21458;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Router){
                Router router=this;
                Router router1=(Router) obj;
                if (router1.name.equals(router.name) && router1.quantity==router.quantity && router1.price==router.price){
                    return true;
                }
            }
        }
        return false;
    }
}
