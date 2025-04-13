package com.xworkz.external;

import com.xworkz.internal.Building;

public class Office extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Office(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Office{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 46963;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Office){
                Office office=this;
                Office office1=(Office) obj;
                if (office1.name.equals(office.name) && office1.location.equals(office.location) && office.noOfRooms==office1.noOfRooms){
                    return true;
                }
            }
        }
        return false;
    }
}
