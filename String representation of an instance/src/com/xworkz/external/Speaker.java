package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class Speaker extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public Speaker(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Speaker{" +
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
            if (obj instanceof Speaker){
                Speaker speaker=this;
                Speaker speaker1=(Speaker) obj;
                if (speaker1.name.equals(speaker.name) && speaker1.quantity==speaker.quantity && speaker1.price==speaker.price){
                    return true;
                }
            }
        }
        return false;
    }
}
