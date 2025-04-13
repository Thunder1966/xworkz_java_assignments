package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Saw extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Saw(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Saw{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 14855;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Saw){
                Saw saw=this;
                Saw saw1=(Saw) obj;
                if (saw1.name.equals(saw.name) && saw1.type.equals(saw.type) && saw1.quantity==saw.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
