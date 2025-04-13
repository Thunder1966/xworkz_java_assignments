package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Drill extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Drill(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Drill{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 85274;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Drill){
                Drill drill=this;
                Drill drill1=(Drill) obj;
                if (drill1.name.equals(drill.name) && drill1.type.equals(drill.type) && drill1.quantity==drill.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
