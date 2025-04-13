package com.xworkz.external;

import com.xworkz.internal.Brand;

public class Asian extends Brand {
    private String branName;
    private int ratings;
    private int value;

    public Asian(String branName,int ratings,int value){

        this.branName=branName;
        this.ratings=ratings;
        this.value=value;
    }

    @Override
    public String toString() {
        return "Asian{" +
                "branName='" + branName + '\'' +
                ", ratings=" + ratings +
                ", value=" + value +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 789;
    }
}
