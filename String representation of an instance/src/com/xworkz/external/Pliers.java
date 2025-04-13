package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Pliers extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Pliers(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Pliers{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }@Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 458796;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Pliers){
                Pliers pliers=this;
                Pliers pliers1=(Pliers) obj;
                if (pliers1.name.equals(pliers.name) && pliers1.type.equals(pliers.type) && pliers1.quantity==pliers.quantity){
                    return true;
                }
            }
        }
        return false;
    }

}
