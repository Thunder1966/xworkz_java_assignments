package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class Console extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public Console(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Console{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 794613;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Console){
                Console console=this;
                Console console1=(Console) obj;
                if (console1.name.equals(console.name) && console1.quantity==console.quantity && console1.price==console.price){
                    return true;
                }
            }
        }
        return false;
    }
}
