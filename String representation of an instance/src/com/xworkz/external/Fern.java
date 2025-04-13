package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Fern extends Plant {
    private String name;
    private String type;
    private String location;
    public Fern(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Fern{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 74185;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Fern){
                Fern fern=this;
                Fern fern1=(Fern) obj;
                if (fern1.location.equals(fern.location) && fern1.type.equals(fern.type) && fern1.name.equals(fern.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
