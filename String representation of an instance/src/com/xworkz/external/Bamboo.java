package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Bamboo extends Plant {
    private String name;
    private String type;
    private String location;
    public Bamboo(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Bamboo{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 46;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Bamboo){
                Bamboo bamboo=this;
                Bamboo bamboo1=(Bamboo) obj;
                if (bamboo1.location.equals(bamboo.location) && bamboo1.type.equals(bamboo.type) && bamboo1.name.equals(bamboo.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
