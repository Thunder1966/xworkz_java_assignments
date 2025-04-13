package com.xworkz.external;

import com.xworkz.internal.Brand;

public class Zyadan extends Brand {
    private String branName;
    private int ratings;
    private int value;

    public Zyadan(String branName,int ratings,int value){

        this.branName=branName;
        this.ratings=ratings;
        this.value=value;
    }

    @Override
    public String toString() {
        return "Zyadan{" +
                "branName='" + branName + '\'' +
                ", ratings=" + ratings +
                ", value=" + value +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 789631;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if (obj instanceof Zyadan){
                Zyadan zyadan=this;
                Zyadan zyadan1=(Zyadan) obj;
                if (zyadan1.branName.equals(zyadan.branName) && zyadan1.value==zyadan.value && zyadan.ratings==zyadan1.ratings){
                    return true;
                }
            }
        }
        return false;
    }
}
