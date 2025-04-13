package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Clothing extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Clothing(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 794613;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Clothing){
                Clothing clothing=this;
                Clothing clothing1=(Clothing) obj;
                if (clothing1.name.equals(clothing.name) && clothing1.expireDate==clothing.expireDate && clothing1.quantity==clothing.quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
