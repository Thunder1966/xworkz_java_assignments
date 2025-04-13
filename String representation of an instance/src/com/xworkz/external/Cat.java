package com.xworkz.external;

import com.xworkz.internal.Animal;

public class Cat extends Animal {
    private String name;
    private String weight;
    private String color;
    public Cat(String name,String weight,String color){
        this.name=name;
        this.color=color;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 84512;
    }
}
