package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Footwear extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Footwear(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Footwear{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 85251;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Footwear){
                Footwear footwear=this;
                Footwear footwear1=(Footwear) obj;
                if (footwear1.name.equals(footwear.name) && footwear1.expireDate==footwear.expireDate && footwear1.quantity==footwear.quantity){
                    return true;
                }

            }
        }
        return false;
    }
}
