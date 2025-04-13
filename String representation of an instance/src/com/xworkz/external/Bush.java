package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Bush extends Plant {
    private String name;
    private String type;
    private String location;
    public Bush(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 54984;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Bush){
                Bush bush=this;
                Bush bush1=(Bush) obj;
                if (bush1.location.equals(bush.location) && bush1.type.equals(bush.type) && bush1.name.equals(bush.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
