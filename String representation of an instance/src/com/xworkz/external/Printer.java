package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class Printer extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public Printer(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 12459;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Printer){
                Printer printer=this;
                Printer printer1=(Printer) obj;
                if (printer1.name.equals(printer.name) && printer1.quantity==printer.quantity && printer1.price==printer.price){
                    return true;
                }
            }
        }
        return false;
    }
}
