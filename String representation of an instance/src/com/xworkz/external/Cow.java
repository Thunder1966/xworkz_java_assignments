package com.xworkz.external;

import com.xworkz.internal.Animal;

public class Cow extends Animal {
    private String name;
    private String weight;
    private String color;
    public Cow(String name,String weight,String color){
        this.name=name;
        this.color=color;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 794613;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Cow){
                Cow cow=this;
                Cow cow1=(Cow) obj;
                if (cow1.name.equals(cow.name) ){
                    return true;
                }
            }
        }
        return false;
    }
}
