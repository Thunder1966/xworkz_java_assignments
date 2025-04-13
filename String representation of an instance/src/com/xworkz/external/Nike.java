package com.xworkz.external;

import com.xworkz.internal.Brand;

public class Nike extends Brand {

    private String branName;
    private int ratings;
    private int value;

    public Nike(String branName,int ratings,int value){

        this.branName=branName;
        this.ratings=ratings;
        this.value=value;
    }

    @Override
    public String toString() {
        return "Brand name:"+this.branName+" Ratings" +this.ratings+"Value"+this.value;
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 74589;
    }
}
