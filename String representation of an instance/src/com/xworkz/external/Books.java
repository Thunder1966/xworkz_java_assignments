package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Books extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Books(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 849;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Books){
                Books books=this;
                Books books1=(Books) obj;
                if (books1.name.equals(books.name) && books1.expireDate==books.expireDate && books1.quantity==books.quantity){
                    return true;
                }

            }
        }
        return false;
    }
}
