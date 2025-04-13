package com.xworkz.external;

import com.xworkz.internal.Building;

public class SuperMarket extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public SuperMarket(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "SuperMarket{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 123658;
    }

}
