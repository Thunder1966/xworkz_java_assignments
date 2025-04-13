package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Electronics extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Electronics(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 794613794;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Electronics){
                Electronics electronics=this;
                Electronics electronics1=(Electronics) obj;
                if (electronics1.name.equals(electronics.name) && electronics1.expireDate==electronics.expireDate && electronics1.quantity==electronics.quantity){
                    return true;
                }

            }
        }
        return false;
    }
}
