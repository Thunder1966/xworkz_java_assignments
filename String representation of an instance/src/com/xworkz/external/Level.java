package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Level extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Level(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Level{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 248996;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Chisel){
                Level level=this;
                Level level1=(Level) obj;
                if (level1.name.equals(level.name) && level1.type.equals(level.type) && level1.quantity==level.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
