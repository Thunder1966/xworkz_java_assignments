package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Cactus extends Plant {
    private String name;
    private String type;
    private String location;
    public Cactus(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 46185;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Cactus){
                Cactus cactus=this;
                Cactus cactus1=(Cactus) obj;
                if (cactus1.location.equals(cactus.location) && cactus1.type.equals(cactus.type) && cactus1.name.equals(cactus.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
