package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Wrench extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Wrench(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Wrench{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 135985;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Wrench){
                Wrench wrench=this;
                Wrench wrench1=(Wrench) obj;
                if (wrench1.name.equals(wrench.name) && wrench1.type.equals(wrench.type) && wrench1.quantity==wrench.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
