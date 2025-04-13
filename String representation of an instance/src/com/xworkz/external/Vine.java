package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Vine extends Plant {
    private String name;
    private String type;
    private String location;
    public Vine(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Vine{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 12548;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Vine){
                Vine vine=this;
                Vine vine1=(Vine) obj;
                if (vine1.location.equals(vine.location) && vine1.type.equals(vine.type) && vine1.name.equals(vine.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
