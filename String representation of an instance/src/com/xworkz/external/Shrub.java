package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Shrub extends Plant {
    private String name;
    private String type;
    private String location;
    public Shrub(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Shrub{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 458445;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Bamboo){
                Shrub shrub=this;
                Shrub shrub1=(Shrub) obj;
                if (shrub1.location.equals(shrub.location) && shrub1.type.equals(shrub.type) && shrub1.name.equals(shrub.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
