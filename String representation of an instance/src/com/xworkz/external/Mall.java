package com.xworkz.external;

import com.xworkz.internal.Building;

public class Mall extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Mall(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Mall{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 12458;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Mall){
                Mall mall=this;
                Mall mall1=(Mall) obj;
                if (mall1.name.equals(mall.name) && mall1.location.equals(mall.location) && mall1.noOfRooms==mall.noOfRooms){
                    return true;
                }
            }
        }
        return false;
    }
}
