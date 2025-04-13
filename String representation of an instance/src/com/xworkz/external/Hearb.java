package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Hearb extends Plant {
    private String name;
    private String type;
    private String location;
    public Hearb(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Hearb{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 25425;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Hearb){
                Hearb hearb=this;
                Hearb hearb1=(Hearb) obj;
                if (hearb1.location.equals(hearb.location) && hearb1.type.equals(hearb.type) && hearb1.name.equals(hearb.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
