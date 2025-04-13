package com.xworkz.internal;
public class Tshirt {
    private String Brand;
    private int size;
    private String color;

    public Tshirt(){
        System.out.println("no arg constructor");

    }
    public void setBrand(String Brand){
        this.Brand=Brand;

    }
    public void setsize(int size){
        this.size=size;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public String getBrand(){
        return Brand;
    }
    public int getsize(){
        return size;
    }
    public String getColor(){
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tshirt tshirt = (Tshirt) o;
        return size == tshirt.size && Objects.equals(Brand, tshirt.Brand) && Objects.equals(color, tshirt.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Brand, size, color);
    }
}