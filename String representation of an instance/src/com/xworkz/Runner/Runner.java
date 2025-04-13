package com.xworkz.runner;

import com.xworkz.external.Tshirt;

public class Runner {
    public static void main(String[] args) {
       Tshirt tshirt1=new Tshirt();
        tshirt1.setBrand("nike");
        tshirt1.setSize(42);
        tshirt1.setPrice(300);

        Tshirt tshirt2=new Tshirt();
        tshirt2.setBrand("xworkz");
        tshirt2.setSize(42);
        tshirt2.setPrice(300);


        System.out.println("both are equal :" + tshirt1.equals(tshirt2));
        tshirt1.compare();
    }
}
