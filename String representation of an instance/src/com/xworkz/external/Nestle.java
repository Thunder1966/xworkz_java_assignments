package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Nestle extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Nestle(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 802;
    }
    @Override
    public String toString() {
        return "Ferrero{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}
