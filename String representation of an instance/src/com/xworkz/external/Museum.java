package com.xworkz.external;

import com.xworkz.internal.Building;

public class Museum extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Museum(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 951;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!= null){
            if (obj instanceof Museum){
                Museum museum=this;
                Museum museum1=(Museum) obj;
                if (museum1.name.equals(museum.name) && museum1.location.equals(museum.location) && museum1.noOfRooms==museum.noOfRooms){
                    return true;
                }
            }
        }
        return false;
    }
}
