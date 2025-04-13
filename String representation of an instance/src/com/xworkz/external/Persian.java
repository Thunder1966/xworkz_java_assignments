package com.xworkz.external;

import com.xworkz.internal.Cat;

public class Persian extends Cat {
    private String name;
    private int age;
    private int weight;
    public Persian(String name,int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Persian{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 145896;
    }
}
