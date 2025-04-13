package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Hammer extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Hammer(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 5852;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Hammer){
                Hammer hammer=this;
                Hammer hammer1=(Hammer) obj;
                if (hammer1.name.equals(hammer.name) && hammer1.type.equals(hammer.type) && hammer1.quantity==hammer.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
