package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;
import javafx.scene.control.Tab;

public class Tablet extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public Tablet(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 15987;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Tablet){
                Tablet tablet=this;
                Tablet tablet1=(Tablet) obj;
                if (tablet1.name.equals(tablet.name) && tablet1.quantity==tablet.quantity && tablet1.price==tablet.price){
                    return true;
                }
            }
        }
        return false;
    }
}
