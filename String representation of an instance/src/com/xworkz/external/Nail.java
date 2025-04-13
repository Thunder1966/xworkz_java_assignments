package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Nail extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Nail(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Nail{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 741259;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Nail){
                Nail nail=this;
                Nail nail1=(Nail) obj;
                if (nail1.name.equals(nail.name) && nail1.type.equals(nail.type) && nail1.quantity==nail.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
