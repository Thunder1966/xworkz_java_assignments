package com.xworkz.external;

import java.util.Objects;

public class Tshirt {
    private String brand;
    private int price;
    private int size;

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }




        public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Tshirt){
                Tshirt tshirt1=this;
                Tshirt tshirt2=(Tshirt) obj;
                if (tshirt1.size==tshirt2.size && tshirt1.price==tshirt2.price){

                    return true;

                }
            }
        }
        return false;
    }



    public void compare(){
        String name="harsha";
        String name2=new String("harsha");

        System.out.println(name==name2);//false
        boolean yes=name.equals(name2);//true
        System.out.println(yes);
    }



}
