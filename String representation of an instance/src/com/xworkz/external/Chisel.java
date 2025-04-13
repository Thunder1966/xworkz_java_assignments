package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Chisel extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Chisel(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Chisel{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 784512;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Chisel){
                Chisel chisel=this;
                Chisel chisel1=(Chisel) obj;
                if (chisel1.name.equals(chisel.name) && chisel1.type.equals(chisel.type) && chisel1.quantity==chisel.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
