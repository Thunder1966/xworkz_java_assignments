package com.xworkz.external;

import com.xworkz.internal.Building;

public class House extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public House(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 54812;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof House){
                House house=this;
                House house1=(House) obj;
                if (house1.name.equals(house.name) && house1.location.equals(house.location) && house1.noOfRooms==house.noOfRooms){
                    return true;
                }
            }
        }
        return false;
    }
}
