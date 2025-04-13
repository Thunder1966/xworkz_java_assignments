package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Beauty extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Beauty(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Beauty{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 10890;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Beauty){
                Beauty beauty=this;
                Beauty beauty1=(Beauty) obj;
                if (beauty1.name.equals(beauty.name) && beauty1.expireDate==beauty.expireDate && beauty1.quantity==beauty.quantity){
                    return true;
                }

            }
        }
        return false;
    }
}
