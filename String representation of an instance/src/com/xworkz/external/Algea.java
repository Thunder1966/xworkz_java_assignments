package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Algea extends Plant {
    private String name;
    private String type;
    private String location;
    public Algea(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Algea{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 98;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            if (obj instanceof Algea){
                Algea algea=this;
                Algea algea1=(Algea) obj;
                if (algea.location.equals(algea1.location) && algea1.type.equals(algea.type) && algea1.name.equals(algea.name)){
                    return  true;
                }
            }
        }
        return false;
    }
}
