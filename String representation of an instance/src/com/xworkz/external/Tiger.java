package com.xworkz.external;

import com.xworkz.internal.Animal;

public class Tiger extends Animal {
    private String name;
    private String weight;
    private String color;
    public Tiger(String name,String weight,String color){
        this.name=name;
        this.color=color;
        this.weight=weight;
    }
    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 15964;
    }


}
