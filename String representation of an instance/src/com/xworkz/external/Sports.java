package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Sports extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Sports(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 78964;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Sports){
                Sports sports=this;
                Sports sports1=(Sports) obj;
                if (sports1.name.equals(sports.name) && sports1.expireDate==sports.expireDate && sports1.quantity==sports.quantity){
                    return true;
                }

            }
        }
        return false;
    }
}
