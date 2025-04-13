package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Grocery extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Grocery(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 1254;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Grocery){
                Grocery grocery=this;
                Grocery grocery1=(Grocery) obj;
                if (grocery1.name.equals(grocery.name) && grocery1.expireDate==grocery.expireDate && grocery1.quantity==grocery.quantity){
                    return true;
                }

            }
        }
        return false;
    }
}
