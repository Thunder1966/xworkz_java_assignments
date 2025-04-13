package com.xworkz.external;

import com.xworkz.internal.Brand;

public class AirJordan extends Brand {
    private String branName;
    private int ratings;
    private int value;

    public AirJordan(String branName,int ratings,int value){

        this.branName=branName;
        this.ratings=ratings;
        this.value=value;
    }

    @Override
    public String toString() {
        return "AirJordan{" +
                "branName='" + branName + '\'' +
                ", ratings=" + ratings +
                ", value=" + value +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj !=null){
            System.out.println("not null");
            if (obj instanceof AirJordan){
                System.out.println("is instance of Air jordan");
                AirJordan airJordan =this;
                AirJordan airJordan1=(AirJordan) obj;
                if (airJordan1.ratings==airJordan.ratings && airJordan1.value==airJordan.value){
                    return true;
                }
            }
        }
        return false;
    }
}
