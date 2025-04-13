package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Moss extends Plant {
    private String name;
    private String type;
    private String location;
    public Moss(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Moss{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 12324;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Moss){
                Moss moss=this;
                Moss moss1=(Moss) obj;
                if (moss.location.equals(moss1.location) && moss1.type.equals(moss.type) && moss1.name.equals(moss.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
